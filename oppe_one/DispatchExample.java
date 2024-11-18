
import java.util.Scanner;

class Vehicle {
    private String name;

    public Vehicle(String n) {
        name = n;
    }
    // Define method display
    public void display() {
        System.out.println();
    }
    // Define an accessor method
}

// Define class Car
// Define class Bicycle
public class DispatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("");
        vehicles[1] = new Car(sc.nextLine());
        vehicles[2] = new Bicycle(sc.nextLine());
        for (Vehicle v : vehicles) {
            v.display();
        }
        sc.close();
    }
}