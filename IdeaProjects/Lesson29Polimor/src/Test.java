public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Dog dog1 = new Dog();
//        animal1.eat();
//        dog1.eat();
//        Animal animal = new Dog();
//        animal.eat();
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();
        test(animal1);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
