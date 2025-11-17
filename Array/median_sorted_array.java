
    import java.util.*;

public class median_sorted_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for array 1
        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter elements of nums1 (sorted): ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for array 2
        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements of nums2 (sorted): ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Calling median function
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median = " + median);
    }


    // ------------------------------------------
    // FIND MEDIAN OF 2 SORTED ARRAYS (OPTIMAL)
    // ------------------------------------------
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;

        // Always binary search on smaller array
        if (n1 > n2) return findMedianSortedArrays(B, A);

        int low = 0, high = n1;
        int total = n1 + n2;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (total + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : A[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : B[cut2 - 1];

            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : A[cut1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : B[cut2];

            // Perfect partition
            if (left1 <= right2 && left2 <= right1) {
                if (total % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            }
            // Move left
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            // Move right
            else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }
}

    

