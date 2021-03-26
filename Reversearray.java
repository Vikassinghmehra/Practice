/*
class Reversearray{

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " " );
        }
        System.out.println();
        reverseArray(a);

    }
    public static  void reverseArray(int a[]){
        
        //System.out.println(a.length);
        if(a.length<=1){
            System.out.print("Only one or no element");
        }else
        {
        for(int i=0,end=a.length-1;i<a.length/2;i++,end--){
                int temp=0;
                temp=a[i];
                a[i]=a[end];
                a[end]=temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " " );
        }
    }
    }
}*/


class Reversearray{

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int size=a.length;
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }
        System.out.println();
        reverseArray(a,0,size-1);
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }

    }
    public static  void reverseArray(int a[],int start,int end){
        
        //System.out.println(a.length);
        
       
                if(start<=end){
                int temp=0;
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                reverseArray(a,start+1,end-1);
                }
    }
    
}