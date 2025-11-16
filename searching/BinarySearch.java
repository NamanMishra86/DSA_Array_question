package searching;
import java.util.Scanner;   

public class BinarySearch {

    // Binary search function (returns index or -1)
    public static int binarySearch(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (arr[mid] == target) {
                return mid;   // Found → return index
            }
            else if (arr[mid] < target) {
                st = mid + 1; // Search right half
            }
            else {
                end = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
