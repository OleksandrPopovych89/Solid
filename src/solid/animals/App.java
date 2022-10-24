package solid.animals;

public class App {
    final static Animal[] animals = {new Dog(),
            new Mouse(), new Cat()};

    static void animalSound(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
