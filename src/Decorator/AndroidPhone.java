package Decorator;

/**
 * 具体构建
 */
public class AndroidPhone implements Phone {
    @Override
    public void system() {
        System.out.println("Android操作系统");
    }

    @Override
    public void screen() {
        System.out.println("6英寸屏幕");
    }

    @Override
    public void camera() {
        System.out.println("1200万广角拍摄镜头");
    }

    @Override
    public void charge() {
        System.out.println("支持5v2a充电");
    }
}
