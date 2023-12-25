/**
 * @author Vikas Mehra
 * @date 25/12/23 11:25 PM
 * https://leetcode.com/problems/sort-colors/
 *
 */
public class DutchManFlagAlgo {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            switch(nums[mid])
            {
                case 0:
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    mid++;low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp1;
                    high--;
                    break;
            }
        }
    }
}
