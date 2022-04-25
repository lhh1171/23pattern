package xxxx;

public class p {
    String name;
    String password;
    String tel;
    String mail;
    public p(String n,String p,String t,String m){
        name=n;
        password =p;
        tel=t;
        mail=m;
    }
    public p() {

    }

    @Override
    public String toString() {
        return "p{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
