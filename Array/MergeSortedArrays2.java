public class MergeSortedArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7};
        int[] arr2 = {1, 3, 8, 9, 10};

        int[] merged = mergeSortedArrays2(arr1, arr2);

        System.out.println("Merged Sorted Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays2(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

     

        return merged;
    }
}
