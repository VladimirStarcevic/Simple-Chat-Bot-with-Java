import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        scanner.close();

        Vehicle car = new Car(speed);
        Vehicle motorcycle = new Motorcycle(speed);

        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
    }
}

class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(this.getClass().getSimpleName());
        info.append(": Speed ");
        info.append(speed);
        info.append(" mph");
        return info.toString();
    }
}

class Car extends Vehicle {
    private final int numOfDoors;

    public Car(int speed) {
        super(speed);
        this.numOfDoors = 4;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(super.getInfo());
        info.append(", ");
        info.append("Doors: ");
        info.append(numOfDoors);
        return info.toString();
    }
}

class Motorcycle extends Vehicle {
    private final boolean hasSideCar;

    public Motorcycle(int speed) {
        super(speed);
        this.hasSideCar = false;
    }

   public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(super.getInfo());
        info.append(", ");
        info.append("Sidecar: ");
        info.append(hasSideCar);
        return info.toString();
    }

}