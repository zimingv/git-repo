public class Test {
    public static void main(String[] args) {
       // Upcasting - Восходящее преобразование так как наследуемый класс стал таким же как родитель. Неявное
        Dog dog = new Dog();
        Animal animal = dog;

        //Downcasting - Нисходящее преобразование. Явное
        Dog dog2 = (Dog) animal;
        dog2.bark();

    }


}
