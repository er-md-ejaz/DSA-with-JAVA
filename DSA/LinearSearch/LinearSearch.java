
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 9, 9, 2, 8, 5, 4 };
        // System.out.println(linearSearch(arr, 9, true));
        // System.out.println(linearSearch(arr, 9, false));

        // linearSearchMultiple(arr, 4);

        // System.out.println(findMax(arr));

        int arr2[][] = { { 2, 8, 4, 9, 7 },
                { 1, 5, 0, 4, 7 },
                { 5, 8, 2, 9, 8 },
                { 1, 7, 5, 0, 5 } };
        // linearSearchOn2D(arr2, 7, false);
        // linearSearchOn2D(arr2, 7, true);

        // linearSearchMultiple2D(arr2, 2);

        findMaxSumSubarray(arr2);
    }

    // Basic Linear Search
    public static int linearSearch(int arr[], int element, boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                ans = i;
                if (findLast == false) {
                    return ans;
                }

            }
        }
        return ans;
    }

    // Search multiple using linear search
    public static void linearSearchMultiple(int arr[], int element) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (element == arr[i]) {
                ans[j] = i;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(ans[i]);
        }
    }

    // find maximum element in array
    public static int findMax(int arr[]) {
        // int maxElem = Integer.MIN_VALUE;
        int maxElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }

    // linear search on 2-D array
    public static void linearSearchOn2D(int arr2[][], int target, boolean findLast) {
        int row = -1;
        int col = -1;
        boolean found = false;
        // System.out.println(arr2[0].length);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] == target) {
                    row = i;
                    col = j;
                    if (findLast == false) {
                        found = true;
                        break;
                    }
                }

            }
            if (found == true) {
                break;
            }

        }
        System.out.printf("%d, %d", row, col);
    }

    // linear search on 2-D array for multiple element
    public static void linearSearchMultiple2D(int arr2[][], int target){
        int n = arr2.length;
        int ans[][] = new int[n][2];
        int k = 0;
        boolean found = false;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] == target) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
        }
        for(int i = 0; i<k; i++){
            for(int j=0; j<2; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaxSumSubarray(int arr2[][]){
        int maxSum = 0;
        for(int i = 0; i<arr2.length; i++){
            int sum = 0;
            for(int j=0; j<arr2[i].length; j++){
                sum += arr2[i][j];
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
