package factory.example;


public class BankOfCommunications extends Bank {
    @Override
    public DepositSlip createDepositSlip(String number, String name, int money) {
        return new DepositSlip3(number, name, money);
    }

    @Override
    public Seal createSeal() {
        return new SealThree();
    }
}
