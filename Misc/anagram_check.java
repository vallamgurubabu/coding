package Misc;
/*
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Hello
hello
Sample Output 2

Anagrams


 */



import java.util.Scanner;

public class anagram_check {

     static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        // If lengths of both strings are not equal, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        
        // Sort character arrays
        sortCharArray(charArrayA);
        sortCharArray(charArrayB);
        
        // Compare sorted arrays
        for (int i = 0; i < charArrayA.length; i++) {
            if (charArrayA[i] != charArrayB[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Method to sort a character array
    static void sortCharArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

