import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(n->{
        if (n%2==0) {
            System.out.println(n);    
        }});

        list.stream().
    }
}