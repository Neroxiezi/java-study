public class Variable {
    static int allClicks = 0; // 类变量
    String str = "hello world"; // 实例变量

    public static void main(String[] args) {
        String str = "大爷的"; // 局部变量
        System.out.println(str);
        Variable obj = new Variable();
        System.out.println(obj.str);
        System.out.println(obj.str);
    }
}
