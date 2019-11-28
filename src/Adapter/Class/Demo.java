package Adapter.Class;

public class Demo {
    public static void main(String[] args) {
        //不使用适配器
        Phone iphone = new Phone();
        iphone.charge(new PowerSupply().output());

        //使用适配器
        iphone.charge(new PowerAdapter().output());
    }
}
