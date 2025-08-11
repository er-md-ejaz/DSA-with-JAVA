
public class BitManipulation {
    public static void main(String[] args) {
        // printBits(35);
        // printOddEven(10);
        // System.out.println(isBitSet(5, 0));
        // int res = setBit(35, 5);
        // printBits(res);
        // int res = toggleBits(10, 2);
        // printBits(res);
        // printBits(89);
        // int res = unsetBits(89, 3);
        // printBits(res);
        // isPowerOfTwo(35);
        // printBits(48);
        // int res = unsetRightMostBit(48);
        // printBits(res);
        noOfSetBits(15);

    }

    // print the bits of any number.
    public static void printBits(int n){
        int bits;
        System.out.println();
        for(int i=7; i >= 0; i--){
            bits = ((n & (1 << i)) != 0 ? 1 : 0);
            System.out.print(bits);
        }
        System.out.println();
    }

    // print odd or even of a number using bit manipulation 
    public static void printOddEven(int n) {
        int bits = (n & 1) != 0 ? 1 : 0;
        if(bits == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }

    // check a bit is set or not
    public static boolean isBitSet(int n, int i){
        return (n & (1 << i)) != 0 ? true : false;
    }

    // set a bit at index i
    public static int setBit(int n, int i){
        int bits = (n | (1 << i));
        System.out.print(bits);
        return bits;    
    }

    // Toggle a bit of a number
    public static int toggleBits(int n, int i){
        return n ^ (1<<i);
    }

    // unset the ith bit of a number
    public static int unsetBits(int n, int i){
        return (n & (~(1<<i)));
    }

    public static void isPowerOfTwo(int n){
        boolean power = ((n & (n-1)) == 0) ? true : false;
        if(power){
            System.out.println(n + " is power of two.");
            return;
        }
        System.out.println(n + " is not power of two.");
        return;
    }

    public static int unsetRightMostBit(int n){
        return (n & (n-1));
    }

    public static void noOfSetBits(int n){
        int counter = 0;
        while (n != 0) {
            n = unsetRightMostBit(n);
            counter++;
        }
        System.out.println(counter);
    }

}
