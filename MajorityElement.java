/**
 * @author Vikas Mehra
 * @date 25/12/23 11:24 PM
 * https://leetcode.com/problems/majority-element/submissions/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0)
            {
                candidate=nums[i];
                count=1;
            }else{
                if(candidate==nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return candidate;
    }
}
