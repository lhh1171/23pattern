package xxxx;

import java.util.Scanner;

class M {
    public static void main(String[] args)throws NullPointerException {
        p p1=new p("11","224","33","44");
        System.out.println("请输入密码");
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        if (ss==p1.password){
            System.out.println("登录成功");
        }else{
            System.out.println("失败");
        }
        try {
            manager ma=new manager(100);
            ma.add(p1);
            ma.fix(0,"99","99","00","00");
        } catch (Exception e) {
            e.printStackTrace();
        }


        cl c=new cl(p1);
        c.reg("99","99","00","00");
        c.fix("99","99","00","00");
    }

}
