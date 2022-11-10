package abstractfactory;


public interface ClothesFactory {
    UpperClothes createUpperClothes(int chestSize, int height);
    Trousers createTrousers(int waitSize, int height);
}
