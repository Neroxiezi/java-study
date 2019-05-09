/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 16:35 2019/5/9
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        Swap swap = new Swap();
        swap.swap(a, b);
        System.out.println("调用方法后：a=" + a + ",b=" + b);
    }

    protected void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后: a=" + a + ", b= " + b);
    }
}
