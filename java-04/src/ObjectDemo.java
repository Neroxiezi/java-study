/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 10:25 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

/**
 * Object：所有类的根类, Object是不断抽取而来,具备着所有对象都具有的共性内容:
 * <p>
 * 方法名称        方法说明
 * equals()       指示其他某个对象是否与此对象 相等
 * getClass()     返回此 Object 的运行时类
 * hasCode()      返回该对象的哈希码值
 * toString()     返回该对象的字符串表示
 */

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }
}

class Demo {

}

public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(20);
        Person p3 = p1;
        Demo d = new Demo();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(d.getClass().getName());
        System.out.println(d.equals(p1));
        System.out.println(Integer.toHexString(d.hashCode()));
        System.out.println(d.toString());
    }
}
