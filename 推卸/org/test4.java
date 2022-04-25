package org;

public class test4 {
    public static void main(String[] args) {
        RDD rdd1=new RDD1("r1");
        RDD rdd2=new RDD2("r2");
        RDD rdd3=new RDD1("r3");
        RDD rdd4=new RDD1("r4");
        rdd1.addnext(rdd2).addnext(rdd3).addnext(rdd4);
        rdd1.exec();
    }
}
