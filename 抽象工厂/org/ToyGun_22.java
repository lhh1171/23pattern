package org;

//=============================================================
class ToyGun_22 implements MyToy {
    private String name;

    public ToyGun_22(String name) {
        this.name = name;
    }

    @Override
    public void doplay() {
        System.out.println("机枪 瞄准 开枪:" + this.name);
    }
}
