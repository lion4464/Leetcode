package Reverse_number;

public class Reverse {
    public static void main(String[] args) {
    int son=reverse(534236469);
        System.out.println("son = " + son);
    }
    public static int reverse(int a){
        int q=0;
        int rem=0;
        int prevRev=0;
       if ((a>=-Math.pow(2,31))&&(a<=(Math.pow(2,31)-1))){
            while (a != 0) {
                q = a % 10;
                System.out.println("q = " + q);
                rem = rem * 10 + q;

                if((rem - q) / 10  !=  prevRev){
                    return 0;
                }
                prevRev = rem;
                a /= 10;
                System.out.println("rem = " + rem);
            }
       }
        return rem;
        }
    }
