package org;

import java.util.LinkedList;

class Product{
    public MyBlockQueue myBlockQueue;
    public Product(MyBlockQueue myBlockQueue){
        this.myBlockQueue=myBlockQueue;
    }
    public boolean pub(String str){
        if(myBlockQueue.getSize()>= myBlockQueue.getLimit()){
            return false;
        }else{
            myBlockQueue.push(str);
            return true;
        }//看有没有超出范围
    }
}//产品
class Comsumer{
    public MyBlockQueue myBlockQueue;
    public Comsumer(MyBlockQueue myBlockQueue){
        this.myBlockQueue=myBlockQueue;
    }
    public String sub(){
        if(myBlockQueue.getSize()<=0){
            return null;
        }else{
            return myBlockQueue.pop();
        }//弹出一个元素
    }
}
class MyBlockQueue{
    private LinkedList<String> arr=new LinkedList();

    public int getLimit() {
        return limit;
    }

    private int limit=0;
    public MyBlockQueue(int limit){
        this.limit=limit;
    }
    public void push(String str){
        arr.addFirst(str);
    }
    public String pop(){
        return arr.removeLast();
        //删除最后一个被删除的元素
    }
    public int getSize(){
        return arr.size();
    }
}
public class Test3 {
    public static void main(String[] args) {
        MyBlockQueue myBlockQueue=new MyBlockQueue(3);
        Product p=new Product(myBlockQueue);
        Comsumer c=new Comsumer(myBlockQueue);
        System.out.println(p.pub("1"));
        System.out.println(p.pub("2"));
        System.out.println(p.pub("3"));
        System.out.println(p.pub("4"));
        System.out.println(c.sub());
        System.out.println(c.sub());
        System.out.println(c.sub());
        System.out.println(c.sub());
        //my block queue是product和comsumer的中介
        //p和c都在操作my block queue
        System.out.println(p.pub("5"));
        System.out.println(p.pub("6"));
        System.out.println(c.sub());
        System.out.println(c.sub());

    }
}
