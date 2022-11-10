package org;

/**
 * 饿汉模式
 * 推荐用懒汉模式
 */
public class HungrySingle {

    private static final HungrySingle sInstance = new HungrySingle();

    private HungrySingle() {

    }

    public static HungrySingle getInstance() {
        return sInstance;
    }

}