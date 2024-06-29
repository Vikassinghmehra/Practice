import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println(getPrimeFactors(60));
    }

    public static ArrayList<Integer> getPrimeFactors(int number){
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for(int i=2;i<=number;i++){
            if(number%i==0){
                primeFactors.add(i);
            }
            while (number%i==0) {
                number=number/i;
            }
        }
        return primeFactors;
    }
    
}
