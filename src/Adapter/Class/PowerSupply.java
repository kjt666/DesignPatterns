package Adapter.Class;

/**
 * 电源类，输出220v电压
 */
public class PowerSupply {

    protected int voltage = 220;

    public int output(){
        return voltage;
    }
}
