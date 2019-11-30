package Compose.OpenWay;

import java.util.ArrayList;

public abstract class OrganizationComponent {

    private String name;
    private String desc;
    protected ArrayList<OrganizationComponent> subOrganization;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public void del(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
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
