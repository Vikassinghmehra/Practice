/**
 * @author Vikas Mehra
 * @date 17/02/24 6:16 PM
 * https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */
class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int right=nums.length;
        int ans[]=new int[nums.length];
        int posindex=0,negIndex=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                ans[posindex]=nums[i];
                posindex+=2;
            }else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }


        return ans;
    }
}
