
public class FloorAndCeil {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 4, 4, 6, 7, 11, 16 };
        // int result = binarySearchFloor(arr, 2);
        // System.out.println(result);

        // System.out.println(binarySearchCeil(arr, 8));
        char letters[] = {'c','f','j'}; 
        char target = 'k';
        System.out.println(binarySearchCeil(letters, target));
    }

    // finding floor value using binary search
    public static int binarySearchFloor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return ans;
    }

    // finding ceil value using binary search
    public static char binarySearchCeil(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        char ans = arr[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
                ans = arr[mid];
            } else {
                return arr[mid];
            }
        }
        return ans;
    }
}
