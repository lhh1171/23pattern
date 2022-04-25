package org;

import java.util.HashMap;

interface Expr{
    Expr interpretor();
    Boolean getValue();
}
class Context{
    private static HashMap<String,Boolean> hm=new HashMap();
    public static void Define_val(String name,Boolean val){
        hm.put(name,val);
    }
    public static Boolean lookup(String name) throws Exception {
        Boolean b=hm.get(name);
        if(b==null){
            throw new Exception("变量不存在！");
        }
        return b;
    }
}
class Op_num implements Expr{
    private Boolean value;
    public Op_num(String name) throws Exception {
       this.value=Context.lookup(name);
    }
    public Op_num(Boolean value){
        this.value=value;
    }
    public Boolean getValue(){
        return this.value;
    }
    @Override
    public Expr interpretor() {
        return this;
    }
}
class Expr_And implements Expr{
    private Expr expr1;
    private Expr expr2;
    public Expr_And(Expr expr1,Expr expr2){
        this.expr1=expr1;
        this.expr2=expr2;
    }
    @Override
    public Expr interpretor() {
        Expr expr_l=this.expr1.interpretor();
        Expr expr_r=this.expr2.interpretor();
        if(expr_l==null){
            expr_l=expr_l.interpretor();
        }
        if (expr_r == null) {
            expr_r=expr_r.interpretor();
        }
        Boolean b=expr_l.getValue()&&expr_r.getValue();
        return new Op_num(b);
    }

    @Override
    public Boolean getValue() {
        return null;
    }
}

class Expr_OR implements Expr{
    private Expr expr1;
    private Expr expr2;
    public Expr_OR(Expr expr1,Expr expr2){
        this.expr1=expr1;
        this.expr2=expr2;
    }
    @Override
    public Expr interpretor() {
        Expr expr_l=this.expr1.interpretor();
        Expr expr_r=this.expr2.interpretor();
        if(expr_l==null){
            expr_l=expr_l.interpretor();
        }
        if (expr_r == null) {
            expr_r=expr_r.interpretor();
        }
        Boolean b=expr_l.getValue()||expr_r.getValue();
        return new Op_num(b);
    }

    @Override
    public Boolean getValue() {
        return null;
    }
}
public class Test2 {
    public static void main(String[] args) throws Exception {
        Context.Define_val("a",true);
        Context.Define_val("b",false);
        Context.Define_val("c",true);
        Context.Define_val("d",false);
        Expr_And and_l=new Expr_And(new Op_num("a"),new Op_num("b"));
        Expr_And and_r=new Expr_And(new Op_num("c"),new Op_num("d"));
        Expr_OR or=new Expr_OR(and_l,and_r);
        Expr_OR or2=new Expr_OR(or,new Op_num("c"));
        Expr expr=or2.interpretor();
        System.out.println(expr.getValue());
    }
}
