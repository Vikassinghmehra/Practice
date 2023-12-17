/**
 * @author Vikas Mehra
 * @date 16/12/23 11:07 PM
 * https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
 */
public class FindingMissingNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7};
        System.out.println(missingNumber(a,7));
    }

    public static int missingNumber(int a[],int n) {
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^a[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return (xor1^xor2);
    }
}
