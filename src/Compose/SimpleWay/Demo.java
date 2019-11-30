package Compose.SimpleWay;

public class Demo {
    public static void main(String[] args) {
        //学校
        Organization university = new Organization("桂林电子科技大学","广西小清华");
        //学院
        Organization college = new Organization("--海洋信息工程学院","北海校区东校区");
        Organization college2 = new Organization("--信息职业技术学院","北海校区西校区");
        //系别
        Organization department = new Organization("----计算机科学与技术系","修电脑的");
        Organization department2 = new Organization("----物流管理系","送快递的");
        Organization department3 = new Organization("----电子信息工程系","装宽带的");
        Organization department4 = new Organization("----经济与管理系","管账的");

        university.add(college);
        university.add(college2);

        college.add(department);
        college.add(department2);

        college2 .add(department3);
        college2.add(department4);

        university.print();
    }
}
