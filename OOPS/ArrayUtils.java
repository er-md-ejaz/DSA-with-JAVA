public class ArrayUtils {
    // Generic Method to reverse an array
    public static <T> void reverseArray(T[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Generic Method to print an array
    public static <T> void printArray(T[] array) {
        System.out.print("Array: ");
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== Generic Method Demo ===");
        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before reversing:");
        printArray(intArray);
        reverseArray(intArray);
        System.out.println("After reversing:");
        printArray(intArray);
        // Test with String array
        String[] strArray = {"Apple", "Banana", "Cherry"};
        System.out.println("\nBefore reversing:");
        printArray(strArray);
        reverseArray(strArray);
        System.out.println("After reversing:");
        printArray(strArray);
    }
}