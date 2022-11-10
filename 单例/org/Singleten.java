package org;

class Utils{
    private static final Utils utils=new Utils();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private Utils(){}
    public static Utils getInstance(){
        return utils;
    }
}
public class Singleten {
    public static void main(String[] args) {
        Utils u=Utils.getInstance();
        u.setId(12);
        Utils u2=Utils.getInstance();
        u2.setId(33);
        System.out.println(u.getId());
    }
}
