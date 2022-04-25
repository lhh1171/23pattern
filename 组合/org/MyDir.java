package org;

import java.util.ArrayList;

class MyDir extends Component {
    private ArrayList<Component> sub = new ArrayList<>();
    private String name;

    public MyDir(String name) {
        this.name = name;
    }

    @Override
    public void printlocal(String perfix) {
        perfix = perfix + "/" + this.name;
        System.out.println(perfix);
        for (Component c : sub) {
            c.printlocal(perfix);
        }
    }

    @Override
    public void add(Component com) {
        this.sub.add(com);
    }
}
