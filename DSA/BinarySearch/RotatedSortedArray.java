// package DSA.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 0, 1, 1, 2};
        int arr2[] = {};
        // System.out.println(findInRotatedArray(arr2));
        // minElemInRotatedSortedArray(arr);
        noOfRotations(arr);
    }

    public static void minElemInRotatedSortedArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int minElem = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            if (arr[start] < arr[mid]) {
                minElem = Math.min(arr[start], minElem);
                start = mid+1;
            }
            else {
                minElem = Math.min(arr[mid], minElem);
                end = mid-1;
            }
        }
        System.out.println(minElem);
    }

    public static void noOfRotations(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int minElem = Integer.MAX_VALUE;
        int minIdx = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            if (arr[start] < arr[mid]) {
                if (arr[start] < minElem) {
                    minElem = Math.min(arr[start], minElem);
                    minIdx = start;
                }
                start = mid+1;
            }
            else {
                if (arr[mid] < minElem) {
                    minElem = Math.min(arr[mid], minElem);
                    minIdx = mid;
                }
                end = mid-1;
            }
        }
        System.out.println(minIdx);
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


