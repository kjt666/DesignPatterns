package Adapter.Object;

public class Demo {
    public static void main(String[] args) {
        //不使用适配器
        Phone iphone = new Phone();
        iphone.charg(new PowerSupply().output());

        //使用适配器
        iphone.charg(new PowerAdapter(new PowerSupply()).output());
    }
}
