import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Vikas Mehra
 * @date 14/06/24 3:17 PM
 */
public class Permutaion {

public static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> temp=new ArrayList<>();

        permutation(a, a.size(),temp);
        System.out.println(list);
    }

    public static void permutation(ArrayList<Integer> a,int size, ArrayList<Integer>temp){
        if(size== temp.size()){
            list.add(new ArrayList<>(temp));
            return ;
        }
        // System.out.println(a +" "+temp);
        for(int i=0;i<a.size();i++){
            int num=a.get(i);
            //System.out.println(num);
            temp.add(num);
            a.remove(i);
            //System.out.println(a +"-"+temp);
            permutation( a,size,temp);
            temp.remove(temp.size() - 1);
            a.add(i,num);
        }
    }
}
