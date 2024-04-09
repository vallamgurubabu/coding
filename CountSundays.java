/* Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes
to cycling with his friends.

So every time when the months starts he counts the number of sundays he will get to enjoy.
Considering the month can start with any day, be it Sunday, Monday .... Or so on.

Count the number of Sunday jack will get within n number of days.

Input  
mon-> input String denoting the start of the month. 
13  -> input integer denoting the number of days from the start of the month. 
Output : 
2    -> number of days within 13 days.
*/

import java.util.Scanner;
public class CountSundays {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String str= s.nextLine();
    int n = s.nextInt();
    s.close();
    String arr[]={"mon","tue","wed","thu","fri","sat","sun"};
    int i=0;
    for(i=0;i<arr.length;i++){
       if(str.equals(arr[i])){
           break;
       }
    }
    int rem =6-i;
    n=n-rem;
    int res=0;
    if(n>0){
      res=1+n/7;
    }
    System.out.println(res);
}
    
}