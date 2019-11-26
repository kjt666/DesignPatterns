package Singleton;

/**
 * 单例模式懒汉式（线程安全，同步方法）
 */
public class SingletonLazy2 {

    private static SingletonLazy2 mInstance;

    private SingletonLazy2() {
    }

    public static synchronized SingletonLazy2 getmInstance() {
        if (mInstance == null) {
            mInstance = new SingletonLazy2();
        }
        return mInstance;
    }
}
