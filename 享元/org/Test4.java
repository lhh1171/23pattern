package org;

class Method_Area{
    private static Method_Area method_area=new Method_Area();
    private Method_Area(){
        System.out.println("构造");
    }
    public static Method_Area getInstence(){
        return method_area;
    }
    public void x1(Heap_Obj obj){
        System.out.println(obj.getId());
    }
    public void x2(Heap_Obj obj){
        System.out.println(obj.getName());
    }
}
class Heap_Obj {
    public static Method_Area getMethod_area() {
        return method_area;
    }

    private static Method_Area method_area;
    static{
        method_area=Method_Area.getInstence();
    }
    public void dis1(){
        method_area.x1(this);
    }
    public void dis2(){
        method_area.x2(this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;
}
public class Test4 {
    public static void main(String[] args) {
        Heap_Obj heap=new Heap_Obj();
        Heap_Obj heap2=new Heap_Obj();
        heap.setId(11);
        heap.setName("xxx");
        heap2.setId(22);
        heap2.setName("yyy");
        heap.dis1();
        heap2.dis1();
    }
}
//分别new出两个对象heap,heap2,并分别初始化id,name,但他们都在操作一个Method_Area对象
//两个对象分别调用dis1,都通过同一个Method_Area对象，调用
// public void x1(Heap_Obj obj){
//        System.out.println(obj.getId());
//    }
