package Misc;
/*Write a program to accept a string(containing three words) and
display the same in reverse order.

Sample Input: coding is fun 
Output: fun is coding
*/

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String reversedString = reverseWords(input);
        System.out.println("Reversed string: " + reversedString);
    }
    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
