// T -> Type
// E -> Element
// K -> Key
// V -> Value

public class MyGeneric {
    public static void main(String[] args) {
        IntegerDisplayer obj = new IntegerDisplayer();
        obj.setNum(50);
        obj.display();

        DoubleDisplayer obj1 = new DoubleDisplayer();
        obj1.setNum(25.1);
        obj1.display();

        Displayer<Integer> obj2 = new Displayer<>();
        obj2.setNum(15);
        obj2.display();

        Displayer2<Student> obj3 = new Displayer2<>();
        obj3.setNum(new Student());
        obj3.display();

        MyGeneric mg = new MyGeneric();
        mg.heyGeneric("Ejaz");

    }

    public <E> void heyGeneric(E name){
        System.out.println("Hi " + name);
    }

}


class IntegerDisplayer {
    Integer num;
    public void setNum(Integer num) {
        this.num = num;
    } 

    public void display(){
        System.out.println("Element -> " + this.num);
    }
}

class DoubleDisplayer {
    Double num;
    public void setNum(Double num) {
        this.num = num;
    } 

    public void display(){
        System.out.println("Element -> " + this.num);
    }
}

class Displayer <T> {
    T num;
    public void setNum(T num) {
        this.num = num;
    } 

    public void display(){
        System.out.println("Element -> " + this.num);
    }
}

class Displayer2 <T extends College> {
    T num;
    public void setNum(T num) {
        this.num = num;
    } 

    public void display(){
        System.out.println("Element -> " + this.num);
    }
}

class College {
    void printCollegeName(){
        System.out.println("XYZ Institute of Technology");
    }
}

class Student extends College {
    void printName(){
        System.out.println("Student name printed");
    }
}

class Teacher extends College {
    void printName(){
        System.out.println("Teacher name printed");
    }
}