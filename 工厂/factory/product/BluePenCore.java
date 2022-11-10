package factory.product;


public class BluePenCore extends PenCore{

    public BluePenCore(){
        color = "blue";
    }

    @Override
    public void writeWord(String s) {
        System.out.println("write with "+ color+ ": "+s);
    }
}