/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 17:20 2019/5/7
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

// SubClass 类继承

class SubClass extends SuperClass {
    private int n;

    SubClass() {
        System.out.println("subclass");
    }

    public SubClass(int n) {
        super(300); // 调用父类中带有参数的构造器
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}

// SubClass2 类继承
class SubClass2 extends SuperClass {
    private int n;

    SubClass2() {
        super(300);
        System.out.println("SubClass2");
    }

    public SubClass2(int n) {
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}


public class TestSuperSub {
    public static void main(String[] args) {

    }
}
