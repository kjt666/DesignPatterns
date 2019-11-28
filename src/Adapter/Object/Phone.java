package Adapter.Object;

public class Phone {

    public void charg(int voltage){

        if (voltage!=5)
            System.out.println("电压不匹配，无法充电");
        else
            System.out.println("正在充电...");
    }
}
