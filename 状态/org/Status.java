package org;

class Status {
    public Process_Node getCurrentStat() {
        return currentStat;
    }

    public void setCurrentStat(Process_Node currentStat) {
        this.currentStat = currentStat;
    }

    private Process_Node currentStat;

    @Override
    public String toString() {
        return this.currentStat.currentStat.toString();
    }
}
