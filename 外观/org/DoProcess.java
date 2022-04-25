package org;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class DoProcess implements IDoProcess {

    @Override
    public String render(String path, Object u) throws Exception {
        String str = (String) Util.page.get(path);
        User user = (User) u;
        Class clz = user.getClass();
        Field[] fs = clz.getDeclaredFields();
        //Field提供有关类或接口的单个字段的信息以及对它们的动态访问。
        // 反射字段可以是类（静态）字段或实例字段。
        //Field允许在获取或设置访问操作期间发生扩大转换，但是如果会发生缩小转换，则抛出IllegalArgumentException 。
        //返回一个Field对象数组，该数组反映由该Class对象表示的类或接口声明的所有字段。
        // 这包括公共，受保护，默认（程序包）访问和私有字段，但不包括继承的字段。
        //如果此Class对象表示没有声明字段的类或接口，则此方法返回长度为0的数组。
        //如果此Class对象表示数组类型，原始类型或void，则此方法返回长度为0的数组。
        //返回数组中的元素未排序，并且没有任何特定顺序
        for (Field f : fs) {
            String mname = f.getName();
            String tmp = "get" + mname.substring(0, 1).toUpperCase() + mname.substring(1, mname.length());
            System.out.println(tmp);
            Method m = clz.getDeclaredMethod(tmp);
            String tmpstr = "#" + clz.getSimpleName() + "." + f.getName();
            System.out.println(tmpstr);
            str = str.replaceAll(tmpstr, m.invoke(user) + "");
        }
        return str;
    }

    @Override
    public String writehtml(String path) {
        String str = (String) Util.page.get(path);
        return str;
    }
}
