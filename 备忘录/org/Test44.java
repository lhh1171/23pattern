package org;

import java.util.HashMap;

public class Test44 {
    public static void main(String[] args) {
        State s=new State();
        s.setA(12);
        s.setB(13);
        SaveAndLoad.save("a",s);
        s.setA(111);
        s.setB(111);
        SaveAndLoad.save("b",s);
        s.setA(222);
        s.setB(222);
        s=SaveAndLoad.load("a");
        System.out.println(s.getA()+"\t"+s.getB());
        s=SaveAndLoad.load("b");
        System.out.println(s.getA()+"\t"+s.getB());
    }
}
