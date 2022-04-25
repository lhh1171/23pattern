package org;

public class Test90 {
    public static void main(String[] args) throws ClassNotFoundException {
        Builder b=new Builder(new BuildCar());
        b.build();
        Builder b1=new Builder(new Buildhouse());
        b1.build();
    }
}
//定义了一个建筑接口，里面有五个建筑步骤
//定义了一个建造者类，有一个build属性，并调用五步方法