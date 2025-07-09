public class BitonicArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 9, 11, 7, 2, 1 };
        System.out.println(minimumElement(arr));
    }

    
    public static int minimumElement(int arr[]) {
        return Math.min(arr[0], arr[arr.length - 1]);
    }
}
