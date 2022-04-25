package org;

public class Testw {
    public static void main(String[] args) throws Exception {
        MyToy toy11= (MyToy) ToyGunFactory1.create("gun1","xxx");
        MyToy toy22=(MyToy) ToyGunFactory1.create("gun2","yyy");
//        ToyGun_1 toy11= (ToyGun_1) ToyGunFactory.create("gun1","xxx");
//        ToyGun_2 toy22= (ToyGun_2)ToyGunFactory.create("gun2","yyy");
        toy22.doplay();
        toy11.doplay();
    }
}
