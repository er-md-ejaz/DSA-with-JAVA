// import java.util.Scanner;

class Maths1 {
    public static void main(String[] args) {
        Maths1 db = new Maths1();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // String num = sc.nextLine();
        // int n = Integer.parseInt(num);
        // System.out.println("Enter the base: ");
        // String num2 = sc.nextLine();
        // int base = Integer.parseInt(num2);
        // int binary = (int) db.decimalToAnyBase(n, base);
        // System.out.println("Binary Number: " +binary);

        // System.out.println("Decimal Number: " +db.anyBaseToDecimal(101, 4));

        System.out.println("Power using fast exponentiation: " +db.fastExponentiation(2, 5));

        // sc.close();
        
    }

    // public long decimalToAnyBase(int n, int base) {
    //     long binary = 0;
    //     int rem;
    //     int i = 0;
    //     while(n>0){
    //         rem = n % base;
    //         n /= base;
    //         q_ary = (int) (q_ary + (rem*(Math.pow(10, i))));
    //         i++;
    //     }
    //     return q_ary;
    // }

    // public int anyBaseToDecimal (int n, int base){
    //     int unitDigit;
    //     int i = 0;
    //     int decimal = 0;
    //     while (n>0) {
    //         unitDigit = n % 10;
    //         n /= 10;
    //         decimal = (int) (decimal + (unitDigit * Math.pow(base, i)));
    //         i++;
    //     }

    //     return decimal;
    // }


    public double fastExponentiation(int n, int power){
        int result = 1;

        while (power > 0) {
            if(power%2 != 0){
                result *= n;
                power = (power-1)/2;
            }
            else{
                power /= 2;
            }
            n = n*n;

        }
        return result;
    }


}