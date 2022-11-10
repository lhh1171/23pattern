package org;

import java.util.HashMap;

class Fac {
    private static HashMap<String, T> hm = new HashMap<>();

    public static void addType(String type, T t) {
        hm.put(type, t);
    }

    public static T createT(String type)
            throws CloneNotSupportedException {
        return (hm.get(type)).clone();
    }
}
