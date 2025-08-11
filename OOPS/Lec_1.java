// package OOPS;

import java.util.Scanner;

class Car {
    String brand;
    String model;
    int speed;
    String color;
    boolean isABSPresent;

    // Constructor with arguments and This is called parameterized constructor.
    Car(String brand, String model, String color, int speed, boolean isABS) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        isABSPresent = isABS;
    }

    // This is Default Constructor
    Car(){
        System.out.println("This is Default");
        this.brand = "Maruti";
        this.model = "Swift";
        this.color = "White";
        this.speed = 40;
        isABSPresent = false;
    }

    // Copy Constructor
    Car (Car newCar) {
        this.brand = newCar.brand;
        this.model = newCar.model;
        this.color = newCar.color;
        this.speed = newCar.speed;
        this.isABSPresent = newCar.isABSPresent;
    }

    public void drive(){
        System.out.println("Driving");
    }

    public void speedUp(int newSpeed){
        speed = newSpeed;
        System.out.println("Speed Up");
    }
    
}

public class Lec_1 {
    public static void main(String[] args) {
        // Car obj; // Memory is not allocating here.
        
        // Default Constructor
        // Car obj1 = new Car(); // But here memory is allocating.
        // System.out.println(obj1.brand);

        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter Model: ");
        String model = sc.nextLine();
        System.out.println("Enter Color: ");
        String color = sc.nextLine();
        System.out.println("Enter Speed: ");
        String speedString = sc.nextLine();
        int speed = Integer.parseInt(speedString);
        System.out.println("Enter isABSPresent: ");
        boolean isABSPresent = sc.nextBoolean();
        sc.close();

        // initializing second object
        // Parameterized Constructor
        Car obj2 = new Car(brand, model, color, speed, isABSPresent);
        // System.out.println("Brand: " + obj2.brand);
        // System.out.println("Model: " + obj2.model);
        // System.out.println("Color: " + obj2.color);
        // System.out.println("Speed: " + obj2.speed);
        // System.out.println("isABSPresent: " + obj2.isABSPresent);

        // Copy Constructor -> Deep Copy (To copy the values)
        Car obj3 = new Car(obj2);
        obj3.drive();
        // System.out.println("Brand: " + obj3.brand);
        // System.out.println("Model: " + obj3.model);
        // System.out.println("Color: " + obj3.color);
        // System.out.println("Speed: " + obj3.speed);
        // System.out.println("isABSPresent: " + obj3.isABSPresent);

        // Same Referencing -> Shallow Copy (To copy the reference)
        // Car obj4 = obj2;
        // System.out.println(obj2.speed);
        // System.out.println(obj4.speed);
        // obj2.speed = 50;
        // System.out.println(obj2.speed);
        // System.out.println(obj4.speed);

    }
    
}