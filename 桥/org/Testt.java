package org;

public class Testt {
    public static void main(String[] args) {
        Computer  c = new Laptop(new Lenovo());
        c.sale();
        Computer c2 = new Desktop(new Dell());
        c2.sale();
    }
    //一个电脑品牌接口，被联想和戴尔实现，
    // 定义个computer类，含有一个被保护的品牌属性
    //有一个笔记本电脑类继承computer类
    //一个联想笔记本被出售
}
