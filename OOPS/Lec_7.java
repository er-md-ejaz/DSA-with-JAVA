public class Lec_7 {
    public static void main(String[] args) {

        Terminator1 t1 = new Terminator1();
        t1.display(); // parent
        Terminator1 t2 = new Child();
        t2.display(); // child
        // t2.name = "Ansari";
        t2.setName("Ansari");
        t2.display();
        // t1.display();
        t2.display2();

        Child c = new Child();
        c.display2();
    }
}



class Terminator1 {
    String name;
    String pname;
    int age;

    Terminator1(){
        System.out.println("Constructor of parent");
    }

    Terminator1(String name){
        this.name = name;
        System.out.println("Parameterized Constructor of parent");
    }

    public void display(){
        System.out.println("Parent name is: " + name);
    }

    public void display2(){
        System.out.println("Parent2 name is: " + pname);
    }

    public void setName(String name){
        this.name = name;
    }

    // Data Hiding
    private void displayAge(){
        System.out.println("Parent age is: " + age);
    }
}


class Child extends Terminator1 {
    String name;
    String cname;
    int age;

    Child(){
        System.out.println("Constructor of child");
    }

    Child(String name){
        this.name = name;
        System.out.println("Parameterized constructor of child");
    }

    public void display(){
        System.out.println("Child name is: " + name);
    }

    final public void display2(){
        System.out.println("Child2 name is: " + cname);
    }

    public void setName(String name){
        this.name = name;
    }
}


