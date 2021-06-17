//Move negative to left and positive to right in array

public class MoveNegToLeftAndPosToRight {

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int size=a.length;
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }
        move(a,size-1);

        for(int i=0;i<size;i++){
            System.out.print(a[i] + " " );
        }

    }

    public static void move (int a[],int size ){
            int j=0,temp;
            for(int i=0;i<size;i++){

                if(a[i]<0){
                    if(i!=j){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                    j++;
                }
            }
    }
}
