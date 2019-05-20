/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 16:10 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
// 定义任务类
class TaskSleep implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                if (i == 3) {
                    Thread.sleep(2000); //当前线程休眠2秒
                } else {
                    Thread.sleep(500);
                }
                System.out.println("线程-->正在输出:" + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) throws Exception {
        // 创建一个线程
        new Thread(new TaskSleep()).start();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                Thread.sleep(2000); //当前main主线程 休眠2秒
            } else {
                Thread.sleep(500);
            }
            System.out.println("main主线程正在输出：" + i);
        }
    }
}
