package org;

import java.util.ArrayList;
import java.util.Comparator;

class A implements Strategy {
    private ArrayList list = null;
    private int res;

    public void setList(ArrayList list) {
        this.list = list;
    }

    @Override
    public void findMax() {
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o1 - (int) o2;
            }
        });
        this.res = (int) list.get(0);
    }

    public int getRes() {
        return this.res;
    }
}
