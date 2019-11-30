package Decorator;

/**
 * 抽象装饰类
 */
public class PhoneDecorator implements Phone {

    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }


    @Override
    public void system() {
        phone.system();
    }

    @Override
    public void screen() {
        phone.screen();
    }

    @Override
    public void camera() {
        phone.camera();
    }

    @Override
    public void charge() {
        phone.charge();
    }

    public void fingerUnlock(){
        System.out.println("支持指纹解锁");
    }
}
