package org;

import java.util.ArrayList;
import java.util.Iterator;

class Itor{
    private int[] arr;
    private int cap;
    public Itor(int cap,int[] arr){
        this.cap=cap;
        this.arr=arr;
    }
    private int index=0;
    public boolean hashnext(){
        if(this.index<=this.cap){
            return true;
        }
        return false;
    }
    public int next(){
        return arr[index++];
    }
}
interface Agr{
    Itor itorator();
}
class MyArr implements Agr{
    private int[] arr;
    private int index=0;
    private int max;
    public MyArr(int max){
        this.max=max;
        this.arr=new int[max];
    }
    public void add(int i){
        if(this.index<=this.max) {
            arr[this.index++] = i;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public Itor itorator() {
        return new Itor(this.index-1,this.arr);
    }
}
public class MyItor {
    public static void main(String[] args) {
        MyArr arr=new MyArr(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Itor it=arr.itorator();
        while(it.hashnext()){
            System.out.println(it.next());
        }
        Itor it2=arr.itorator();
        while(it2.hashnext()){
            System.out.println(it2.next());
        }
//        ArrayList list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Iterator it=list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
//手写itor