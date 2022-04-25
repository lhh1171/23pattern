package org;

class ToyGun_1 implements MyToy {
    private String name;

    public ToyGun_1(String name) {
        this.name = name;
    }

    @Override
    public void doplay() {
        System.out.println("手枪 瞄准 开枪:" + this.name);
    }
}
