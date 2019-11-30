package Compose.SafeWay;

import java.util.ArrayList;

public class OrganizationComposite extends OrganizationComponent {

    public OrganizationComposite(String name, String desc) {
        super(name, desc);
        subOrganization = new ArrayList<>();
    }

    public void add(OrganizationComponent component) {
        subOrganization.add(component);
    }

    public void del(OrganizationComponent component) {
        subOrganization.remove(component);
    }

    @Override
    protected void print() {
        System.out.println(getName()+"("+getDesc()+")");
        if (subOrganization.size()!=0)
            for (OrganizationComponent organization : subOrganization) {
                organization.print();
            }
    }
}
