public class Incapsulation {
    public static void main(String[] args) {
        PersonInc person1 = new PersonInc();
        person1.setName("");
        person1.setAge(-1);
        person1.getName();
        person1.getAge();
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak();
    }
}
class PersonInc {
    private String nameInc;
    private int ageInc;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        }
        else{
            nameInc = userName;
        }
    }
    public String getName() {
        return nameInc;
    }
    public void setAge(int userAge) {
        if (userAge<0) {
            System.out.println("Возраст не может быть меньше 0");
        } else ageInc = userAge;
        }

    public int getAge() {
        return ageInc;
    }
        int calculateYearsToRetirement() {
        int years = 65-ageInc;
        return years;
    }
    void speak () {
        for (int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + nameInc + " мне " +ageInc+ " лет");
        }

        }
    void sayHello() {
        System.out.println("Привет!");
    }
}