package Singleton;

/**
 * 单例模式（线程安全）
 * 实现方式：枚举
 * 借助jdk1.5添加的枚举实现单例模式，不仅能避免多线程同步问题，还能防止反序列化重新创建新的对象
 * Effective Java作者提倡的方式，推荐使用
 */
public enum SingletonEnum {

    //单例本身
    INSTANCE;

    public void doSome() {
        System.out.println("~~~");
    }
}
