package Arrays;

import java.util.Scanner;

public class PascalTriangle1 {

    // problem 1 is to find value of a perticular position in pascal triangle
    // row-1
    // Formula: C
    // col-1
    // ==> nCr here n = row-1 and r = col-1
    public static void pascalTriangle1(int row, int col) {
        System.out.println(Ncr(row - 1, col - 1));
    }

    // problem 2 is to print nth row of pascal triangle
    // time complexity O(row*col)
    public static void pascalTriangle2(int row) {
        for (int col = 1; col <= row; col++) {
            int val = Ncr(row - 1, col - 1);
            System.out.print(val + " ");
        }
    }

    // problem 3 is to print upto nth row of pascal triangle
    // time complexity O((row*col)*(row))
    private static void pascalTriangle3(int row) {
        for (int i = 1; i <= row; i++) {
            for (int col = 1; col <= i; col++) {
                int val = Ncr(i - 1, col - 1);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // problem 2 is to print nth row of pascal triangle
    // time complexity O(row)
    public static void pascalTriangle2_Optimal(int row) {
        int ans = 1;
        System.out.print(ans + " ");
        for (int col = 1; col < row; col++) {
            ans *= row - col;
            ans /= col;
            System.out.print(ans + " ");
        }
    }

    private static void pascalTriangle3_optimal(int row) {
        for (int i = 1; i <= row; i++) {
            pascalTriangle2_Optimal(i);
            System.out.println();
        }
    }

    // Effective Ncr formula
    public static int Ncr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("value of a perticular position in pascal triangle");
        pascalTriangle1(row, col);
        // print 5th row of an pascal traingle
        System.out.println("print " + row + "th row of an pascal traingle");
        pascalTriangle2(row);
        System.out.println();
        pascalTriangle2_Optimal(row);
        System.out.println("\nprint upto " + row + "th row of an pascal traingle");
        pascalTriangle3(row);
        System.out.println();
        pascalTriangle3_optimal(row);
        sc.close();
    }
}
