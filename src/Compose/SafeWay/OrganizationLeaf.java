package Compose.SafeWay;

public class OrganizationLeaf extends OrganizationComponent {

    public OrganizationLeaf(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName()+"("+getDesc()+")");
    }
}
