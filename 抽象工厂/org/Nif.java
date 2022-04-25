package org;

class Nif implements MyToy {
    private String name;

    public Nif(String name) {
        this.name = name;
    }

    @Override
    public void doplay() {
        System.out.println("小刀:" + this.name);
    }
}
