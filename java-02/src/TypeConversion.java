public class TypeConversion {
    public static void main(String[] args) {
        char c1 = 'a'; // 定义一个char类型
        int i1 = c1; // char 自动转换为int
        System.out.println("char自动类型转化为int后的值等于:" + i1);
        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后值等于:" + i2);

        // 强制类型转换
        TypeConversion obj = new TypeConversion();
        obj.qiangzhi();
    }

    public void qiangzhi() {
        int i1 = 123;
        byte b = (byte)i1;
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }


}
