/*

Problem Statement: You have given a string s and a character ch, your task is to
find the first and last occurrence of the given character.

NOTE: Return the first and last occurrence indexes

*/

import java.util.Scanner;

public class first_last_Occ {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str =s.nextLine();
    char ch =s.next().charAt(0);
    s.close();
    int first=-1;
    int last=-1;
    for(int i=0;i<str.length();i++){
        if(ch==str.charAt(i)&&first==-1){
            first=i;
        }
        if(ch==str.charAt(i)){
            last=i;
        }
    } 
    System.out.println(first+" "+last);
   } 
}
