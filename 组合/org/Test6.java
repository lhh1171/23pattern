package org;


public class Test6 {
    public static void main(String[] args) throws Exception {
        MyDir m1=new MyDir("a1");
        MyDir m2=new MyDir("a2");
        MyDir m3=new MyDir("a3");
        MyFile f1=new MyFile("f1");
        MyFile f2=new MyFile("f2");
//        MyFile f3=new MyFile("f3");
        m1.add(m2);
        m1.add(f1);
        m2.add(m3);
        m3.add(f2);
//        f2.add(f3);
        m1.printlocal("/");
    }
}
// 有一个接口分别被mydir,myfile实现，有不同的功能，两者之间还可以有联系的调用
