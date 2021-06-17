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
        Pair p=maxMinArray(a,a.length);
        System.out.print(p.min + " " + p.max );
        

    }/*
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
*/

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

    public static Pair maxMinArray(int a[] ,int size){
        Pair minMax=new Pair();
        int i;
        if(size%2==0){
            if(a[0]<a[1]){
                minMax.min=a[0];
                minMax.max=a[1];
            }else{
                minMax.min=a[1];
                minMax.max=a[0];
            }
            i=2;
        }else{
            minMax.min= minMax.max=a[0];
            i=1;
        }

        while (i<size-1){
            if(a[i]>a[i+1]){
                if(a[i]> minMax.max){
                    minMax.max=a[i];
                }
                if(a[i+1]< minMax.min){
                 minMax.min=a[i+1];
                }
            }else{
                if(a[i]< minMax.min){
                    minMax.min=a[i];
                }if(a[i+1]> minMax.max){
                    minMax.max=a[i+1];
                }
            }
            i+=2;
        }

        return minMax;

    }


    
}