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