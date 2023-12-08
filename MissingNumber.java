/**
 * @author Vikas Mehra
 * @date 07/12/23 10:57 AM
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
        }
        return sum-temp;
    }
}
