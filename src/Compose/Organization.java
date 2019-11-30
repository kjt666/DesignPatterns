package Compose;

import java.util.ArrayList;

public  class Organization {

   private String name;
   private String desc;
   private ArrayList<Organization> subOrganization;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
        subOrganization = new ArrayList<>();
    }

    protected void add(Organization component){
        subOrganization.add(component);
    }

    protected void del(Organization component){
       subOrganization.remove(component);
    }

    private void print() {
        System.out.println(getName()+"("+getDesc()+")");
        if (subOrganization.size()!=0)
            for (Organization organization : subOrganization) {
                organization.print();
            }
    }

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
