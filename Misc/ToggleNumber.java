package Misc;
import java.util.Scanner;

public class ToggleNumber {
    public static int toggleNumber(int n) {
        int temp = n;
        int numBits = 0;

        // Count the number of bits
        while (temp > 0) {
            temp >>= 1;
            numBits++;
        }

        // Check if there are no bits, return 0
        if (numBits == 0) {
            return 0;
        }

        // Create bitmask
        int bitmask = (1 << numBits) - 1;

        // Toggle the bits
        int toggled = n ^ bitmask;

        return toggled;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int result = toggleNumber(n);

        System.out.println("Result: " + result);
    }
}
