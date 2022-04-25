package org;

import java.util.HashMap;

class Process1 {
    public Status getCurrentStatus(String name) {
        Status s = process.get(name);
        return s;
    }

    public static Process_Node head = new Process_Node(Flow.START);

    static {
        Process_Node a = new Process_Node(Flow.A);
        head.ok = a;
        head.err = null;
        a.ok = new Process_Node(Flow.B);
        a.err = null;
    }

    private HashMap<String, Status> process = new HashMap<>();

    public void commit(String name) {
        Status s = new Status();
        s.setCurrentStat(Process1.head);
        process.put(name, s);
    }

    public void next_OK(String name) {
        Status s = process.get(name);
        Process_Node tmp = s.getCurrentStat();
        tmp = tmp.ok;
        Status s2 = new Status();
        s2.setCurrentStat(tmp);
        process.put(name, s2);
    }

    public void next_err(String name) {
        Status s = process.get(name);
        Process_Node tmp = s.getCurrentStat();
        tmp = tmp.err;
        Status s2 = new Status();
        s2.setCurrentStat(tmp);
        process.put(name, s2);
    }
}
