import java.util.Scanner;

class ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        String mark = sc.nextLine();
        int marks = Integer.parseInt(mark);

        // if(marks >= 90)
        // {
        //     System.out.println("You are topper as you have secured" + marks);
        // }
       
        // if(marks >35 && marks <90)
        // {
        //     System.out.println("Your marks is :" + marks);
        // }
        
        // if(marks <= 35)
        // {
        //     System.out.println("You have scored only "+ marks + ", improvement required");
        // }

        // if(marks >35)
        // {
        //     System.out.println("Your marks is :" + marks + ", passed");
        // }
        // else 
        // {
        //     System.out.println("You have scored only "+ marks + ", improvement required");
        // }
        // if(marks == 100){
        //     System.out.println("Ultimate Topper");
        // }

        if(marks >= 90)
        {
            System.out.println("You are topper as you have secured" + marks);
        }
        else if(marks >35 && marks <90)
        {
            System.out.println("Your marks is :" + marks);
        }
        else {
            if(marks == 0)
            {
                System.out.println("Bhai kuch toh padh le, "+marks+ " kon pata hai!");
            }        
            else
            {
                System.out.println("You have scored only "+ marks + ", improvement required");
            }
        }
        
        
        
        sc.close();
    }
}