import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int animalType = scanner.nextInt();

        Animal animal;

        if (animalType == 1) {
            animal = new Cat();
        } else if (animalType == 2) {
            animal = new Dog();
        } else {
            animal = new Animal();
        }

        animal.makeSound();
    }
}

class Animal {
    public void makeSound(){
        if (this instanceof Cat) {
            System.out.println("Meow");
        } else if (this instanceof Dog) {
            System.out.println("Woof");
        }
    }
}

class Cat extends Animal {
    @java.lang.Override
    public void makeSound() {
        super.makeSound();
    }
}

class Dog extends Animal {
    @java.lang.Override
    public void makeSound() {
        super.makeSound();
    }
}