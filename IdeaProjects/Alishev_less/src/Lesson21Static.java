public class Lesson21Static {
    public static void main(String[] args) {
        Human21 h1 = new Human21("Bob", 40);
        Human21 h2 = new Human21("Tom", 20);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human21.description = "Nice";
      h1.getAllFields();
      h2.getAllFields();
      Human21.description = "Bad";
      h1.getAllFields();
      h2.getAllFields();
    }
}

class Human21 {
    private String name;
    private int age;
    private static int countPeople;
    public static String description;

    public Human21(String name, int age) {
        //System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople() {
        System.out.println("Number of people = " + countPeople);
    }
    public void getAllFields() {
        System.out.println(name+ ", "+age+", "+description);
    }
//        public static void getDescription() {
//            System.out.println(description);
//        }
    }