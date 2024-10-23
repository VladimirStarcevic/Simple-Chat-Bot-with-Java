public class Main {
    public static void main(String[] args) {
        // Your code here
        Dog dog = new Dog();
        System.out.println(dog.speak());
    }
}

class Animal {
    public String speak() {
        return "Animal sound...";
    }
}

class Dog extends Animal {
    public String speak() {
        return "Bark!";
    }
}