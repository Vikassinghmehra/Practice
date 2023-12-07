/**
 * @author Vikas Mehra
 * @date 07/12/23 10:34 AM
 * https://leetcode.com/problems/add-digits/description/
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }

        while(num>9){
            int temp=sumDigits(num);
            if(temp<10){
                return temp;
            }
            num=temp;
        }
        return num;
    }


    public int sumDigits(int num) {
        int rem=0;
        while(num>0){
            rem=rem+num%10;
            num=num/10;
        }
        return rem;
    }
}
