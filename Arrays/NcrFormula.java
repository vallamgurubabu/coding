package Arrays;
//nCr = n!/r!*(n-r)!

import java.util.Scanner;

public class NcrFormula {

    // this will give more time complexity normal approach
    public static int Ncr1(int n, int r) {
        return factorial(n) / (factorial(r) * (factorial(n - r)));
    }

    // time complexity is O(r)
    public static int Ncr2(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= n - i; // n*(n-1)*(n-2)*.....
            res /= (i + 1);// over all n/1*(n-1)/2*(n-2)/3*.....
        }
        return res;
    }

    // this method will give time complexity O(n)
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r values: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Answer of nCr :");
        // this will give more time complexity normal approach
        System.out.println(Ncr1(n, r));
        // this is optimal approach
        System.out.println(Ncr2(n, r));
        sc.close();
    }

}
