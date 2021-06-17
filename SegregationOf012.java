

public class SegregationOf012
{
    public static void sort012(int a[], int n)
    {
        // code here
        int one=0,two=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                one++;
            }else if(a[i]==2){
                two++;
            }
        }
        //System.out.println(one+"  "+two);
        int zero=n-(one+two);
        //System.out.println(one+"  "+two+" "+zero);

        int i=0;

        for(int j=0;j<zero;j++){
            a[i++]=0;
        }
        for(int j=0;j<one;j++){
            a[i++]=1;
        }
        for(int j=0;j<two;j++){
            a[i++]=2;
        }

    }
}