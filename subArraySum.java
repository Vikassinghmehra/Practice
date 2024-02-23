import java.util.HashMap;

/**
 * @author Vikas Mehra
 * @date 22/02/24 9:42 PM
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        if(nums.length==0){
            return a;
        }

        int left=0,right=nums.length-1;
        int value=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                value=mid;
                break;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("value -"+ value);

        // return a;
        if(value==-1){
            return a;
        }else{
            left=value;
            right=value;
            while(left>=0){
                if(nums[left]!=target){
                    break;
                }
                left--;
            }
            //System.out.println("left -"+ (left+1));


            while(right<=nums.length-1){
                if(nums[right]!=target){
                    break;
                }
                right++;
            }
            //System.out.println("right -"+ (right-1));

            a[0]=left+1;a[1]=right-1;
            return a;
        }
    }
}