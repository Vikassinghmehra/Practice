import java.util.ArrayList;
import java.util.List;

public class GenerateBalanceParantheses {
       static List<String> list =new ArrayList<>();

    public static void main(String[] args) {
        int n=3;
        generate(n,n,"");
    System.out.println(list);
    }

    public static void generate(int open,int close,String x){
        if(open==0 && close==0){
            list.add(x);
            return;
        }
        if(open!=0){
            generate(open-1,close,x+"(");
        }
        if(close>open){
            generate(open,close-1,x+")");
        }
    }
}
