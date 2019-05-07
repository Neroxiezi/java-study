public class Puppy {
    int puppyAge;

    // 构造方法
    public Puppy(String name) {
        System.out.println("找到的动物:" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("动物的年龄:" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy("小猫");
        obj.setAge(18);
        obj.getAge();
        System.out.println("属性值:" + obj.puppyAge);
    }

}
