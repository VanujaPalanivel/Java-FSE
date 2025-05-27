class Animal {
        void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
        @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
    }
}
