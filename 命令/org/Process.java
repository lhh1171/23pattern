package org;

class Process {
    public void drive(Command c) {
        System.out.println(c.exec());
    }
}
