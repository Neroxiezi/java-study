public class Dog {
    String breed;
    int age;
    String color;

    void barking() {

    }

    void hungry() {

    }

    void sleeping(String name) {
        System.out.println("睡觉的名字是:" + name);

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleeping("小猫");
    }
}
