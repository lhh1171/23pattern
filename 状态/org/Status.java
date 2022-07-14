package org;

class Status {
    private Process_Node currentStat;

    public Process_Node getCurrentStat() {
        return currentStat;
    }

    public void setCurrentStat(Process_Node currentStat) {
        this.currentStat = currentStat;
    }

    @Override
    public String toString() {
        return this.currentStat.currentStat.toString();
    }
}
