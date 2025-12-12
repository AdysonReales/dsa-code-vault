class Solution {
    public int removeElement(int[] nums, int val) {
        //int[] nums = new int[]{3,2,2,3};
        //int val;
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}