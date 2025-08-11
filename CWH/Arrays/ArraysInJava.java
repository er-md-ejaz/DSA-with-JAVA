import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // System.out.println("Enter the elements of array: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("The elements of array are: ");
        
        // array iteration using for loop

        // for(int i=0; i < arr.length; i++){
        //     System.out.print( +arr[i] + " ");
        // }

        // array iteration using for-each loop
        float [] floatArray = new float[5];
        System.out.println("Enter the elements of float array: ");
        for(int i = 0; i < floatArray.length; i++){
            floatArray[i] = sc.nextFloat();
        }

        // System.out.println("The elements of float array are: ");
        // for(float elem : floatArray){
        //     System.out.print(elem + " ");
        // }

        System.out.println("Reversed float array: ");
        for(int i = floatArray.length - 1; i >= 0; i--){
            System.out.print( +floatArray[i] + " ");
        }

        sc.close();
    }
}
