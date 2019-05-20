/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 13:18 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

/**
 * 当一个抽象类中的方法都是抽象的时候，这时可以将抽象类用另一种形式定义和表示 就是接口。
 * 注意事项:
 * 虽然抽象类中的全局变量和抽象方法的修饰符都可以不用写, 但是这样阅读性很差.
 * 类与类之间是继承关系,类与接口直接是实现关系
 * 接口不可以实例化, 能由实现了接口并覆盖了接口中所有的抽象方法的子类实例化.
 */
interface Demo1 {
    public static final int NUM = 4;

    public abstract void show1();

    public abstract void show2();
}

class DemoImpl implements Demo1 {
    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        DemoImpl d = new DemoImpl();
        System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo1.NUM);
    }
}
