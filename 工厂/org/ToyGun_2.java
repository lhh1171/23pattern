package org;

class ToyGun_2 implements MyToy {
    private String name;

    public ToyGun_2(String name) {
        this.name = name;
    }

    @Override
    public void doplay() {
        System.out.println("机枪 瞄准 开枪:" + this.name);
    }
}
