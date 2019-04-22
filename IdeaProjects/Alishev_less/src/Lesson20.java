public class Lesson20 {
    public static void main(String[] args) {
    Humanoid human1 = new Humanoid("Bob", 15);
    }
}

class Humanoid {
    private String name;
    private int age;

    public Humanoid() {
        this.name = "Имя по умолчанию";
        this.age = 16;
        System.out.println("Привет из первого конструктора!");
    }

    public Humanoid(String name) {
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }
    public Humanoid(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}