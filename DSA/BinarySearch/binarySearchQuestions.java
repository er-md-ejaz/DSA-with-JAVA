public class binarySearchQuestions {
    public static void main(String[] args) {
        int arr[] = {2, 5, 11, 13, 18, 18, 20};
        int arr2[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        // System.out.println(firstOccurrence(arr, 18, true));
        // System.out.println(firstOccurrence(arr, 18, false));
        int first = firstOccurrence(arr, 15, true);
        int last = firstOccurrence(arr, 15, false);
        if (first == -1) {
            System.out.println("No. of Element: 0");
        }
        else{
            System.out.println("No. of Element: " + (last - first + 1));
        }
    }

    // simple binary search
    public static int binarySearch(int arr[], int target, boolean isFirst){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
                
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else{
                ans = mid;
                if (isFirst) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    // binary search for first occurrence 
    public static int firstOccurrence(int arr[], int target, boolean isFirst){
        int res = binarySearch(arr, target, isFirst);
        return res;
    }
    
}