/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 13:30 2019/5/20
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
interface USB {
    public void open();

    public void close();
}

class UPan implements USB {
    @Override
    public void open() {
        System.out.println("upan open");
    }

    @Override
    public void close() {
        System.out.println("upan close");
    }
}

class UsbMouse implements USB {
    @Override
    public void open() {
        System.out.println("usbMouse open");
    }

    @Override
    public void close() {
        System.out.println("usbMouse close");
    }
}

public class BookPC {
    public static void main(String[] args) {
        // 功能扩展了
        useUSB(new UPan());
    }

    public static void useUSB(USB u) {
        if (u != null) {
            u.open();
            u.close();
        }
    }
}
