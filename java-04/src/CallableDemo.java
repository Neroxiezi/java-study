
/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:54 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyCallabel implements Callable {
    @Override
    public Object call() throws Exception {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
        return null;
    }
}

/**
 * A: 创建一个线程池对象, 控制要创建几个线程对象.public static ExecutorService
 * newFixedThreadPool(int nThreads)
 * B: 这种线程池的线程可以执行
 * 可以执行Runnable对象或者Callable对象代表的线程,做一个类实现Runnable接口。
 * C: 调用如下方法即可
 */
public class CallableDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        // 可以执行Runnable对象或者Callable对象代表的线程
        pool.submit(new MyCallabel());
        pool.submit(new MyCallabel());

        // 结束
        pool.shutdown();
    }
}
