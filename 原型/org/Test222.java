package org;

import java.util.HashMap;

public class Test222 {
    public static void main(String[] args) throws CloneNotSupportedException {
        T t1=new T();
        t1.setColor(1);
        T t2=new T();
        t2.setColor(2);
        T t3=new T();
        t3.setColor(3);
        Fac.addType("red",t1);
        Fac.addType("blue",t2);
        Fac.addType("green",t3);
        T tt=Fac.createT("red");
        tt.setName("aaaa");
        T tt3=Fac.createT("red");
        tt3.setName("xxx");
        T tt2=Fac.createT("blue");
        tt2.setName("bbb");
        System.out.println(tt.getColor()+"\t"+tt.getName());
        System.out.println(tt3.getColor()+"\t"+tt3.getName());
        System.out.println(tt2.getColor()+"\t"+tt2.getName());
    }
}
