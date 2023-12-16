/**
 * @author Vikas Mehra
 * @date 16/12/23 10:53 PM
 * https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
 */
public class CheckSortedArray {
    public static void main(String[] args) {
        int a[]={4,5,6,7,1};
        System.out.println(checkArraySorted(a,5));
    }

    private static boolean checkArraySorted(int[] a, int length) {
        for(int i=0;i<length-1;i++){
            if(a[i]<=a[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

}
