package org;
interface IDecro{
    String printline();
}
class Com implements IDecro{
    private String line;
    public Com(String line){
        this.line=line;
    }
    public String printline(){
        return this.line;
    }
}
class DecroSharp implements IDecro{
    private IDecro decro;
    public DecroSharp(IDecro decro){
        this.decro=decro;
    }
    public String printline(){
        return "#"+this.decro.printline()+"#";
    }
}
class Decroplus implements IDecro{
    private IDecro decro;
    public Decroplus(IDecro decro){
        this.decro=decro;
    }
    public String printline(){
        return "+"+this.decro.printline()+"+";
    }
}
class Decrosub implements IDecro{
    private IDecro decro;
    public Decrosub(IDecro decro){
        this.decro=decro;
    }
    public String printline(){
        return "-"+this.decro.printline()+"-";
    }
}
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new DecroSharp(new DecroSharp(new DecroSharp(new DecroSharp(new Com("hello"))))).printline());
    }
}
//有很多种不同的装饰器来实现不同的功能，
// 但他们都继承一个继承者接口，
 // System.out.println
// (new DecroSharp(new DecroSharp(new DecroSharp(new DecroSharp(new Com("hello"))))).printline());
// 都有一个构造方法参数是这个接口
