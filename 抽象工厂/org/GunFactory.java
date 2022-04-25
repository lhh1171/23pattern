package org;

import java.lang.reflect.Constructor;
import java.util.HashMap;

//==============================================================================
class GunFactory extends Factory {
    public static HashMap<String, Class> types = new HashMap();

    static {
        types.put("gun1", Gun_1.class);
    }

    public static Object create(String type, String name) throws Exception {
        Class clz = (Class) types.get(type);
        Constructor con = clz.getConstructor(String.class);
        return con.newInstance(name);
    }
}
