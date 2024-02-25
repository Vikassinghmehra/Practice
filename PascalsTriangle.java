import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas Mehra
 * @date 25/02/24 2:17 PM
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> numbers=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
        List<Integer> list=new ArrayList<>();
        for(int j=1;j<=numRows;j++){
            int x=nCr(i - 1, j - 1);
            if(x!=0){
                list.add(x);
            }
        }
        numbers.add(list);
    }
        return numbers;
}

    public static int nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
}
