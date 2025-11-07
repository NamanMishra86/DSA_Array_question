class Solution {
    public int minPatches(int[] nums, int n) {
        long reach = 0;    // maximum number we can form
        int i = 0;         // index in nums
        int patches = 0;   // count of patches

        while (reach < n) {
            if (i < nums.length && nums[i] <= reach + 1) {
                reach += nums[i];
                i++;
            } else {
                reach += reach + 1;
                patches++;
            }
        }
        return patches;
    }
}
