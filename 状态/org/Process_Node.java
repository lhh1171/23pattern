package org;

class Process_Node {
    public Flow currentStat;
    public Process_Node ok;
    public Process_Node err;

    public Process_Node(Flow status) {
        this.currentStat = status;
    }
}
