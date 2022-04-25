package org;

import java.util.ArrayList;

class Doit {
    private ArrayList list = null;
    private Strategy strategy = null;

    public Doit(ArrayList list, Strategy strategy) {
        this.list = list;
        this.strategy = strategy;
    }

    public int find() {
        this.strategy.setList(this.list);
        this.strategy.findMax();
        return this.strategy.getRes();
    }
}
