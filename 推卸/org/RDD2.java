package org;

class RDD2 extends RDD {
    private String name;

    public RDD2(String name) {
        this.name = name;
    }

    @Override
    public boolean doit() {
        System.out.println(this.name + "处理了");
        return false;
    }
}
