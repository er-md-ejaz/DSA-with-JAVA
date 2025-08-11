import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


        // References of Objects
        String nameString = "Ejaz";
        System.out.println(nameString); // Ejaz
        String titleString = nameString; 
        System.out.println(titleString); // Ejaz
        System.out.println(nameString); // Ejaz 
        titleString = "Ansari"; 
        System.out.println(titleString); // Ansari
        System.out.println(nameString); // Ejaz

    }
    static void change(int[] arr) {
        arr[0] = 99;
    }

}