/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 13:13 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class Single {
    // private static Single s = new Single();
    private static Single s = null;

    private Single() {
    }

    public static Single getInstance() {
        //return s;
        if (s == null)
            s = new Single();
        return s;
    }

}

public class SingleDemo {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
    }
}
