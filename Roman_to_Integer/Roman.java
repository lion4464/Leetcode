package Roman_to_Integer;
import java.util.*;
public class Roman {
    public static void main(String[] args) {
        int a=romanToInt("XX");
        System.out.println("a = " +a );
    }
    public static  int romanToInt(String s) {
        Map<Character,Integer> number = new HashMap<>();
        number.put('I',1);
        number.put('V',5);
        number.put('X',10);
        number.put('L',50);
        number.put('C',100);
        number.put('D',500);
        number.put('M',1000);
        int sum=0;
        int prevN=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
//===============================If right side digit is higher than left side digit===========================
            if (number.get(ch) > prevN){
                int curr=number.get(ch)-prevN;
                sum-=prevN;
                sum+=curr;
            }
            else {
                sum+=number.get(ch);
            }
            prevN=number.get(ch);
        }
        return sum;
    }
}
