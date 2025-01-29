package Misc;
/*TCS NQT CODING 2019 <

Problem Statement - Given an n-digit large number in form of string, check
whether it is divisible by 4 or not. return 1 if it is divisible by 4 otherwise
return 0;

Sample Test Cast 1:
Input
n = "1939388348389598304" -> 04 -> 1
Output : 1
Sample Test Cast 2:
Input
n = "1939388348389598314" -> 14 -> 0
Output : 0

*

/*

*/
import java.util.Scanner;
public class div_4 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int n =str.length();
    int temp = Integer.parseInt(str.substring(n - 2));
    s.close();
    if(temp%4==0){
        System.out.println(temp+"-> "+1);
    }else{
        System.out.println(temp+"-> "+0);
    }
    
   } 
}
