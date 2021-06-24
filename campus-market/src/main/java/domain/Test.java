package domain;

public class Test {
    int age = 1;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public Test(int age) {
        this.age = age;
        System.out.println("有参");
    }

    public Test() {
        System.out.println("无参");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("set");
        this.age = age;
    }
}
