/**
 * @author Vikas Mehra
 * @date 28/11/23 10:46 AM
 * https://leetcode.com/problems/valid-palindrome/submissions/
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("vv--090vv"));
    }

    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        String temp="";
        for(i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp=temp+s.charAt(i);
            }
        }
        i=0;j=temp.length()-1;
        boolean flag=true;
        while(i<=j){
            if(temp.charAt(i)==temp.charAt(j)){
                i++;j--;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
