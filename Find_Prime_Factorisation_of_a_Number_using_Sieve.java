import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_Prime_Factorisation_of_a_Number_using_Sieve {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();
        scanner.close();

        List<Integer> primeFactors = getPrimeFactors(number);
        System.out.println("Prime factors of " + number + " are: " + primeFactors);
    }

    public static List<Integer> getPrimeFactors(int n) {
        int[] smallestPrimeFactor = new int[n + 1];
        sieve(n, smallestPrimeFactor);

        List<Integer> factors = new ArrayList<>();
        while (n > 1) {
            factors.add(smallestPrimeFactor[n]);
            n /= smallestPrimeFactor[n];
        }

        return factors;
    }

    public static void sieve(int n, int[] spf) {
        for (int i = 1; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) { // i is prime
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
