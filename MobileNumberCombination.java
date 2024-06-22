import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class MobileNumberCombination {
    List<String> list=new ArrayList<>();
    HashMap<Integer,String> map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
    map.put(1,"");
    map.put(0,"");
    map.put(2,"abc");
    map.put(3,"def");
    map.put(4,"ghi");
    map.put(5,"jkl");
    map.put(6,"mno");
    map.put(7,"pqrs");
    map.put(8,"tuv");
    map.put(9,"wxyz");
        if(digits.isEmpty()){
            return list;
        }
        combination(0,digits.length(),digits,"");
        return list;
    }

    public void combination(int index,int size,String digits,String temp){
        if(index==size){
            list.add(temp);
            return;
        } 
        String  str=map.get(Integer.parseInt(digits.charAt(index)+""));
        for(int i=0;i<str.length();i++){
            combination(index+1,size,digits,temp+str.charAt(i));
        }
    }
}


