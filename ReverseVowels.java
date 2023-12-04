/**
 * @author Vikas Mehra
 * @date 03/12/23 12:55 PM
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        StringBuilder ss = new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                char temp=ss.charAt(i);
                ss.setCharAt(i,s.charAt(j));
                ss.setCharAt(j,temp);
                i++;j--;
            }
            if(!isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                i++;
            }
            if(!isVowel(s.charAt(j)) && isVowel(s.charAt(i))){
                j--;
            }
            if(!isVowel(s.charAt(j)) && !isVowel(s.charAt(i))){
                i++;j--;
            }
        }
        return String.valueOf(ss);
    }

    public static boolean isVowel(char c){
        boolean flag=false;
        switch(c){
            case 'a':
                flag=true;
                break;
            case 'A':
                flag=true;
                break;
            case 'e':
                flag=true;
                break;
            case 'E':
                flag=true;
                break;
            case 'i':
                flag=true;
                break;
            case 'I':
                flag=true;
                break;
            case 'o':
                flag=true;
                break;
            case 'O':
                flag=true;
                break;
            case 'u':
                flag=true;
                break;
            case 'U':
                flag=true;
                break;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}