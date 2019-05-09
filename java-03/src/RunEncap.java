/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 12:54 2019/5/9
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */
class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }

}

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        System.out.println("Name: " + encap.getName() + "Age: " + encap.getAge());
    }
}
