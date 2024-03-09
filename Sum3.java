import java.util.*;

/**
 * @author Vikas Mehra
 * @date 27/02/24 11:02 PM
 */
public class Sum3{
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int neg=-(nums[i]+nums[j]);
                if(hashset.contains(neg)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], neg);
                    temp.sort(null);
                    list.add(temp);
                }
                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(list);
        return ans;
    }
}