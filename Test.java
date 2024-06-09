/**
 * @author Vikas Mehra
 * @date 30/05/24 10:18 AM
 */
public class Test {
    public static void main(String[] args) {
        test("aaa");
    }

    public static void test(String s){
        char temp=s.charAt(0);
        int localSum=1;
        StringBuilder str=new StringBuilder();
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                localSum++;

            }else{
                if(localSum%2!=0) {
                    str.append(temp);
                }
                localSum=1;
                temp=s.charAt(i);

            }
        }
        if(localSum%2!=0) {
            str.append(temp);
        }

        System.out.println(str);
    }
}
