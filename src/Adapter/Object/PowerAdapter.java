package Adapter.Object;

/**
 * 电源适配器类，将220v电源转换输出5v
 */
public class PowerAdapter {

   private PowerSupply powerSupply;

    public PowerAdapter(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public int output(){
        return powerSupply.output()/44;
    }
}
