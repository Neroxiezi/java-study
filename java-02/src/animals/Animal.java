package animals;

public class Animal {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是:" + age);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.pupAge();
    }
}
/**
 *  实例变量:
 *      实例变量声明在一个类中,但在方法,构造方法和语句块之外
 *      当一个对象被实例之后, 每个实例变量的值就跟着确定
 *
 *
 *
 */
