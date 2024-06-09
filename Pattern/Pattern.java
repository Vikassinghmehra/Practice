package Pattern;

/**
 * @author Vikas Mehra
 * @date 12/05/24 4:55 PM
 */
public class Pattern {

    public static void main(String[] args) {
        int n=5;
//        for(int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.print("\n");
//        }


        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
