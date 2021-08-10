//find the kth smallest element in array
//using quick select or partitioned technique


/*
public class KthSmallestElementInArray {


    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int size=a.length;
        int k=6;
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }
        System.out.println(kthSmallest(a,0,size-1, k));

        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }

    }
    public static  int kthSmallest(int a[],int start,int end,int k){

        while(start<=end){

            int pivotIndex=partition(a,start,end);

            if(pivotIndex==k-1){
                return a[pivotIndex];
            }
            else if(pivotIndex>k-1){
                end=pivotIndex-1;
            }
            else{
                start=pivotIndex+1;
            }

        }
        return -1;

    }
    static int partition(int a[] ,int start,int end){

        int temp;
        int pivot=a[end];
        int i =(start-1);
        for(int j=start;j<=end-1;j++){
            if(a[j]<=pivot){
            i++;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[end];
        a[end]=temp;

        return (i+1);

    }

}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KthSmallestElementInArray {
    public static void main(String[] args) {
        int a[]={2,34,6,7,8,1,3};

        kthSmallest(a,3);

    }

    private static void kthSmallest(int[] a,int k) {
        TreeMap<Integer,Integer>map=new TreeMap<>();

        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]+1));
            }else{
                map.put(a[i],1);
            }

        }
        int t=0;


        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

            if(t==k-1) {
                try {
                    int key = entry.getKey();
                    int value = entry.getValue();
                    System.out.println(key + " => " + value);
                }catch (Exception e){
                    System.out.println(e);
                }
            }

            t++;
        }

    }
}


