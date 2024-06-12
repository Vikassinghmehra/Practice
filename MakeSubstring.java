import java.util.ArrayList;

/**
 * @author Vikas Mehra
 * @date 11/06/24 11:51 PM
 */
public class MakeSubstring {
    ArrayList<String> list =new ArrayList<>();
    public String longestPalindrome(String s) {
        makePermutaion(s,list);
        int max=0;
        String maxP="";
        for(int i=0;i<list.size();i++){
            if(isPalindrome(list.get(i))){
                int tem=list.get(i).length();
                if(max<tem){
                    maxP=list.get(i);
                    max=tem;
                }
            }
        }
        return maxP;
    }

    public static void makePermutaion( String s, ArrayList<String> list){
        //System.out.println("temp "+index +" "+s);
        if(s.length()==0){
            return;
        }
        for(int i=0;i<s.length();i++){
            list.add(s.substring(0,i+1));
        }
        makePermutaion(s.substring(1),list);
    }

    public static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
}