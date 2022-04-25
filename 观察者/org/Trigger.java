package org;

import java.util.ArrayList;

class Trigger {
    private ArrayList<IListener> arrayList = new ArrayList<>();

    public void addListener(IListener listener) {
        this.arrayList.add(listener);
    }

    public void doEvent(Event e) {
        for (IListener listener : this.arrayList) {
            listener.onEvent();
        }
    }
}
