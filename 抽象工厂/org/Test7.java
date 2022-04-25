package org;
//有两个东西：枪和玩具；
// 有两个工厂：玩具工厂和抢工厂；
// 有一个抽象工厂被两个工厂继承

import java.lang.reflect.Constructor;
import java.util.HashMap;


public class Test7 {
    public static void main(String[] args) throws Exception {
        Factory f=Factory.createFactory("gunfactory");
        IGun toy= (IGun) f.create("gun1","xxx");
        toy.shoot();
    }
}
