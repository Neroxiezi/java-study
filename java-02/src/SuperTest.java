/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 9:55 2019/5/8
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

class Animal1 {
    public void eat() {
        System.out.println("animal: eat");
    }
}

class Dog1 extends Animal1 {
    public void eat() {
        System.out.println("dog : eat");
    }

    void eatTest() {
        this.eat(); // this 调用自己的方法
        super.eat(); // super 调用父类方法
    }
}


public class SuperTest {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();
        Dog1 d = new Dog1();
        d.eatTest();
    }
}
