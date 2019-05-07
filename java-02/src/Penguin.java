/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 16:44 2019/5/7
 * @Description:I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好! 我是" + id + "号" + name + ".");
    }

}

public class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        // super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
        super(myName,myid);
    }
}
