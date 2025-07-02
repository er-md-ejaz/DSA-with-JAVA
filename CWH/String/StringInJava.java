import java.util.Scanner;

public class StringInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = new String("Ejaz");
        // System.out.println("Name: " + name);

        // String name = "Ejaz";
        // System.out.println("Name: " + name);

        // int a = 5;
        // float b = 5.25649f;
        // System.out.printf("a: %d, \nb: %.2f\n", a, b);

        // System.out.format("a: %d, \nb: %.3f\n", a, b);
        
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Last Name: " + lastName);

        sc.close();

    }
}
