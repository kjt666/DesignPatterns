package Prototype;

public class ShallowCopy {

    public static void main(String args[]) {

        Person man = new Person(18, "李雷", "北京");
        man.setFriend(new Person(18, "韩梅梅", "北京"));

        Person copyMan1 = (Person) man.clone();
        Person copyMan2 = (Person) man.clone();
        Person copyMan3 = (Person) man.clone();
        System.out.println("原对象信息");
        System.out.println(man.toString());
        System.out.println("拷贝对象信息");
        System.out.println(copyMan1.toString());
        System.out.println(copyMan2.toString());
        System.out.println(copyMan3.toString());
    }
}

/**
 * 浅拷贝：基本数据类型和String可以拷贝值，引用类型只能拷贝一份引用
 */
class Person implements Cloneable {

    private int age;
    private String name;
    private String address;
    private Person friend;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public Person getFriend() {
        return friend;
    }

    @Override
    protected Object clone() {
        Person copy = null;
        try {
            copy = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return copy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", friend='" + friend.hashCode() + '\'' +
                '}';
    }
}
