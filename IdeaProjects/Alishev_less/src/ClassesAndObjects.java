public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndVozrast("Roman", 20); //Вызвали метод и подставили значение Роман
        person1.speak(); //Вызвали метод
        person1.sayHello();
        int year1 = person1.calculateYearsToRetirement(); //Вызвали значение из метода
        System.out.println("Первому человеку до пенсии " + year1 + "лет");
        person1.calculateYearsToRetirement();
        Person person2 = new Person();
        String s1 = "Вова";
        person2.setNameAndVozrast(s1, 30);
        person2.speak();
    }
}
class Person {
    String name;
    int age;
    int vozr;
    void setNameAndVozrast(String userName, int userAge) {
        name = userName;
        age = userAge;
    }
    int calculateYearsToRetirement () { //Возвращаем целое число
        int years = 65-age;
     return years;
    }
    void speak() {
        for (int i = 0; i <= 2; i++){
            System.out.println("Меня зовут - " + name + "," + "мне " + age + "лет");
        }
    }
    void sayHello() {
        System.out.println("Hello!");
    }
}
