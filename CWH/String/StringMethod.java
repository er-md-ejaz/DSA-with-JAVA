import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        // String name = "Md Ejaz Ansari";
        // int len = name.length();
        // System.out.println("length of string: " +len);
        
        // String nameLower = name.toLowerCase();
        // System.out.println("Lower case: " +nameLower);

        // String nameUpper = name.toUpperCase();
        // System.out.println("Upper case: " +nameUpper);

        // String collegeName = "   NIT SIKKIM      ";
        // System.out.println("Original String: " +collegeName);
        // String trimedString = collegeName.trim();
        // System.out.println("Trimed String: " +trimedString);
        // System.out.println("Length of Original String: " +collegeName.length());
        // System.out.println("Length of Trimed String: " +trimedString.length());

        // String phone = "Nothing";
        // System.out.println(phone.substring(3));
        // System.out.println(phone.substring(3, 5));
        // System.out.println(phone.substring(3, 6));
        // System.out.println(phone.substring(3, 7));
        // System.out.println(phone.substring(3, 8)); // it gives error because the end index is out of range.
    
        String collegeName = "NIT PATNA";
        // System.out.println(collegeName.replace("N", "I"));
        // System.out.println(collegeName.replace("PATNA", "SIKKIM"));
        // System.out.println(collegeName.replace("N", "II"));
        // String replacedString = collegeName.replace("N", "II");
        // System.out.println("Replaced String: " +replacedString);
        // System.out.println("length: " +replacedString.length());

        // System.out.println(collegeName.startsWith("N"));
        // System.out.println(collegeName.startsWith("I"));
        // System.out.println(collegeName.startsWith("NIT"));

        // System.out.println(collegeName.endsWith("N"));
        // System.out.println(collegeName.endsWith("A"));
        // System.out.println(collegeName.endsWith("TNA"));

        // System.out.println(collegeName.charAt(2));
        // System.out.println(collegeName.charAt(0));

        // System.out.println(collegeName.indexOf("IT"));
        // System.out.println(collegeName.indexOf("N"));
        // System.out.println(collegeName.indexOf("PATNA"));
        // System.out.println(collegeName.indexOf("N", 2));
        // System.out.println(collegeName.indexOf("sfo"));

        // String collegeName = "NIT PATNA";
        // System.out.println(collegeName.lastIndexOf("A"));
        // System.out.println(collegeName.lastIndexOf("TN"));
        // System.out.println(collegeName.lastIndexOf("A", 5));

        // System.out.println(collegeName.equals("NIT PATNA"));
        // System.out.println(collegeName.equals("NIT"));

        // System.out.println(collegeName.equalsIgnoreCase("NIT patna"));
        // System.out.println(collegeName.equalsIgnoreCase("nit paTna"));

        // Escape Sequences
        // System.out.println("\"Hello World!\"");
        // System.out.println("Hello World!\n");
        // System.out.println("He\tllo World!\t");
        // System.out.println("Hello World!\b");
        // System.out.println("Hello World!\r");
        // System.out.println("Hello World!\f");
        // System.out.println("Hello World!\'");
        // System.out.println("Hello World!\\");
        // System.out.println("Hello World!\0");


        // Problems
        String greeting = "Dear <|name|>, Thanks a lot!";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        greeting = greeting.replace("<|name|>", firstName);
        System.out.println(greeting);

        sc.close();
    }
}
