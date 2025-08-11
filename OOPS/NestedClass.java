public class NestedClass {
    public static void main(String[] args) {
        // Member Inner Class

        // Outer obj = new Outer();
        // Outer.Inner innerObject = obj.new Inner();
        // obj.displayData();
        // innerObject.displayData();


        // Local Inner Class
        
        // OuterClass outer = new OuterClass();
        // outer.outerMethod();

        
        // Anonymous Inner Class

        // NoName nn = new NoName() {
        //     void display() {
        //         System.out.println("Anonymous display");
        //     }

        //     void print() {
        //         System.out.println("Anonymous Print");
        //     }
        // };

        // nn.display();
        // nn.print();

        // NoGame ng = new NoGame() {
        //     public void display(){
        //         System.out.println("NoGame display");
        //     }
        // };

        // ng.display();


        // static nested class

        OuterNonStatic ons = new OuterNonStatic();
        OuterNonStatic.InnerStatic obj = new OuterNonStatic.InnerStatic();
        obj.display();

        // no need of object to access the static method
        OuterNonStatic.InnerSecondStatic.display();


    }
}

// Member Inner Class

class Outer {
    static int rollNumber;
    String name;
    private int age;
    int data;

    Outer(){
        rollNumber = 100;
        this.name = "Ejaz";
        this.age = 20;
        this.data = 10;
        System.out.println("Init Outer");
    }

    public void displayData(){
        System.out.println("Outer Data is: " + data);
        Inner obj = new Inner();
        System.out.println("Inner Data is: " + obj.data);
        System.out.println("Inner rollNumber is: " + Inner.rollNumber);
    }

    // Member Inner Class
    class Inner {
        static int rollNumber;
        static String name;
        int data;
        
        Inner(){
            name = "Inner";
            this.data = 20;
            System.out.println("Init Inner");
        }

        Inner(int data){
            name = "inner";
            this.data = data;
        }

        public void displayData(){
            System.out.println("Data is: " + data); // outer / Inner ?
            System.out.println("Outer Data is: " + Outer.this.data);
            System.out.println("Outer age is: " + Outer.this.age);
            Outer.this.displayData();
        }

        public void displayRollNumber(){
            System.out.println("Outer RollNumber is: " + Outer.rollNumber);
            System.out.println("Inner RollNumber is: " + rollNumber);
        }
    }

    class InnerNew extends Inner {

    }
}

// Local Inner Class

class OuterClass {
    private int outerData = 300;

    void outerMethod() {
        final int localVar = 50;

        // Local Inner Class
        class LocalInnerClass {
            void display() {
                System.out.println("Local Inner Class accessing outer data: " + outerData);
                System.out.println("Local Inner Class accessing local variable: " + localVar);
            }
        }

        // Create instance of local inner class
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}

// Anonymous Inner Class

class Normal {

    void display(){
        System.out.println("This is Normal class");
    }
}

abstract class NoName {
    abstract void display();
    abstract void print();
}

interface NoGame {
    void display();
}


// Static Nested Inner Class

class OuterNonStatic {
    static int age;
    String name;
    static class InnerStatic {
        void display(){
            age = 20;
            // name = "Ejaz"; //can't be access due to non-static variable.
            System.out.println("Non static method inside static inner class");
        }
    }

    static class InnerSecondStatic {
        static void display(){
            System.out.println("Static method inside static second inner class");
        }
    }
}


