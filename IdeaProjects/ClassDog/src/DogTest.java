public class DogTest {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        System.out.print("Первая (" + one.size + ") собака говорит - ");
        one.bark();
        System.out.print("Вторая (" + two.size + ") собака говорит - ");
        two.bark();
        System.out.print("Третья (" + three.size + ") собака говорит - ");
        three.bark();
    }
}
