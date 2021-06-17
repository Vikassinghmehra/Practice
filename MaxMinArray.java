import jdk.internal.util.xml.impl.Pair;

//Maximum and minimum of an array using minimum number of comparisons
class MaxMinArray{

    static class Pair{
        int min,max;
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " " );
        }
        System.out.println();
        Pair p=maxMinArray(a,0,a.length-1);
        System.out.print(p.min + " " + p.max );
        

    }
    public static Pair maxMinArray(int a[],int start,int end ){

        Pair rh=new Pair();
        Pair lh=new Pair();
        Pair p=new Pair();


        if(start==end){
            p.min=p.max=a[start];
            return p;
        }else if(start+1==end){
            if(a[start]<a[end]){
                p.min=a[start];
                p.max=a[end];
            }else{
                p.min=a[end];
                p.max=a[start];
            }
            return p;
        }else{
            int mid=(start+end)/2;
            lh=maxMinArray(a,start,mid);
            rh=maxMinArray(a,mid+1,end);
            if(lh.max>rh.max){
                p.max=lh.max;
            }else{
                p.max=rh.max;
            }
            if(rh.min<lh.min){
                p.min=rh.min;
            }else{
                p.min=lh.min;
            }
            return p;
        }




    }


    /*
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
                
    }*/
    
}