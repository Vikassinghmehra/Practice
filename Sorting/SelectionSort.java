package Sorting;

/**
 * @author Vikas Mehra
 * @date 17/12/23 8:33 PM
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[]={31,20,1,2,3,7};
        selectionSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void selectionSort(int[]a) {
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++) {
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
