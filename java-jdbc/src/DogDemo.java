import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 11:14 2019/5/22
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */


class Dog {
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String color, char sex) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (age != other.age)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color)) {
            return false;
        }
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex != other.sex)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + sex;
        return result;
    }
}


public class DogDemo {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<Dog> hs = new HashSet<Dog>();

        // 创建狗对象
        Dog d1 = new Dog("秦桧", 25, "红色", '男');
        Dog d2 = new Dog("高俅", 22, "黑色", '女');
        Dog d3 = new Dog("秦桧", 25, "红色", '男');
        Dog d4 = new Dog("秦桧", 20, "红色", '女');
        Dog d5 = new Dog("魏忠贤", 28, "白色", '男');
        Dog d6 = new Dog("李莲英", 23, "黄色", '女');
        Dog d7 = new Dog("李莲英", 23, "黄色", '女');
        Dog d8 = new Dog("李莲英", 23, "黄色", '男');

        // 添加元素
        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        hs.add(d5);
        hs.add(d6);
        hs.add(d7);
        hs.add(d8);

        // 遍历
        for (Dog d : hs) {
            System.out.println(d.getName() + "---" + d.getAge() + "---"
                    + d.getColor() + "---" + d.getSex());
        }
    }
}
