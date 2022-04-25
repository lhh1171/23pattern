package org;

import java.lang.reflect.Constructor;
import java.util.HashMap;

class ToyGunFactory {
    public static HashMap<String, Class> types = new HashMap();

    static {
        types.put("gun1", ToyGun_11.class);
        types.put("gun2", ToyGun_22.class);
    }

    public static Object create(String type, String name) throws Exception {
        Class clz = (Class) types.get(type);
        Constructor con = clz.getConstructor(String.class);
        //反射
        return con.newInstance(name);
    }
}
