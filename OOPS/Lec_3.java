// package OOPS;

//! Single Layer Inheritance

// class Terminator1 {
//     String pname;
//     int page;

//     public void displayParent(){
//         System.out.println("Parent name is: " + pname);
//         displayAge();
//     }

//     // Data Hiding
//     private void displayAge(){
//         System.out.println("Parent age is: " + page);
//     }
// }

// class Child extends Terminator1 {
//     String cname;
//     int cage;
//     public void displayChild(){
//         System.out.println("Child name is: " + cname);
//     }
// }


//! Multi Layer Inheritance

// class Terminator1 {
//     String pname;
//     int page;

//     public void displayParent(){
//         System.out.println("Parent name is: " + pname);
//         displayAge();
//     }

//     // Data Hiding
//     private void displayAge(){
//         System.out.println("Parent age is: " + page);
//     }
// }

// class Child1 extends Terminator1 {
//     String c1name;
//     int c1age;
//     public void displayChild1(){
//         System.out.println("Child name is: " + c1name);
//     }

//     private void displayChildAge(){
//         System.out.println("Child age is: " + c1age);
//     }
// }

// class Child2 extends Child1 {
//     String c2name;
//     int c2age;
//     public void displayChild2(){
//         System.out.println("Child 2 name is: " + c2name);
//     }
// }


//! Hierarchical Inheritance

// class Terminator1 {
//     String pname;
//     int page;

//     public void displayParent(){
//         System.out.println("Parent name is: " + pname);
//         displayAge();
//     }

//     Data Hiding
//     private void displayAge(){
//         System.out.println("Parent age is: " + page);
//     }
// }

// class Child1 extends Terminator1 {
//     String c1name;
//     int c1age;
//     public void displayChild1(){
//         System.out.println("Child name is: " + c1name);
//     }

//     private void displayChildAge(){
//         System.out.println("Child age is: " + c1age);
//     }
// }

// class Child2 extends Terminator1 {
//     String c2name;
//     int c2age;
//     public void displayChild2(){
//         System.out.println("Child 2 name is: " + c2name);
//     }
// }


//! Hybrid Inheritance

class Terminator1 {
    String pname;
    int page;

    public void displayParent(){
        System.out.println("Parent name is: " + pname);
        displayAge();
    }

    // Data Hiding
    private void displayAge(){
        System.out.println("Parent age is: " + page);
    }
}

class Child1 extends Terminator1 {
    String c1name;
    int c1age;
    public void displayChild1(){
        System.out.println("Child name is: " + c1name);
    }

    private void displayChildAge(){
        System.out.println("Child age is: " + c1age);
    }
}

class Child2 extends Child1 {
    String c2name;
    int c2age;
    public void displayChild2(){
        System.out.println("Child 2 name is: " + c2name);
    }
}

class Child3 extends Child1 {
    String c2name;
    int c2age;
    public void displayChild2(){
        System.out.println("Child 2 name is: " + c2name);
    }
}


public class Lec_3 {
    public static void main(String[] args) {
        // Terminator1 t1 = new Terminator1();
        // t1.pname = "Ansari";
        // t1.displayParent();
        // Child c1 = new Child();
        // c1.displayChild();
        // c1.displayParent();


        Terminator1 t2 = new Terminator1();
        t2.pname = "Ansari";
        t2.displayParent();
        Child1 c1 = new Child1();
        c1.displayChild1();
        c1.displayParent();
        Child2 c2 = new Child2();
        c2.displayChild2();

    }
}
