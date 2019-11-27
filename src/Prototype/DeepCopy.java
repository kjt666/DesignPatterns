package Prototype;

import java.io.*;

public class DeepCopy {

    public static void main(String args[]) {
        Student man = new Student(18, "李雷", "北京");
        man.setFriend(new Student(18, "韩梅梅", "北京"));

       /* Student copyMan1 = (Student) man.clone();
        Student copyMan2 = (Student) man.clone();
        Student copyMan3 = (Student) man.clone();*/
        Student copyMan1 = man.deepClone();
        Student copyMan2 = man.deepClone();
        Student copyMan3 = man.deepClone();
        System.out.println("原对象信息");
        System.out.println(man.toString());
        System.out.println("拷贝对象信息");
        System.out.println(copyMan1.toString());
        System.out.println(copyMan2.toString());
        System.out.println(copyMan3.toString());
    }
}

/**
 * 深拷贝：基本数据类型、String、引用类型都可以拷贝值。
 */
class Student implements Cloneable,Serializable {

    private int age;
    private String name;
    private String address;
    private Student friend;

    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void setFriend(Student friend) {
        this.friend = friend;
    }

    public Student getFriend() {
        return friend;
    }

    /**
     * 方式一
     *
     * @return
     */
    @Override
    protected Object clone() {
        Student copy = null;
        try {
            copy = (Student) super.clone();
            if (this.friend != null)
                copy.setFriend((Student) this.friend.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return copy;
    }

    public Student deepClone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Student copy = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = (Student) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                bos.close();
                ois.close();
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
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