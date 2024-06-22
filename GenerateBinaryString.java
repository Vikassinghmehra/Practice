import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryString {
    public static void main(String[] args) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        generateBinaryString(0,3,-1,temp,list);
        System.out.println(list);
    }

    public static void generateBinaryString(int index,int n,int prev,List<Integer> temp,List<List<Integer>> list){
        if(index==n){
            list.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(0);
        generateBinaryString(index+1,3,0,temp,list);
        temp.remove(temp.size()-1);
            if(prev!=1){
                temp.add(1);
                generateBinaryString(index+1,3,1,temp,list);
                temp.remove(temp.size()-1);
            }
        }
        
}
