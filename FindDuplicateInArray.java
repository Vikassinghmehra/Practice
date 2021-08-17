import java.util.HashSet;
import java.util.Set;

/**
 * @author Vikas Mehra
 * @date 16/08/21 11:06 PM
 *
 *
 * Method to solve this problem
 * Use Set
 * Use Sorting
 * Use Binary Search
 * Use Cycle Detection
 */
public class FindDuplicateInArray {
    public static void main(String[] args) {
        int a[]={1,4,2,3,4,5,6};

        //int min=findDuplicate(a,a.length);
        int min=floydWarshall(a,a.length);

        System.out.println(min);
    }

    private static int floydWarshall(int[] a, int length) {
        int turtoise=a[0];
        int hare=a[0];
        do{
            turtoise=a[turtoise];
            hare=a[a[hare]];

        }while (hare!=turtoise);

        turtoise=a[0];
        while (turtoise!=hare){
            turtoise=a[turtoise];
            hare=a[hare];
        }
        return hare;

    }

    private static int findDuplicate(int[] a, int length) {

        if(a.length==0){
            return 0;

        }else if(a.length==1){
            return a[0];
        }else{
            Set<Integer> set=new HashSet<Integer>();
            int temp=0;
            for (int i=0;i<length;i++){
                if (set.contains(a[i])){
                    temp= a[i];
                    break;
                }else
                {
                    set.add(a[i]);
                }
            }
            return temp;
        }
    }




}
