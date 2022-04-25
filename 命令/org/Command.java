package org;

class Command {
    private Stat stat;

    public Command(Stat stat) {
        this.stat = stat;
    }

    public String exec() {
        if (this.stat == Stat.ON) {
            return "打开了";
        } else {
            return "关上了";
        }
    }
}
