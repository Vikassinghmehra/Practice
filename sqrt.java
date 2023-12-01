/**
 * @author Vikas Mehra
 * @date 26/11/23 9:12 PM
 * https://leetcode.com/problems/sqrtx/description/
 */

public class sqrt {
    //brute force
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        long temp=0;
        for(long i=0;i<=x;i++){
            if(i*i>x){
                temp= i-1;
                break;
            }
        }
        return (int)temp;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt1(6));

    }
    public static int mySqrt1(int x) {
        if(x==1){
            return 1;
        }
        long mid=0;
        long ans=0;
        long start=0;
        long last=x;
        while(start<=last){
            mid=start +(last-start)/2;
            ans=mid;
            if(mid*mid==x){
                return (int) ans;
            }
            if(mid*mid<x){
                start=mid+1;
            }else{
                last=mid-1;
            }
        }
        return (int)ans-1;
    }

}