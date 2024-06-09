/**
 * @author Vikas Mehra
 * @date 04/06/24 10:39 AM
 */
public class FloorAndCeil {
    public static void main(String[] args) {
        int []a={2,5,7,8,9,23};
        findFloor(a,22);
    }

    public static int findFloor(int a[],int x){
        int l=0,r=a.length-1,ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]>=x){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
