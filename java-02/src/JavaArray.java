import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaArray {
    public static void main(String[] args) {
        int size = 10;
        //定义数组
        double[] myList = new double[size];
        System.out.println(myList);
        myList[0] = 1;
        System.out.println(myList);
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
            System.out.println(myList[i]);
        }
        System.out.println(total);

        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        // for-each 循环
        for (double element : myList) {
            System.out.println(element);
        }

        String str[][] = new String[1][4];
        System.out.println(str);
        System.out.println(new SimpleDateFormat("yy-MM-dd").format(new Date()));
        System.out.printf("年月日格式: %tF",new Date());
    }
}
