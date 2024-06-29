import java.util.ArrayList;
import java.util.List;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 32;
        List<Integer> primes = findAllPrimes(n);

        System.out.println("Prime numbers less than or equal to " + n + ":");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
    public static List<Integer> findAllPrimes(int n) {
        
        List<Integer> prime = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            prime.add(1);
        }
        
        prime.set(0, 0);
        prime.set(1, 0);
        
        // Apply Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (prime.get(i) == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime.set(j, 0);
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            if (prime.get(i) == 1) {
                ans.add(i);
            }
        }
        return ans;
    }


}
