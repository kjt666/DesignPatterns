package Singleton;

/**
 * 单例模式（线程安全，延迟加载）
 * 实现方式：静态内部类
 * 推荐使用
 */
public class SingletonLazy5 {


    private SingletonLazy5() {
    }

    static class SingleInstance {
        private static SingletonLazy5 INSTANCE = new SingletonLazy5();
    }

    public SingletonLazy5 getInstance() {
        return SingleInstance.INSTANCE;
    }
}
