import java.util.HashSet;
import java.util.Set;

/**
 * @author Vikas Mehra
 * @date 18/02/24 12:26 PM
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
class LongestConseseq {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return nums.length;
        }

        Set<Integer> set = new HashSet<>();
        int longest = 1;

        for(int i=0;i<nums.length;i++){
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1;
                int x=nums[i];
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }


        return longest;
    }
}