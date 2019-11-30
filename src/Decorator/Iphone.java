package Decorator;

/**
 * 具体构建
 */
public class Iphone implements Phone {
    @Override
    public void system() {
        System.out.println("IOS操作系统");
    }

    @Override
    public void screen() {
        System.out.println("五英寸屏幕");
    }

    @Override
    public void camera() {
        System.out.println("800万拍摄镜头");
    }

    @Override
    public void charge() {
        System.out.println("支持5v1a充电");
    }
}
