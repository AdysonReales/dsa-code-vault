import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n / 2;
        if (n % 2 == 0)
        {
            return nums[mid - 1];
        } else {
            return nums[mid];
        }

    }
}