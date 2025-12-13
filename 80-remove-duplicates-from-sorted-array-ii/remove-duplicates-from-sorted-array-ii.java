class Solution {
    public int removeDuplicates(int[] nums) 
    {
        //int[] nums = new int[]{1,1,1,2,2,3};
        int k = 0;
        for (int i = 0;i < nums.length; i++)
        {
            if (k < 2 || nums[i] != nums[k - 2])
            {
                nums[k] = nums[i];
                k += 1;
            }

        }
        return  k;
    }
}