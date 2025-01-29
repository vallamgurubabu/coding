package Misc;
/*Problem Statement: - You have given two string s1 and s2, your mission is to calculate the sum of the
character occurrences of the s2 string in string s1.
*/
import java.util.HashMap;
import java.util.Scanner;
public class char_sum {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String s1=s.nextLine();
    String s2=s.nextLine();
    s.close();
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int i=0;i<s1.length();i++){
        if(hm.containsKey(s1.charAt(i))==true){
            int temp=hm.get(s1.charAt(i));
            hm.put(s1.charAt(i),temp+1);
        }else{
            hm.put(s1.charAt(i),1);
        }
    }
    int occr=0;
    for(int i=0;i<s2.length();i++){
        occr=occr+hm.get(s2.charAt(i));
    }
    System.out.println(occr);
   } 
}
