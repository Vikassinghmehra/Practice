import java.util.HashMap;

/**
 * @author Vikas Mehra
 * @date 29/11/23 11:17 PM
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    private int fib(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }
        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fib(N-1) + fib(N-2);
        }
        // keep the result in cache.
        cache.put(N, result);
        return result;
    }
}
