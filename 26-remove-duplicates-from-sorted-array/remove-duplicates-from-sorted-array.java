class Solution {
    public int removeDuplicates(int[] nums) {
        //int[] nums = new int[]{1,1,2};
        //Unqieu Numbers 1,2
        //if i
        int k = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
//input int