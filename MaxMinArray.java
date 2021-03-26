//Maximum and minimum of an array using minimum number of comparisons
class MaxMinArray{

    static class Pair{
        int min,max;
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int size=a.length;
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }
        System.out.println();
        Pair p=maxMinArray(a,size);
        System.out.print(p.min + " " + p.max );
        

    }
    public static Pair maxMinArray(int a[],int size){
        
        //System.out.println(a.length);
        Pair pair=new Pair();
        
        if(size==1){
            pair.min=a[0];
            pair.max=a[0];
            return pair;
        }

            if(a[0]<a[1]){
                pair.min=a[0];
                pair.max=a[1];
            }else{
                pair.min=a[1];
                pair.max=a[0];
            }

        for(int i=2;i<size;i++){
            if(a[i]<pair.min){
                pair.min=a[i];
            }else if(a[i]>pair.max){
                pair.max=a[i];
            }
        }
        return pair;       
                
    }
    
}