package org;

import java.util.HashMap;

abstract class Factory {
    public static HashMap<String, Class> types = new HashMap();

    static {
        types.put("toyfactory", ToyGunFactory1.class);
        types.put("gunfactory", GunFactory.class);
    }

    public static Factory createFactory(String type) throws Exception {
        Class clz = (Class) types.get(type);
        return (Factory) clz.newInstance();
    }

    public static Object create(String type, String name) throws Exception {
        return null;
    }
}
