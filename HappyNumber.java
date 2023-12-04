import java.util.HashSet;
import java.util.Set;

/**
 * @author Vikas Mehra
 * @date 04/12/23 9:57 PM
 * https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int rem=0,new_number=0;
        Set<Integer> set=new HashSet<Integer>();
        if(n==1){
            return true;
        }
        while(!set.contains(n)){
            int tmp = returnSum(n);
            set.add(n);
            if(tmp==1){
                return true;
            }
            n=tmp;
        }

        return false;
    }

    public int returnSum(int n){
        int rem=0;
        while(n>0){
            rem=rem + (n%10) * (n%10);
            n=n/10;
        }
        return rem;
    }
}
