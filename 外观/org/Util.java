package org;

import java.util.HashMap;

class Util {
    public static HashMap page = new HashMap();

    static {
        page.put("c:/xxx.html", "id=#User.id,username=#User.name,age=#User.age,sex=#User.sex");
    }
}
