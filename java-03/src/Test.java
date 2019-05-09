import jdk.nashorn.internal.ir.CatchNode;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 13:32 2019/5/8
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
public class Test {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());
    }

    public static void show(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) {
            Dog c = (Dog) a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}