package Misc;
/*There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
*/

import java.util.Scanner;

public class string_cal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input strings
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        // Calculate sum of lengths
        int sumLengths = s1.length() + s2.length();
        
        // Check lexicographical order
        String lexOrder = (s1.compareTo(s2) > 0) ? "Yes" : "No";
        
        // Capitalize first letter of each string
        String capitalized = Character.toUpperCase(s1.charAt(0)) + s1.substring(1)+ " " + Character.toUpperCase(s2.charAt(0)) + s2.substring(1);
        
        // Print output
        System.out.println(sumLengths);
        System.out.println(lexOrder);
        System.out.println(capitalized);
        
        scanner.close();
    }
}
