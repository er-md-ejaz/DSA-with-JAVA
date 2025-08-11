public class BitManipulation2 {
    public static void main (String [] args){

        // printBits(180);
        // int res1 = clearLSB(180, 5);
        // printBits(res1);
        // int res2 = clearMSB(180, 5);
        // printBits(res2);

        // System.out.println(convertCharToUpperCase('a'));
        // System.out.println(convertCharToLowerCase('E'));

        // swap(5, 4);

        int []arr = {2, 3, 5, 2, 6, 5, 3, 7};
        // uniqueElement(arr);
        twoUniqueElement(arr);
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

    // clear LSB
    public static int clearLSB(int n, int bit){
        return n & ~((1<<bit+1)-1);
    }

    // clear MSB
    public static int clearMSB(int n, int bit){
        return (n & ((1<<bit)-1));
    }

    // character conversion
    public static char convertCharToUpperCase(char ch){
        int charNum = (int) ch;
        return (char) (charNum & ~(1<<5));
    }

    public static char convertCharToLowerCase(char ch){
        int charNum = (int) ch;
        return (char) (charNum | (1<<5));
    }

    // Swap two numbers using bit manipulation
    public static void swap(int n1, int n2){
        System.out.printf("%d, %d", n1, n2);
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println();
        System.out.printf("%d, %d", n1, n2);
    }

    // print only one unique element
    public static void uniqueElement(int []arr){
        int unique = 0;
        for(int i=0; i<=arr.length-1; i++){
            unique = arr[i]^unique;
        }
        System.out.println(unique);
    }

    // print two unique element
    public static void twoUniqueElement(int []arr){
        int unique = 0;
        for(int i=0; i<=arr.length-1; i++){
            unique = arr[i]^unique;
        }
        int setBit = 0;
        int bit = 0;
        while (unique != 0) {
            if((unique>>bit & 1)!=0){
                setBit = bit;
                break;
            }
            bit++;
        }
        int unique1 = 0;
        for(int i=0; i<=arr.length-1; i++){
            if ((arr[i] >> setBit & 1)!=0) {
                unique1 = unique1 ^ arr[i];
            }
        }
        int n1 = unique ^ unique1;
        int n2 = n1 ^ unique;

        System.out.println("n1: "+n1+ ", n2: "+n2);
    }
}