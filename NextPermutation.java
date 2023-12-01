/**
 * @author Vikas Mehra
 * @date 28/08/21 10:26 PM
 * https://leetcode.com/problems/next-permutation/solution/
 */
public class NextPermutation {

    public static void main(String[] args) {
    int a[]={1,5,8,4,7,6,5,3,1};
    nextPermutation(a,a.length);
    }

    private static void nextPermutation(int[] a, int length) {

        int i=length-2;
       while (i>=0 && a[i+1]<=a[i]){

           i--;
       }
       if(i>=0){

       }

    }

}
