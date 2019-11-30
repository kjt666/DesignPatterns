package Decorator;

/**
 * 具体装饰类
 */
public class XiaomiPhoneDecorator extends PhoneDecorator {

    public XiaomiPhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void system() {
        System.out.println("MIUI操作系统");
    }

    @Override
    public void camera() {
        super.camera();
        System.out.println("1200万超广角拍摄镜头");
    }

    @Override
    public void charge() {
        System.out.println("支持30W超级快充");
    }

    public void xiaoaiClassmate(){
        System.out.println("支持小爱同学");
    }
}
