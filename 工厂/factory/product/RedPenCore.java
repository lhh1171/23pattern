package factory.product;


public class RedPenCore extends PenCore{

    public RedPenCore(){
        color = "red";
    }

    @Override
    public void writeWord(String s) {
        System.out.println("write with "+ color+ ": "+s);
    }
}
