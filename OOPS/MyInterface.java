public class MyInterface {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.calculateArea();
        c.display();
        c.printGreetUser();
        c.fillArea();

        Shape s = new Circle(4);
        s.calculateArea();
        s.display();
        
    }
}

interface Shape {
    String name = "Ejaz";
    void display();
    void calculateArea();
    private void greetUser(){
        System.out.println("Welcome User!");
    }

    default void printGreetUser(){
        greetUser();
    }

    static void printName(){
        System.out.println("Name is: " + name);
    }
    
}

interface Intermediate extends Shape {
    void fillArea();
}

class Circle implements Intermediate, Shape { // Diamond Problem will not arise here.
    private final double pi = 3.14;
    int radius;
    double area;

    Circle (int radius){
        this.radius = radius;
    }

    public void display(){
        System.out.println("Shape is Circle!");
    }

    public void calculateArea(){
        area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void fillArea(){
        System.out.println("Filled!");
    }
}
