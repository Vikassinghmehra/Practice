package Sorting;

/**
 * @author Vikas Mehra
 * @date 17/12/23 8:52 PM
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[]={31,20,1,2,3,7};
        bubbleSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void bubbleSort(int[]a) {
        for(int i=a.length-1;i>=0;i--){
            for (int j=0;j<=i-1;j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
