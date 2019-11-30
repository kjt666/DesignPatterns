package Compose.SafeWay;

import java.util.ArrayList;

public abstract class OrganizationComponent {

    private String name;
    private String desc;
    protected ArrayList<OrganizationComponent> subOrganization;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
