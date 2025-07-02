import java.util.Scanner;

class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        String mark = sc.nextLine();
        int marks = Integer.parseInt(mark);

        switch (marks) {
            case 100:
                System.out.println("Ultimate Topper");
                break;
            case 90:
                System.out.println("You are topper as you have secured" + marks);
                break;
            case 80:
                System.out.println("You are topper as you have secured" + marks);
                break;
            case 70:
                System.out.println("You are topper as you have secured" + marks);
                break;
            default:
                if (marks > 35 && marks < 90) {
                    System.out.println("Your marks is :" + marks);
                } else {
                    if (marks == 0) {
                        System.out.println("Bhai kuch toh padh le, " + marks + " kon pata hai!");
                    } else {
                        System.out.println("You have scored only " + marks + ", improvement required");
                    }
                }
        }

        sc.close();
    }    
}
