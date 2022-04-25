package org;

import java.util.HashMap;

class SaveAndLoad {
    private static HashMap<String, Momoto> hm = new HashMap();

    public static void save(String name, State state) {
        Momoto m = new Momoto(state.getA(), state.getB());
        hm.put(name, m);
    }

    public static State load(String name) {
        State s = new State();
        Momoto m = hm.get(name);
        s.setA(m.getA());
        s.setB(m.getB());
        return s;
    }
}
