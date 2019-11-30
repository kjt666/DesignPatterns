package Compose.SimpleWay;

import java.util.ArrayList;

/**
 * 组织抽象类，可表示学校、学院、系别等形式的组织
 */
public  class Organization {

   private String name;
   private String desc;
   //存放下属组织的集合
   private ArrayList<Organization> subOrganization;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
        subOrganization = new ArrayList<>();
    }

    /**
     * 添加下属组织
     * @param component
     */
    public void add(Organization component){
        subOrganization.add(component);
    }

    /**
     * 删除下属组织
     * @param component
     */
    public void del(Organization component){
       subOrganization.remove(component);
    }

    /**
     * 打印包括本身及以下的所有组织信息
     */
    public void print() {
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
