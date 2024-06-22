import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas Mehra
 * @date 19/03/24 11:17 AM
 */
public class PrintAllSubset {
    public static void main(String[] args) {
        int a[] = {2, 5, 6, 8};
        subsets(a);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> numbersList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        listSubset(0, nums, list, numbersList);
        System.out.println(numbersList);
        return numbersList;
    }

    public static void listSubset(int ind, int[] nums, List<Integer> list, List<List<Integer>> numbersList){

        if(ind==nums.length){
            numbersList.add(new ArrayList<>(list));
            return;
        }

        listSubset(ind + 1, nums, list, numbersList);
        list.add(nums[ind]);
        listSubset(ind + 1, nums, list, numbersList);
        //list.remove(nums[ind]);
        list.remove(list.size() - 1);
    }
}
