package org;

public class test {
    public static void main(String[] args) {
        //my 继承 tmp,tmp中xxx()调用yyy(),、即my调父类xxx，也调用了自己的yyy
        new My().xxx();
    }
}
