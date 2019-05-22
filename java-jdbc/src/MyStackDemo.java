import java.util.LinkedList;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 16:20 2019/5/21
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

/**
 * ArrayList：底层数据结构是数组，查询快，增删慢，非线程安全，效率高，数据增长为原来的50%
 * Vector：底层数据结构是数组，查询快，增删慢，线程安全，效率低，数据增长为原来的一倍
 * LinkedList：底层数据结构是链表，查询慢，增删快，非线程安全，效率高
 *
 * LinkedList 链表特有的功能
 *
 *  addFirst()    在集合的第0个位置添加元素
 *  addLast()     再集合的最后位置添加元素
 *  getFirst()    获取集合的第0个元素
 *  getLast()     获取集合的最后一个元素
 *  removeFirst()  删除集合的第0个元素
 *  removeLast()   删除集合的最后一个元素
 */
class MyStack {
    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        link.addFirst(obj);
    }

    public Object get() {
        // 移除并返回列表的第一个元素
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}


public class MyStackDemo {
    public static void main(String[] args) {
        // 创建集合对象
        MyStack ms = new MyStack();
        // 添加元素
        ms.add("hello");
        ms.add("world");
        ms.add("java");
        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}
