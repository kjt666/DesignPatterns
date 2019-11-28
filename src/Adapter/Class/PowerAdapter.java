package Adapter.Class;

/**
 * 电源适配器类，将220v电源转换输出5v
 */
public class PowerAdapter extends PowerSupply {

    @Override
    public int output() {
        return voltage/44;
    }
}
