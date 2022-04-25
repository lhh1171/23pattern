package org;

import java.util.ArrayList;

abstract class AbsCom {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    protected IVisitor visitor;

    public AbsCom(IVisitor visitor) {
        this.visitor = visitor;
    }

    private ArrayList<AbsCom> absComs = new ArrayList<>();

    public ArrayList<AbsCom> getAbsComs() {
        return absComs;
    }

    public void add(AbsCom com) {
        this.absComs.add(com);
    }

    abstract public void accept();
}
