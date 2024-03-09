/**
 * @author Vikas Mehra
 * @date 03/03/24 2:29 PM
 */
class SearchInsertPosition {
    public static void main(String[] args) {
        int a[]={1,3};
        searchInsert(a,2);
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length;
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            ans=mid;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        System.out.println(ans);
        if(ans>0){
            if(nums[ans]>target){
                return ans-1;
            }else{
                return ans+1;
            }
        }else{
            if(nums[ans]>target){
                return ans;
            }else{
                return ans+1;
            }
        }
    }
}