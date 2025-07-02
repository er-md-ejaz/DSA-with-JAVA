import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        String row = sc.nextLine();
        int rows = Integer.parseInt(row);
        System.out.println("Enter the number of columns: ");
        String column = sc.nextLine();
        int columns = Integer.parseInt(column);
        
        int [] [] arr = new int[rows][columns];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of array are: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
