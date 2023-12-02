import java.util.HashMap;

/**
 * @author Vikas Mehra
 * @date 02/12/23 6:58 PM
 * https://leetcode.com/problems/word-pattern/description/
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        if(str.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                //System.out.println(pattern.charAt(i) + map.get(pattern.charAt(i)) + str[i]);
                if(map.get(pattern.charAt(i)).equalsIgnoreCase(str[i])){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
