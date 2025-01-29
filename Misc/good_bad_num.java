package Misc;
/*
Problem Statement: - You Are Playing a game in which you have to find the good
number or bad number. A number is a good number if the number is divisible by the
sum of its digits.

NOTE: Print 'Good Number' If Number is good number else print 'Bad Number'
*/

import java.util.Scanner;

public class good_bad_num {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        s.close();
        int temp=n;
        int sum=0;
        while (temp>0) {
            int rem = temp%10;
            sum+=rem;
            temp=temp/10;
        }
        if(n%sum==0){
            System.err.println("Good Number");
        }else{
            System.out.println("Bad Number");
        }
    }
}
