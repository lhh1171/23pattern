package org;

class AAA {
    public void dosomething() {
        System.out.println("AAA");
    }
}
class Adapter {
    private AAA a=new AAA();
    public void my_dosomething(){
        this.a.dosomething();
    }
}
public class Adp2 {
    public static void main(String[] args) {
        Adapter adp=new Adapter();
        adp.my_dosomething();
    }
}
//定义了一个接口，定义了一个类，这个类里面有一个私有接口属性，
// 有一个方法可以用该接口调用接口方法
