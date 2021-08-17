import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an array arr[] denoting heights of N towers and a positive integer K,
 * you have to modify the height of each tower either by increasing or decreasing
 * them by K only once. After modifying, height should be a non-negative integer.
 * Find out what could be the possible minimum difference of the height of shortest
 * and longest towers after you have modified each tower.
 * @author Vikas Mehra
 * @date 15/08/21 11:21 PM
 */
public class MinimizeTheMaxHeight {

    public static void main(String[] args) {

        int arr[]={1,5,4,77,14,7,3};
        int k=3;
        int min=minimize(arr,arr.length,k);
        System.out.println(" min"+ min);


    }

    private static int minimize(int[] arr, int length,int k) {
        Arrays.sort(arr);
        int maxDiff=arr[length-1]-arr[0];
        int smallest=arr[0]+k;
        int large=arr[length-1]-k;
        for (int i=0;i<length;i++){

            int min =Math.min(smallest,arr[i+1]-k);
            int max=Math.max(large,arr[i]+k);
            if(min<0)
            continue;
            maxDiff = Math.min(maxDiff, max-min);

        }
        return maxDiff;


    }


}
