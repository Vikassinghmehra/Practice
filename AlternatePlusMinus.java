import java.util.LinkedList;

/**
 * @author Vikas Mehra
 * @date 08/07/21 9:05 AM
 */
public class AlternatePlusMinus {
    public static void main(String[] args) {


        int a[]={2,3,4,5,-1,-2,-3,5,-1,-2,-3};
         a= alternatePlusMinusWithoutOrderPreserve(a,a.length);

         a=swap(a);
         for (int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }

    }

    private static int[] swap(int[] a) {


        return a;
    }

    private static int[] alternatePlusMinusWithoutOrderPreserve(int[] a, int length) {

        int i=0,j=length-1;
        while (i<j){

            if(a[i]<0 && a[j]>0){
                i++;
                j--;
            }
            else if(a[i]>0 && a[j]<0){

               int temp;
               temp= a[i];
               a[i]=a[j];
               a[j]=temp;
               j--;i++;

            }
            else if(a[i]<0 && a[j]<0){
                i++;

            }else{
                j--;
            }

        }
        //System.out.println(j);

        i=1;

        return  a;

    }
}
