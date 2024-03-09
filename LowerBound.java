/**
 * @author Vikas Mehra
 * @date 03/03/24 3:44 PM
 */
public class LowerBound {

    public static void main(String[] args) {
        int a[]={10,11,11,11,11,13};
        lowerBound(a,11);
        upperBound(a,11);
    }

    public static void lowerBound(int a[],int x){
        int low=0,right=a.length-1,ans=0;
        while(low<=right){
            //System.out.println("asdf"+ans);
            int mid=(low+right)/2;
            if(a[mid]>=x){
                ans=mid;
                right=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("dfdf"+ans);
    }


    public static void upperBound(int a[],int x){
        int low=0,right=a.length-1,ans=0;
        while(low<=right){
            //System.out.println("asdf"+ans);
            int mid=(low+right)/2;
            if(a[mid]>x){
                ans=mid;
                right=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("dfdf"+ans);
    }
}
