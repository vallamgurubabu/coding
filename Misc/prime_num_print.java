package Misc;
import java.util.Scanner;

public class prime_num_print {
    public static int findNthPrime(int n) {
        if (n <= 0)
            return -1;

        boolean[] isPrime = new boolean[1000000];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int count = 0;
        for (int p = 2; p < isPrime.length; p++) {
            if (isPrime[p]) {
                count++;
                if (count == n)
                    return p;
                for (int i = 2 * p; i < isPrime.length; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int terms = s.nextInt();

        int ans[] = new int[terms];
        for (int i = 0; i < terms; i++) {
            ans[i] = s.nextInt();
        }
        s.close();
        for (int i = 0; i < terms; i++) {
            System.out.println(findNthPrime(ans[i]));
        }
    }
}