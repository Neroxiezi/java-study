/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 17:18 2019/5/9
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

class Talk extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("！！来聊天啊....");
        }
    }
}

class Video extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println("==来视频啊....");
        }
    }
}

public class Multi {
    public static void main(String[] args) {
        Talk talk = new Talk();
        talk.start();
        Video video = new Video();
        video.start();
    }
}
