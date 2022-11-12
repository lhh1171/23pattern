package org;


public class test2 {
    public static void main(String[] args) {
        IVisitor visitor1=new Visitor1();
        IVisitor visitor2=new Visitor2();
        AbsCom com1=new Com1(visitor1);
        com1.setName("com1");
        //v1,com1
        AbsCom com2=new Com1(visitor1);
        com2.setName("com2");
        //v1,com2
        AbsCom com3=new Com1(visitor2);
        com3.setName("com3");
        //v2,com3
        AbsCom com4=new Com1(visitor1);
        com4.setName("com4");
        //v1,com4
        com1.add(com2);
        //c1,c2
        com2.add(com3);
        //c2,c3
        com3.add(com4);
        //c3,c4

        com1.accept();
    }
}
//一个ivisitor接口，被两种访问者继承，一个抽象域名，被一种地点继承
// 每一个地点对象都有一个地点集合
//new出四个地点对象被不同的访问者访问
//c1被v1访问，c1里含有c2,c2被v1访问，c2里含有c3,c3被v2访问，c3含有c4,c4被v1访问