package xxxx;

public class cl {
    p pp;
    cl(p p){
        pp=p;
    }
    void reg(String n,String p,String t,String m){
       pp.name=n;
        pp.password =p;
        pp.tel=t;
        pp.mail=m;
    }
    void fix(String n,String p,String t,String m){
        pp.name=n;
        pp.password =p;
        pp.tel=t;
        pp.mail=m;
    }
    void delete(){
        pp=null;
    }
}
