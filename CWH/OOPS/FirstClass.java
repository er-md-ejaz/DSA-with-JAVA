
class InnerFirstClass {
    int id;
    String name;
    double salary;
    
    public void printDetails(){
        System.out.println("Id: " +id);
        System.out.println("Name: " +name);
    }

    public double getSalary(){
        return salary;
    }
    
}

public class FirstClass {
    public static void main(String[] args) {
        InnerFirstClass md = new InnerFirstClass();
        md.id = 56;
        md.name = "Ejaz";
        md.salary = 1.2;

        md.printDetails();
        System.out.println(md.getSalary());
        
    }
}
