package org;

class RDD1 extends RDD {
    private String name;

    public RDD1(String name) {
        this.name = name;
    }

    @Override
    public boolean doit() {
        System.out.println(this.name + "处理不了");
        return true;
    }
}
