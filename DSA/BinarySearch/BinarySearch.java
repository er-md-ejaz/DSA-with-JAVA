
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 11, 13, 18, 20};
        // System.out.println(binarySearch(arr, 13));

        int arr2[] = {98, 95, 84, 19, 15, 7, 3, 1};
        // System.out.println(binarySearchDecOrder(arr2, 95));

        System.out.println(orderAgnosticBS(arr, 11));
        System.out.println(orderAgnosticBS(arr2, 155));
        
    }

    // binary search on increasing array
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // binary search on decreasing array
    public static int binarySearchDecOrder(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                
                end = mid-1;
            }
            else if (arr[mid] > target) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // order agnostic binary search
    public static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        if(arr[start] <= arr[end]){
            res = (binarySearch(arr, target));
            return res;
        }
        else{
            res = (binarySearchDecOrder(arr, target));
            return res;
        }
    }
}
