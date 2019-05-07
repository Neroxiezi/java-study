public class DataType {
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float  f;
    static int i;
    static long l;
    static short sh;
    static String str;
    public static void main(String[] args) {
        // byte
        System.out.println("基本类型:byte 二进制位数:" + Byte.SIZE);
        System.out.println("最小值:Byte.MIN_VALUE" + Byte.MIN_VALUE);
        System.out.println("最大值:Byte.MAX_VALUE" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型: short 二进制位数" + Short.SIZE);
        System.out.println("最小值: short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值: short.MAX_VALUE=" + Short.MAX_VALUE);

        // int
        System.out.println("基本类型: int 二进制位数" + Integer.SIZE);

        // long
        System.out.println("基本类型: long 二进制位数" + Long.SIZE);

        DataType obj = new DataType();
        obj.default_value();
    }

    public void default_value() {
        final double PI = 3.14159265;
        System.out.println("Bool:" + bool);
        System.out.println("Byte:" + by);
        System.out.println("Char:" + ch);
        System.out.println("Double:" + d);
        System.out.println("Float:" + f);
        System.out.println("Int:" + i);
        System.out.println("Long:" + l);
        System.out.println("Short:" + sh);
        System.out.println("String:" + str);
        System.out.println("常量:PI = " + PI);
        // PI = 123.123;
        System.out.println("常量:PI = " + PI);

    }


}
