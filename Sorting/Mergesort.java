// Case	Time    Complexity	Explanation
// Best Case	O(n log n)	Perfectly balanced partitions
// Average Case	O(n log n)	Random pivot works well on average
// Worst Case	  o(n²)	    Poor pivot choice (e.g., sorted array with first element as pivot)

// Space Complexity: O(log n) (recursive stack)


package Sorting;
public class Mergesort {

    // Step 1: Conquer (merge two sorted halves)
    static void conqure(int arr[], int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];

        int idx1 = si;       // left part start
        int idx2 = mid + 1;  // right part start
        int x = 0;           // merged array index

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // remaining left elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // remaining right elements
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // copy back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Step 2: Divide (split array recursively)
    static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);       // left half
        divide(arr, mid + 1, ei);   // right half
        conqure(arr, si, mid, ei);  // merge halves
    }

    // Step 3: Print function
    static void print(int arr[]) {
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    // Step 4: Main method
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

    
        print(arr);

        divide(arr, 0, arr.length - 1);

        
        print(arr);
    }
}
