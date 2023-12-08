import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Vikas Mehra
 * @date 09/12/23 12:02 AM
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        int len=0;
        boolean flag=false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                len +=entry.getValue();
            }else if(entry.getValue()%2!=0 && entry.getValue()>1){
                len +=(entry.getValue()/2)*2;
                flag=true;
            }else{
                flag=true;
            }
        }

        if(flag){
            len+=1;
        }
        return len;
    }

    public int longestPalindrome1(String s) {
        HashSet<Character>set=new HashSet<>();
        int len=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                len+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.size()>0){
            return len+1;
        }else{
            return len;
        }
    }

}
