package xxxx;
class manager{
    int location;
    p[] pp;
    manager(int l){
        location=l;
    }
    String get(int i){
        return pp[i].toString();
    }
    void fix(int i,String n,String p,String t,String m){
        pp[i].name=n;
        pp[i].password =p;
        pp[i].tel=t;
        pp[i].mail=m;
    }
    void delete(int i){
        pp[i]=null;
    }
    void add(p p){
        for (int i=0;i<this.location;i++) {

            if (pp[i] == null) {
                pp[i] = p;


            }

        }
    }
}
