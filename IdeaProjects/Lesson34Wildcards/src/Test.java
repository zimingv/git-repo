import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOFAnimal = new ArrayList<>();
        listOFAnimal.add(new Animal(1));
        listOFAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOFAnimal);
        test(listOfDogs);

        }
    private static void test(List<? extends Animal> list) { //extends - наследуемые, super - все родители Animal
        for (Animal animal:list) {
            animal.eat();
        }
    }
}
