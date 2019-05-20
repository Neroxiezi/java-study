/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:04 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class Outer {
    private static int num = 3;

    //    class Inner {
//        void show() {
//            System.out.println("show run..." + num);
//        }
//    }
    static class Inner {
        static void show() {
            System.out.println("show run..." + num);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        //Outer.Inner in = new Outer().new Inner();
//        Outer.Inner in = new Outer.Inner();
//        in.show();
        Outer.Inner.show();
    }
}
