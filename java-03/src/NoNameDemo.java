/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 11:09 2019/5/16
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 * <p>
 * 匿名对象: 就是没有名字的对象
 * <p>
 * 匿名对象的应用场景：
 * A: 调用方法, 仅仅只调用一次的时候
 * 注意: 调用多次的时候 不合适
 * B：匿名对象可以作为实际参数传递
 */

class Student {
    public void show() {
        System.out.println("我爱学习");
    }
}

class StudentDemo {
    public void method(Student s) {
        s.show();
    }
}

public class NoNameDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.show();
        System.out.println("---------------------");
        new Student().show();
        new Student().show();
        System.out.println("----------------------");

        // 匿名对象作为实际参数传递
        StudentDemo sd = new StudentDemo();
        sd.method(new Student());
        //在来一个
        new StudentDemo().method(new Student());
    }
}
