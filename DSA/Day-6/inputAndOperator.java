import java.util.Scanner;

public class inputAndOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hey! what's your name:");
        // String name = sc.nextLine(); // it takes space after first word. and it ends with next line.
        // sc.nextLine(); // for the consuming of nextLine present in queue.
        // System.out.println("Hi " + name);
        System.out.println(sc instanceof Scanner); // it will return true if sc is an instance of Scanner class.

        System.out.println("Enter your first name:");
        String firstName = sc.nextLine(); // even it doesn't take any space after first word.
        System.out.println("Hi " + firstName);

        System.out.println("Enter your age:");
        // int age = sc.nextInt();
        // sc.nextLine(); // I only need to write after the nextInt() method.
        // System.out.println("Your age is " + age);

        // we use Integer.parseInt() method to convert String to int.
        // to avoid the use of nextInt() method.
        String ageInput = sc.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Your age is " + age);

        // we can use Integer object also, by using the Integer class we'll get more features of Integer class.
        // Integer myAge = Integer.valueOf(ageInput);
        // myAge.  // we can get more features of Integer class using dot operator.


        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println("Your live in " + address);


        // Operators in Java
        // unary
        int op1 = 10;
        // op1++;
        // op1--;
        int y = --op1; // 9
        int x = ++op1; //10
        // System.out.println(op1 +" "+ x + " "+y);
        // op = 10;
        int z = op1++; //z = 10 
        // op = 11
        int a = op1--; //a = 11
        // op = 10
        
        // int op = 15;
        // int ans = op++ + ++op - --op - op++;
        // System.out.println(op + " " + ans);

        // boolean correct = true;
        // System.out.println(correct); 
        // System.out.println(!correct);

        // int val1 = 10; // pos -> -(val+1) -> -11
        // System.out.println(~val1);

        // System.out.println(10/3);
        // 0110001111 >> 2
        // 0001100011

        // 0110001111 << 2
        // 1000111100



        // int val2 = -10;
        // System.out.println(~val2); //-(val+1) 9

        boolean vall1 = true;
        boolean vall2 = true;
        boolean vall3 = false;
        boolean vall4 = false;

        int test = 10;
        // boolean ansss = (++test == 11);
        // System.out.println(ansss);
        // System.out.println( vall3 && (++test == 11) );
        // System.out.println(test);

        // System.out.println( vall1 || (++test == 11) );
        // System.out.println(test);
        // int res = (6>5)?(test++):(test--);
        // System.out.println(test); //11
        // System.out.println(res); //10
        // System.out.println(op1 +" "+ x + " "+y+" "+ z +" "+ a);

        int x11 = 5;

        // x11 = x11+10;
        // x11 += 10;
        // x11 = x11-10;
        // x11 -= 10;

        int x22 = (27 + 40) - x11++ * 5 / 2 + 9 % 100;
        System.out.println(x22);
        

        sc.close();
    }
}
