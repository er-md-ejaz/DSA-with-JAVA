

public class BitonicArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 9, 11, 7, 2, 1 };
        // System.out.println(minimumElement(arr));
        // System.out.println(findPeakElement(arr));
        System.out.println(findElementInBitonicArray(arr, 7));
    }


    public static int minimumElement(int arr[]) {
        return Math.min(arr[0], arr[arr.length - 1]);
    }

    public static int findPeakElement(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int m = 0;
        while (s<=e) {
            m = s + (e-s)/2;

            if((arr[m-1] <= arr[m]) && (arr[m] >= arr[m+1])){
                return arr[m];
            }
            else if((arr[m-1] <= arr[m]) && (arr[m] <= arr[m+1])){
                s=m+1;
            }
            else{
                e=m-1;
            }    
        }
        return arr[m];
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

    // binary search on decreasing array
    public static int binarySearchDecOrder(int arr[], int target, int start, int end){
        
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

    public static int findElementInBitonicArray(int arr[], int target){
        int peak = findPeakElement(arr);
        int increasing = binarySearch(arr, target, 0, peak);
        int decreasing = binarySearchDecOrder(arr, target, peak+1, arr.length-1);
        if (increasing == -1 && decreasing == -1) {
            return -1;
        }
        else if (increasing == -1) {
            return decreasing;
        }
        else{
            return increasing;
        }
    }
}
