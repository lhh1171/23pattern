package factory.product;


public class BlackPenCore extends PenCore{

    public BlackPenCore(){
        color = "black";
    }

    @Override
    public void writeWord(String s) {
        System.out.println("write with "+ color+ ": "+s);
    }
}
