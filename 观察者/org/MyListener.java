package org;

class MyListener extends IListener {

    public MyListener(Event e) {
        super(e);
    }

    @Override
    public void onEvent() {
        Event e = this.getEvent();
        System.out.println("MyListener:" + e.getX());
    }
}
