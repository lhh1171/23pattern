package org;

//
public class Test22 {
    public static void main(String[] args) {
        //生成一个过程
        Process1 p=new Process1();
        //commit一个过程
        p.commit("xxx");
        p.commit("yyy");
        Status s=p.getCurrentStatus("yyy");
        System.out.println(s);
        p.next_OK("xxx");
        p.next_OK("yyy");
        Status s2=p.getCurrentStatus("yyy");
        System.out.println(s2);
        p.next_OK("xxx");
        p.next_OK("yyy");
        Status s3=p.getCurrentStatus("yyy");
        System.out.println(s3);
        p.next_err("xxx");
        p.next_err("yyy");
        Status s4=p.getCurrentStatus("yyy");
        System.out.println(s4);
    }
}
