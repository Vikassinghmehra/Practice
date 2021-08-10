/**
 * @author Vikas Mehra
 * @date 10/08/21 8:58 AM
 */
public class CycleRotationArray {
    public static void main(String[] args) {
        int a[]={};

        if(a.length==0){
            System.out.print(a.length);
        }else if (a.length==1){
            System.out.print(a.length);
        }else{
            arrayRotation(a,a.length);
        }


    }

    private static void arrayRotation(int[] a, int length) {

        int x=a[length-1];
        for (int i=length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=x;


        for (int i=0;i<length;i++){
            System.out.print(a[i]);
        }
    }

}
