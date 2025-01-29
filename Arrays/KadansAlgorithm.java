package Arrays;

import java.util.Scanner;

//to find Max sum sub array.
public class KadansAlgorithm {
    // time complexity o(n3).
    public static int max_sum_subArray1(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // time complexity o(n2)
    public static int max_sum_subArray2(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j <= i; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // time complexity o(n)
    public static int kadansAlgorithm(int arr[], int n) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxi = Math.max(sum, maxi);

        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val1 = max_sum_subArray1(arr, n);
        System.out.println(val1);
        int val2 = max_sum_subArray2(arr, n);
        System.out.println(val2);
        int val3 = kadansAlgorithm(arr, n);
        System.out.println(val3);
        sc.close();

    }
}
