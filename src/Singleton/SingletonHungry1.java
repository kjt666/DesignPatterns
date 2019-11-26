package Singleton;

/**
 * 单例模式饿汉式（静态常量）
 */
public class SingletonHungry1 {

    private static SingletonHungry1 mInstance = new SingletonHungry1();

    private SingletonHungry1() {
    }

    public static SingletonHungry1 getInstance() {
        return mInstance;
    }
}
