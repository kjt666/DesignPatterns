package Decorator;

public class Demo {
    public static void main(String args[]) {
        System.out.println("普通Android手机");
        Phone androidPhone = new AndroidPhone();
        androidPhone.system();
        androidPhone.screen();
        androidPhone.camera();
        androidPhone.charge();

        System.out.println("\n小米手机");
        androidPhone = new XiaomiPhoneDecorator(androidPhone);
        androidPhone.system();
        androidPhone.screen();
        androidPhone.camera();
        androidPhone.charge();
        ((XiaomiPhoneDecorator) androidPhone).fingerUnlock();
        ((XiaomiPhoneDecorator) androidPhone).xiaoaiClassmate();

        System.out.println("\n华为手机");
        androidPhone = new HuaweiPhoneDecorator(androidPhone);
        androidPhone.system();
        androidPhone.screen();
        androidPhone.camera();
        androidPhone.charge();
        ((HuaweiPhoneDecorator) androidPhone).fingerUnlock();
    }
}
