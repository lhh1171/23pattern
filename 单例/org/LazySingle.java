package org;

/**
 * 懒汉模式
 */
public class LazySingle {

    private static LazySingle sInstance = null;

    private LazySingle() {

    }

//    public static LazySingle getInstance() {
//        if (sInstance == null) {
//            synchronized (LazySingle.class) {
//                if (sInstance == null) {
//                    sInstance = new LazySingle();
//                }
//            }
//        }
//        return sInstance;
//    }
    public static LazySingle getInstance() {
        synchronized (LazySingle.class) {
            if (sInstance == null) {
                sInstance = new LazySingle();
            }
            return sInstance;
        }
    }


}