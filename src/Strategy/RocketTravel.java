package Strategy;

/**
 * 新增的具体出行策略类（火箭）
 */
public class Rocket implements ITravel{
    @Override
    public void travel() {
        System.out.println("坐火箭去旅行~");
    }
}
