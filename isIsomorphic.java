import java.util.HashMap;

/**
 * @author Vikas Mehra
 * @date 01/12/23 8:04 PM
 * https://leetcode.com/problems/isomorphic-strings/solutions/
 */
public class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(t.charAt(i)!=map.get(s.charAt(i))){
                    return false;
                }
            }else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
