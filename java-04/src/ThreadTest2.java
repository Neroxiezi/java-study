/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:50 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class MyThread1 implements Runnable {
    @Override
    public void run() {
        show();
    }

    private void show() {
        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + "..." + x);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread1 d = new MyThread1();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}
