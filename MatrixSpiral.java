import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vikas Mehra
 * @date 21/02/24 10:14 PM
 */
public class MatrixSpiral {

    public static void main(String[] args) {
        generate(1);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> list= new ArrayList<Integer>();
        List<List<Integer>> numbers= Collections.singletonList(new ArrayList<Integer>());

        list.add(1);
        numbers.add(list);
        System.out.println(numbers);

        if(numRows==1){
            return numbers;
        }
        list.add(1);
        numbers.add(list);

        System.out.println(numbers);
        return numbers;
    }
}
