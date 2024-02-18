import java.util.ArrayList;

/**
 * @author Vikas Mehra
 * @date 17/02/24 6:41 PM
 */
public class LeaderKaun {
    public static void main(String[] args) {
        int a[]={10, 22, 12, 3, 0, 6};
        leaderKaun(a);
    }

    public static int leaderKaun(int a[]){
        ArrayList<Integer> ans= new ArrayList<>();
        int leader=a[a.length-1];
        ans.add(a[a.length-1]);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>a[i+1] && leader<a[i]){
              leader=a[i];
              ans.add(a[i]);
            }
        }

        for (int j=0;j<ans.size();j++){
            System.out.println(ans.get(j));
        }
        //System.out.println(leader);
        return leader;
    }
}
