package org;

abstract class IListener {
    public Event getEvent() {
        return e;
    }

    private Event e;

    public IListener(Event e) {
        this.e = e;
    }

    abstract public void onEvent();
}
