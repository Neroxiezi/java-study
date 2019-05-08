/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 10:00 2019/5/8
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

/**
 * 构造器
 * 子类是不继承父类的构造器的,它只是调用.如果父类的构造器 如果父类的构造器带有参数, 则必须在子类的构造器中显式地通过 super
 * 关键字调用父类的构造器以适当的参数列表
 */
class SupersClass {
    private int n;

    SupersClass() {
        System.out.println("SupersClass()");
    }

    SupersClass(int n) {
        System.out.println("SupersClass(int n)");
        this.n = n;
    }
}

// SubClass 类继承
class SubsClass extends SupersClass {
    private int n;

    SubsClass() {
        System.out.println("SubsClass");
    }

    SubsClass(int n) {
        super(300);
        System.out.println("SubsClass(int n):" + n);
        this.n = n;
    }
}

// SubsClass1 类继承
class SubsClass1 extends SupersClass {
    private int n;

    SubsClass1() {
        super(300);
        System.out.println("SubsClass1");
    }

    public SubsClass1(int n) {
        System.out.println("SubsClass1(int n)" + n);
        this.n = n;
    }

}

public class JavaConstructor {
    public static void main(String[] args) {
        System.out.println("----SubClass 类继承------");
        SubsClass sc1 = new SubsClass();
        SubsClass sc2 = new SubsClass(100);
    }
}
