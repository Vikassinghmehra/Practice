/**
 * @author Vikas Mehra
 * @date 30/11/23 1:54 PM
 */
public class PrintNumber {

    public static void main(String[] args) {
        //System.out.println(binaryconvert(7));
        System.out.println(sumOfnumber(45632));
    }
    public static void printNo(int n){
        if(n<=0){
            return;
        }else{
            printNo(n-1);
            System.out.println(n);
        }
    }
    public static int sumNo(int n){
        if(n==1){
            return 1;
        }else{
           return n+sumNo(n-1);
        }
    }

    public static void binaryconvert(int n){
        if(n==0){
            System.out.print("0");
            return;
        }
        if(n==1){
            System.out.print("1");
            return;
        }

        binaryconvert(n/2);
        System.out.print(n%2);
    }

    public static int sumOfnumber(int n){
        if(n<10){
            return n;
        }
        int rem=0;
        while(n>0){
            rem =rem+n%10;
            n=n/10;
        }
        return rem;
    }

}
