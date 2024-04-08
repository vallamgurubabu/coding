/*
Problem Statement :- Given a number N. Your Mission is to find the largest and the
smallest digit of the number.
Note: Print Largest and Smallest digit
*/
import java.util.Scanner;
public class large_small_digit {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        s.close();
        int temp=n;
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        while (temp>0) {
            int rem = temp%10;
            large=Math.max(large, rem);
            small=Math.min(small, rem);
            temp=temp/10;
        }
        System.out.println(large+" "+small);
   } 
}
