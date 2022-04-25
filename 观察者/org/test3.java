package org;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        Event e=new Event();
        e.setX(12);
        Trigger t=new Trigger();
        t.addListener(new MyListener(e));
        t.doEvent(e);
    }
}
//有很多的特殊观察者继承抽象观察者，
// 有一个Trigger来装很多的特殊观察者，
// 并且可以调用方法来让每种观察者调用onEvent方法
