/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 15:35 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
// 定义一个线程的任务类
class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);
        }
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        Thread minPriority = new Thread(new Task(),"优先级较低的线程");
        Thread maxPriority = new Thread(new Task(),"优先级较高的线程");
        minPriority.setPriority(Thread.MIN_PRIORITY); // 设置线程的优先级为1;
        maxPriority.setPriority(Thread.MAX_PRIORITY); // 设置线程的优先级为10

        //开启两个线程
        minPriority.start();
        maxPriority.start();
    }
}

