package Decorator;

/**
 * 具体装饰类
 */
public class HuaweiPhoneDecorator extends PhoneDecorator {

    public HuaweiPhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void system() {
        System.out.println("EMUI操作系统");
    }

    @Override
    public void camera() {
        super.camera();
        System.out.println("1200长焦拍摄镜头");
    }

    @Override
    public void charge() {
        System.out.println("支持45W超级快充");
    }
}
