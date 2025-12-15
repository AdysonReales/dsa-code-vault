class Solution {
    public void rotate(int[] nums, int k) {
        //int[] nums = new int[]{1,2,3,4,5,6,7};
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        for(int i = 0; i < n; i++)
        {
            temp[(i+k)%n] = nums[i];
        }
        for(int i = 0; i < n; i++)
        {
            nums[i] = temp[i];
        }
    }
}