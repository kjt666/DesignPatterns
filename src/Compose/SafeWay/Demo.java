package Compose.SafeWay;

public class Demo {
    public static void main(String[] args) {
        OrganizationComposite university= new OrganizationComposite("桂林电子科技大学","广西小清华");

        OrganizationComposite college = new OrganizationComposite("--海洋信息工程学院","北海校区东校区");
        OrganizationComposite college2 = new OrganizationComposite("--信息职业技术学院","北海校区西校区");

        OrganizationComponent department = new OrganizationLeaf("----计算机科学与技术系","修电脑的");
        OrganizationComponent department2 = new OrganizationLeaf("----物流管理系","送快递的");

        OrganizationComponent department3 = new OrganizationLeaf("----电子信息工程系","装宽带的");
        OrganizationComponent department4 = new OrganizationLeaf("----经济与管理系","管账的");

        university.add(college);
        university.add(college2);

        college.add(department);
        college.add(department2);

        college2 .add(department3);
        college2.add(department4);

        university.print();
    }
}
