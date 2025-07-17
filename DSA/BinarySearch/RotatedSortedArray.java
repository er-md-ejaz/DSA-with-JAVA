// package DSA.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        // int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int arr2[] = {};
        System.out.println(findInRotatedArray(arr2));
        
    }

    public static int findInRotatedArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[start] <= arr[mid]) {
                int isPresent = binarySearch(arr, 1, start, mid);
                if (isPresent != -1) {
                    return isPresent;
                }
                start = mid + 1;
            }
            else {
                int isPresent = binarySearch(arr, 1, mid + 1, end);
                if (isPresent != -1) {
                    return isPresent;
                }
                end = mid - 1;
            }
        }
        return -1;
    }



    // binary search on increasing array
    public static int binarySearch(int arr[], int target, int start, int end){
        
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
    
}


