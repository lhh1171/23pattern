package factory.example;


public class ChinaBank extends Bank{
    @Override
    public DepositSlip createDepositSlip(String number,String name,int money){
        return new DepositSlip1(number,name,money);
    }
    @Override
    public Seal createSeal(){
        return new SealOne();
    }
}
