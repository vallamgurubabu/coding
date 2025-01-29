package Arrays;

import java.util.Scanner;

public class XPowN {
    // time complexity O(n)
    private static long pow1(int x, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        return ans;
    }

    // time complexity log(n)
    private static long pow2(int x, int n) {
        if (n < 0) {
            // Handle negative exponents by taking the reciprocal
            return 1 / pow2(x, -n);
        }

        long result = 1;
        long base = x;

        while (n > 0) {
            if (n % 2 == 1) {
                // If the exponent is odd, multiply the result by the base
                result *= base;
            }
            // Square the base and halve the exponent
            base *= base;
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x, n vales: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        long val1 = pow1(x, n);
        System.out.println(val1);
        long val2 = pow2(x, n);
        System.out.println(val2);
        sc.close();
    }
}
