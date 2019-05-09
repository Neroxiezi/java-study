/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 17:02 2019/5/9
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
public class Multithreading extends Thread {

    /**
     * 多线程 必须重写 Thread类的run方法
     * 买个线程都有自己的任务代码, jvm创建的主线程的任务代码就是main方法的所有代码
     * 自定义线程的任务代码就写在run方法中,自定义线程负责了run方法
     * 创建Thread的子类对象 并且调用start方法开启线程 直接调用 run方法 相当于调用普通的方法
     */
    @Override  // 把自定一下线程的任务代码卸载run方法中
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("自定义线程:" + i);
        }
    }

    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading();
        //multithreading.run();
        multithreading.start();
        System.out.println("哈哈");
    }
}
