/*check if the number is divisibble by 11 or not 
with out using divisible operator
*/

import java.util.Scanner;

/**
 * divisible_check
 */
public class divisible_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while (n > 11) {
            n = n - 11;
        }
        if (n == 11) {
            System.out.println("it is divisible by 11");
        } else {
            System.out.println("it is  not divisible by 11");
        }

    }

}