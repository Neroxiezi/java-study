/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:14 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class MyThread extends Thread {
    private String name;

    MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            System.out.println(name + "....x=" + x + ".....ThreadName=" + Thread.currentThread().getName());
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread d1 = new MyThread("PFinal社区");
        MyThread d2 = new MyThread("南丞嘚吧嘚");
        d1.start();
        d2.start();
        for (int x = 0; x < 5; x++) {
            System.out.println("x = " + x + "...over..."
                    + Thread.currentThread().getName());
        }

    }
}
