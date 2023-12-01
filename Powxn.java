/**
 * @author Vikas Mehra
 * @date 25/11/23 3:03 PM
 * Calculate power of x  n
 * https://leetcode.com/problems/powx-n/description/
 */
public class Powxn {
    public static double myPow(double x, int n) {
        long nn=n;
        if(n<0){
            nn=-n;
            n=-n;
            x=(double)1.0/x;
            System.out.println(x);
        }
        double temp=1;
        for(int i=0;i<n;i++){
            temp*=x;
        }
        return temp;
    }


    public static void main(String[] args) {
        myPow(2.0,-3);
    }

//Power of 2
public double myPow1(double x, int n) {
    long nn=n;
    if(nn<0){
        nn=-1*nn;
    }
    double temp=1.0;
    while(nn>0){
        if(nn%2==1){
            temp=temp*x;
            nn=nn-1;
        }else{
            x=x*x;
            nn=nn/2;
        }
    }
    if (n < 0) temp = (double)(1.0) / (double)(temp);
    return temp;
}
}

