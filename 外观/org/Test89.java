package org;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Test89 {
    public static void main(String[] args) throws Exception {
        User u=new User();
        u.setAge(22);
        u.setName("xxx");
        u.setId(1);
        u.setSex("男");
        Fecade f=new Fecade();
        f.render("c:/xxx.html",u);
        f.writehtml("c:/xxx.html");//都是通过f来操作u的
    }
}
