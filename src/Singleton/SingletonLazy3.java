package Singleton;

/**
 * 单例模式懒汉式（同步代码块）
 * 本意是对懒汉式同步方法的改进，实质上适得其反，不仅没有提升效率，反而变得线程不安全，这种写法不能使用！
 */
public class SingletonLazy3 {

    private static SingletonLazy3 mInstance;

    private SingletonLazy3() {
    }

    public static SingletonLazy3 getInstance() {
        if (mInstance == null) {
            synchronized (SingletonLazy3.class) {
                mInstance = new SingletonLazy3();
            }
        }
        return mInstance;
    }
}
