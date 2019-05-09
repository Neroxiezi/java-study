import java.util.Random;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 16:13 2019/5/9
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
public class yzm {
    public static void main(String[] args) {

        char[] arr = {'中', '国', 'A', 'a', 'f'};
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(arr.length);
            sb.append(arr[index]);
        }
        System.out.println(sb);

    }
}
