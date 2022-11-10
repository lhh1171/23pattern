package abstractfactory;


public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        //工厂也是一个变量
        ClothesFactory factory = new BeijingClothesFactory();
        shop.giveSuit(factory, 110, 82, 170);
        //工厂也是一个变量
        factory = new ShanghaiClothesFactory();
        shop.giveSuit(factory, 120, 88, 180);
    }
}
