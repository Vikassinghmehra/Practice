/**
 * @author Vikas Mehra
 * @date 17/12/23 11:22 PM
 * https://leetcode.com/problems/max-consecutive-ones/submissions/
 */
public class FindingMacConsOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int local_max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                local_max++;
            }else{
                maxi=Math.max(local_max,maxi);
                local_max=0;
            }
        }
        maxi=Math.max(local_max,maxi);
        return maxi;
    }
}
