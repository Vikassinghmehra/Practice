/**
 * @author Vikas Mehra
 * @date 08/06/24 12:39 PM
 */
public class FindFirstandLast {

    public static void main(String[] args) {
        int a[]={5,7,7,7,7,7,7,7,8,8,10};
        searchRange(a,8);
    }

    public static int[] searchRange(int[] arr, int x) {
        int a[]={-1,-1};

        if(arr.length==0){
            return a;
        }
        int i=firstElement(arr,x);
        System.out.print(i);
        return a;
    }


    public static int firstElement(int arr[],int x){
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans = mid;
                high=mid-1;
            }else if(arr[mid] > x){
                ans=mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if(ans==arr.length){
            return -1;
        }
        return (arr[ans]==x)?ans:-1;
    }
}







