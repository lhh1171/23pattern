package org;

import java.lang.reflect.Constructor;
import java.util.HashMap;

class ToyGunFactory1 extends Factory {
    public static HashMap<String, Class> types = new HashMap();

    static {
        types.put("gun1", ToyGun_11.class);
        types.put("gun2", ToyGun_22.class);
        types.put("nif", Nif.class);
    }

    public static Object create1(String type, String name) throws Exception {
        Class clz = (Class) types.get(type);
        Constructor con = clz.getConstructor(String.class);
        return con.newInstance(name);
    }
}
