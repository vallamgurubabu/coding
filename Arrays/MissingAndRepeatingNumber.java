package Arrays;

import java.util.Scanner;

public class MissingAndRepeatingNumber {
    // time complexity O(n2)
    // space complexity O(1)
    private static void findMissingAndRepeatingNumber1(int[] arr, int n) {
        int missing = -1;
        int repeating = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                missing = i;
            } else if (count == 2) {
                repeating = i;
            }
            if (missing != -1 && repeating != -1) {
                break;
            }

        }
        System.out.println("Missing: " + missing + ", Repeating: " + repeating);
    }

    // using HashMap time complexity is O(2n)
    // space complexity is O(n)

    // Optimal solution is using Maths
    // time complexity is O(n)
    // space complexity is O(1)
    private static void findMissingAndRepeatingNumber2(int[] arr, int n) {
        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;
        long s = 0;
        long s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }
        long val1 = s - sn;
        long val2 = s2 - s2n;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        System.out.println("Missing: " + y + ", Repeating: " + x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        findMissingAndRepeatingNumber1(arr, n);
        findMissingAndRepeatingNumber2(arr, n);

    }

}
