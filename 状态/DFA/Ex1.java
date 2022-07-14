package DFA;

import java.io.*;
import java.util.ArrayList;
 
public class Ex1 {
    public static String fileName="/home/lqc/文档/23pattern/状态/Anaycer/yyy.txt"; // 读入的文件
    public static String pathname = "./xxx.txt"; // 写入的文件路径和文件名
 
    static BufferedReader br;
    static BufferedWriter bw;
 
    public static int state = 0; // 记录DFA的状态
    public static ArrayList<String> result = new ArrayList<String>(); // 记录结果token
    public static ArrayList<String> error = new ArrayList<String>(); // 记录错误
 
    public static String info = ""; // 用于添加进result 或 error的基本单位
    public static String token = ""; // 记录输入的字符
    public static int lineNumber = 1; // 记录行号
 
    /**
     * 判断c是否是a-Z中的字母
     * @param c
     * @return
     */
    public static boolean isLetter(int c) {
        if ((c>=65&&c<=90)||(c>=97&&c<=122)) {
            if(state == 0 || state == 2) {
                token += (char)c;
            }
            return true;
        }
        else
            return false;
    }
 
    /**
     * 判断c是否是0-9中的数字
     * @param c
     * @return
     */
    public static boolean isDigit(int c)
    {
        if (c>=48&&c<=57) {
            if(state == 0 || state == 1 || state == 2) {
                token += (char)c;
            }
            return true;
        }
        else
            return false;
    }
    /**
     * 判断c是否是下划线_
     * @param c
     * @return
     */
    public static boolean isUnderline(int c)
    {
        if (c==95) {
            if(state == 2) {
                token += (char)c;
            }
            return true;
        }
        else
            return false;
    }
 
    /**
     * 判断c是否是符号
     * @param c
     * @return
     */
    public static boolean isSymbol(int c, BufferedReader br) throws IOException {
        if (c==91||c==93||c==123||c==125||c==59||c==61||c==60||c==33||(c>=40&&c<=45) || c==16) {
            if(state == 0) { // 上一状态是0
                token += (char) c;
                addInfo(); // 提交符号
            } else if(state == 1) { // 上一状态是1
                addInfo(); // 提交上一个状态的token，并清零
                token += (char) c;
                state = 0;
                addInfo(); // 提交符号
            } else if(state == 2) {
                addInfo(); // 提交上一个状态的token，并清零
                token += (char) c;
                state = 0;
                addInfo(); // 提交符号
            }
            return true;
        } else if(c==38) {
            if(state == 0) { // 上一状态是0
                token += (char) c;
            } else if(state == 1) { // 上一状态是1
                addInfo(); // 提交上一个状态的token，并清零
                token += (char) c;
            } else if(state == 2) {
                addInfo(); // 提交上一个状态的token，并清零
                token += (char) c;
            }
            if ((c=br.read()) == 38) {
                if(state == 0) {
                    token += (char) c;
                    state = 0;
                    addInfo(); // 提交符号
                }
                return true;
            }
            else return false;
        } else if(c == 46) { // . 特殊处理
            if(state == 0) { // 上一状态是0
                token += (char) c;
                c = br.read(); // 查询下一符号
                if(isDigit(c)) { //识别.01错误
                    token += br.readLine();
                    info = fileName + ":" + lineNumber + ": 错误: 不是合法的数字\n" + token + "\n";
                    error.add(info);
                    zeroing();
                } else addInfo();
            } else if(state == 1) { // 上一状态是1（数字）
                token += (char) c; // 临时存储
                token += br.readLine();
                info = fileName + ":" + lineNumber + ": 错误: 不是整数\n" + token + "\n";
                error.add(info);
                zeroing();
 
            } else if(state == 2 && (token.equals("System") || token.equals("System.out"))) {
                token += (char) c;
            } else if(state == 2 && !token.equals("System") && !token.equals("System.out")) {
                addInfo(); // 提交上一个状态的token，并清零
                token += (char) c;
                state = 0;
                addInfo(); // 提交符号
            }
            return true;
        } else
            return false;
    }
 
    /**
     * 处理空格、换行符和其他字符（错误）
     * @param c
     * @param br
     * @throws IOException
     */
    public static void isEnd(int c, BufferedReader br) throws IOException {
        if (c == 32 || c == 9) { // 空格
            addInfo();
            state = 0; // 状态归零
        } else if (c == 13 || c == 10) { // 记录换行，行号++
            addInfo();
            state = 0; // 状态归零
            lineNumber++;
        } else if (state == 0) {
            state = 3;
            token += (char) c;
            token += br.readLine();
            info = fileName + ":" + lineNumber + ": 错误: 不是语句\n" + token + "\n";
            error.add(info);
            zeroing();
        } else if (state == 2) {
            state = 3;
            token += (char) c;
            token += br.readLine();
            info = fileName + ":" + lineNumber + ": 错误: 非法字符："+ (char)c +"\n" + token + "\n";
            error.add(info);
            zeroing();
        }
    }
 
    /**
     * 判断token是否是关键字
     * @param token
     * @return
     */
    public static boolean isKey(String token) {
        if(token.equals("class") || token.equals("public") || token.equals("static") || token.equals("void") ||
                token.equals("main") || token.equals("String") || token.equals("extends") || token.equals("return") ||
                token.equals("int") || token.equals("boolean") || token.equals("if") || token.equals("else") ||
                token.equals("while") || token.equals("System.out.println") || token.equals("length") ||
                token.equals("true") || token.equals("false") || token.equals("this") || token.equals("new")) {
            return true;
        } else return false;
    }
 
    /**
     * 清空info token
     */
    public static void zeroing() {
        info = "";
        token = "";
    }
 
    /**
     * 添加info
     */
    public static void addInfo() {
        if(token.length() != 0 && state == 2 && isKey(token)) {
            info = token + " 关键字\n";
            result.add(info);
            zeroing();
        } else if(token.length() != 0 && state == 2) {
            info = token + " 标识符\n";
            result.add(info);
            zeroing();
        } else if(token.length() != 0 && state == 1) {
            info = token + " 数字\n";
            result.add(info);
            zeroing();
        } else if(token.length() != 0) {
            info = token + " 专用符号\n";
            result.add(info);
            zeroing();
        }
    }
 
    /**
     * 确定性有穷自动机
     * @param c 当前读入的字符
     * @param br 文件读入
     * @param bw 文件写
     * @throws IOException
     */
    public static void DFA(int c, BufferedReader br, BufferedWriter bw) throws IOException {
        switch (state) {
            case 0:
                if (isLetter(c)) {
                    state = 2;
                    break;
                } else if (isDigit(c)) {
                    state = 1;
                    break;
                } else if (isSymbol(c, br)) {
                    state = 3;
                    break;
                } else {
                    isEnd(c,br);
                    break;
                }
 
            case 1:
                if (isDigit(c)) {
                    state = 1;
                    break;
                } else if(isSymbol(c,br)) {
                    state = 3; // 结束状态1，进入状态3
                    break;
                } else if(isLetter(c)) {
                    state = 3; // 出错
                    token += (char) c;
                    token += br.readLine();
                    info = fileName + ":" + lineNumber + ": 错误: 需要<标识符>\n" + token + "\n";
                    error.add(info);
                    zeroing();
                    break;
                } else {
                    isEnd(c,br);
                    break;
                }
 
            case 2:
                if(isUnderline(c) || isLetter(c) || isDigit(c)) {
                    state = 2;
                } else if(isSymbol(c, br)) {
                    state = 3;
                } else {
                    isEnd(c,br);
                }
                break;
 
            case 3:
                state = 0;
                if (isLetter(c)) {
                    state = 2;
                    break;
                } else if (isDigit(c)) {
                    state = 1;
                    break;
                } else if (isSymbol(c, br)) {
                    state = 3;
                    break;
                } else {
                    isEnd(c,br);
                    break;
                }
        }
    }
 
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /**
         * 判断输入参数
         */
//        if (args.length == 0) {
//            System.out.println("输入数据为空");
//            return;
//        } else if(args.length == 1) {
//            fileName = args[0];
//        } else if(args.length > 1) {
//            System.out.println("输入参数多于1个，请调整参数个数");
//            return;
//        }
 
        /**
         * 检查fileName是否是文件
         */
        File check = new File(fileName);
        if (check.isDirectory()) { // 判断是否是目录
            System.out.println("请输入正确的文件名，不要输入文件夹的路径");
            return;
        }
        br = new BufferedReader(new FileReader(fileName)); // 初始化文件输入流
 
        /**
         * 创建tokenOut.txt文件
         */
        File file = new File(pathname);
        if(!file.exists()) {
            file.createNewFile();
        }
        bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile())); // 必须是getAbsoluteFile()？
 
        int c = 0;
        while (true) {
            c = br.read();
            if(c == -1) {
                addInfo();
                break;
            }
            DFA(c,br,bw);
        }
 
        /**
         * 写文件
         */
        if(error.size() != 0) {
            for (String line:error) {
                bw.write(line);
            }
            bw.close();
            br.close();
            return;
        }
        for(String line:result) {
            bw.write(line);
        }
        bw.close();
        br.close();
    }
}