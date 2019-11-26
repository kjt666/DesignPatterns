package Singleton;

/**
 * 单例模式饿汉式（静态代码块）
 */
public class SingletonHungry2 {

    private static SingletonHungry2 mInstance;

    static {
        mInstance = new SingletonHungry2();
    }

    private SingletonHungry2() {
    }

    public static SingletonHungry2 getInstance() {
        return mInstance;
    }
}
