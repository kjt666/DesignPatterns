package Singleton;

/**
 * 单例模式懒汉式（线程不安全）
 */
public class SingletonLazy1 {

    private static SingletonLazy1 mInstance;

    private SingletonLazy1() {
    }

    public static SingletonLazy1 getmInstance() {
        if (mInstance == null) {
            mInstance = new SingletonLazy1();

        }
        return mInstance;
    }
}
