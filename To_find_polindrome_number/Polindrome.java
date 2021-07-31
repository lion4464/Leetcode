package To_find_polindrome_number;

public class Polindrome {
    public static void main(String[] args) {
        boolean rost=isPalindrome(1120211);
        System.out.println("rost = " + rost);
    }
    public static boolean isPalindrome(int x) {
        int a=x;
        int rev=0;
        boolean isPol=false;
        int prevRev=0;
            if (a>Integer.MAX_VALUE&&a<Integer.MIN_VALUE)
                return false;
            while (x>0) {
               int q = x % 10;
                rev = rev * 10 + q;
                if((rev - q) / 10  !=  prevRev)
                    return false;

                prevRev = rev;
                x /= 10;
            }
            if (rev==a)
                isPol=true;


            return isPol;
        }
}
