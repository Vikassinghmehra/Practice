/**
 * @author Vikas Mehra
 * @date 15/05/24 6:19 PM
 */
public class LongestSUbarrayWithGivenSumK {
    public static void main(String[] args) {
        int array[] = {2,4,6,1,12,10};
        int a=longestSubarray(array,23);
        System.out.println(a);
    }

    public static int  longestSubarray(int[] a,int k) {
        int n=a.length;
        int l=0,r=0,sum=0,maxLen=0;
        while(r<n){
            sum+=a[r];
            while(l<=r && sum>k){
                sum-=a[l];
                l++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
       return maxLen;
    }
}
