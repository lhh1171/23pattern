package org;

abstract class RDD {
    private RDD next = null;

    public RDD addnext(RDD rdd) {
        this.next = rdd;
        return rdd;
    }

    abstract public boolean doit();

    public void exec() {
        RDD tmp = this;
        while (tmp != null) {
            boolean b = tmp.doit();
            if (!b) {
                break;
            }
            tmp = tmp.next;
        }
    }
}
