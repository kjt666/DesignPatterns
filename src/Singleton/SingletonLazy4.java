package Singleton;

/**
 * 单例模式懒汉式（线程安全，延迟加载）
 * 实现方式：双重检查
 * 推荐使用
 */
public class SingletonLazy4 {

    private static volatile SingletonLazy4 mInstance;

    private SingletonLazy4() {
    }

    public static SingletonLazy4 getmInstance() {
        if (mInstance == null) {
            synchronized (SingletonLazy4.class) {
                if (mInstance == null) {
                    mInstance = new SingletonLazy4();
                }
            }
        }
        return mInstance;
    }
}
