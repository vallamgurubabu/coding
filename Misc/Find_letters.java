package Misc;

import java.util.Scanner; 
 
public class Find_letters { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String S = scanner.nextLine(); 
        scanner.close();
 
        int vowel = 0, consonant = 0, digit = 0, special = 0; 
        String vowels = "aeiou"; 
        String digits = "0123456789"; 
        String specials = "@#$%!*&^"; 
 
        for (char i : S.toCharArray()) { 
            if (vowels.contains(Character.toString(i))) { 
                vowel++; 
            } else if (!digits.contains(Character.toString(i)) && 
!specials.contains(Character.toString(i))) { 
                consonant++; 
            } else if (digits.contains(Character.toString(i))) { 
                digit++; 
            } else { 
                special++; 
            } 
        } 
 
        System.out.println(vowel + " " + consonant + " " + digit + " " + special); 
    } 
}