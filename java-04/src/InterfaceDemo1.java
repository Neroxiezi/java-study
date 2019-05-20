/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 13:28 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
interface A {
    public void show();
}

interface Z {
    public void show();
}

// 多实现

class Test implements A,Z {
    @Override
    public void show() {
        System.out.println("Test");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
