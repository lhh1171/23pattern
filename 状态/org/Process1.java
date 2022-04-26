package org;

import java.util.HashMap;

class Process1 {
    private HashMap<String, Status> process = new HashMap<>();

    public static Process_Node head = new Process_Node(Flow.START);

    //如果成功就是a,成功两次就是b,失败就是null打印不了，就是可以提前把判断逻辑写出来
    static {
        Process_Node a = new Process_Node(Flow.A);
        head.ok = a;
        head.err = null;
        a.ok = new Process_Node(Flow.B);
        a.err = null;
    }

    public Status getCurrentStatus(String name) {
        Status s = process.get(name);
        return s;
    }




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
        //在hashmap里面更新状态，start->ok->ok->？
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
