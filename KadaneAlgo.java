/**
 * @author Vikas Mehra
 * @date 11/08/21 9:35 AM
 */
public class KadaneAlgo {
    public static void main(String[] args) {
        int a[] ={-1,-2,-3,2,5};

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int sum=kadanesAlgo(a,a.length);
        System.out.print("sum "+sum);


    }

    private static int kadanesAlgo(int[] a, int length) {
        int max_sum=0;

        if(a.length==0){
            max_sum=0;
        }else if(a.length==1){
            max_sum=a[0];
        }else {

            int sum_till_now=a[0];
            max_sum=a[0];
            for (int i=1;i<length;i++){

                sum_till_now=Math.max(a[i],a[i]+sum_till_now);
                max_sum=Math.max(sum_till_now,max_sum);

            }

        }

        return max_sum;

    }


}
