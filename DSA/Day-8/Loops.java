import java.util.Scanner;

class Loops {
    public static void main(String[] args) {

        // For loop
        Scanner sc = new Scanner(System.in);
        sc.close();
        // System.out.println("Enter name: ");
        // String name = sc.nextLine();
        // for(int pos = 0; pos < name.length(); pos++)
        // {
        //     char ch = name.charAt(pos);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         System.out.println("Vowel:\t" + name.charAt(pos));
        //     }
        //     else{
        //         System.out.println("Consonants:\t" + name.charAt(pos));
        //     }
        // }


        // For Each loop
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name: ");
        // String name = sc.nextLine();

        // for(char ch : name.toCharArray()){
        //     System.out.println(ch);
        // }


        // While loop
        // int number = 27;
        // while(number != 0 ){
        //     System.out.println(number);
        //     number = number/2;
        // }


        // Do While loop
        int number = 27;    
        do {
            System.out.println(number);
            number = number/2;
        }while(number != 0);

    }    
}
