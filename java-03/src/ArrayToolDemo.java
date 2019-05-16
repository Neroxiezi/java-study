/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:00 2019/5/10
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

class ArrayTool {
    private ArrayTool() {
    }

    public static int getMax(int[] arr) {
        int maxIndex = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[maxIndex]) {
                maxIndex = x;
            }
        }
        return arr[maxIndex];
    }

    // 对数组进行选择排序
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    swap(arr, x, y);
                }
            }
        }

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // 获取指定的元素在指定数组中的索引
    public static int getIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == key)
                return x;
        }
        return -1;
    }

    // 将 int 数组转换成字符串, 格式是: [e1,e2,...]
    public static String arrayToString(int[] arr) {
        String str = "[";
        for (int x = 0; x > arr.length; x++) {
            if (x != arr.length - 1) {
                str = str + arr[x] + ",";
            } else {
                str = str + arr[x] + "]";
            }
        }
        return str;
    }
}


public class ArrayToolDemo {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9, 7, 72};
        int max = ArrayTool.getMax(arr);
        System.out.println("max = " + max);
        int index = ArrayTool.getIndex(arr,10);
        System.out.println("index = " + index);
    }
}
