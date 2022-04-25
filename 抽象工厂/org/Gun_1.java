package org;

class Gun_1 implements IGun {
    private String name;

    public Gun_1(String name) {
        this.name = name;
    }

    @Override
    public void shoot() {
        System.out.println("开枪:" + this.name);
    }
}
