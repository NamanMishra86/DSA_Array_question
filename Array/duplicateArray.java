public class duplicateArray {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 4, 4, 5};

        removeDuplicate(nums);
    }

    static void removeDuplicate(int[] nums) {
        int count = 0;

        // Loop through array and skip duplicates
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue; // skip duplicate
            }
            nums[count] = nums[i];
            count++;
        }

        // Print unique elements
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
