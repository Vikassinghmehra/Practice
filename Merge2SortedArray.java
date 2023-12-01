import java.util.Arrays;

/**
 * @author Vikas Mehra
 * @date 17/08/21 10:30 AM
 */
public class Merge2SortedArray {
    public static void main(String[] args) {
        int a[]={1,3,4,5};
        int b[]={3,5,8,10};

        sort(a,b,a.length,b.length);

        for (int i=0;i<a.length;i++){
            System.out.println("First array"+a[i]);
        }

        for (int i=0;i<b.length;i++){
            System.out.println("First array"+b[i]);
        }
    }

    private static void sort(int[] a, int[] b, int m, int n) {

        int i=0,temp=0;
        while(a[m-1]>b[0]){

            if(a[i]>b[0]){

                a[i]^=b[0];
                b[0]^=a[i];
                a[i]^=b[0];
                Arrays.sort(b);

            }
            i++;

        }



    }
}
