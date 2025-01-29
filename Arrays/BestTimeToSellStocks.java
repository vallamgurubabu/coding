package Arrays;

import java.util.Scanner;

public class BestTimeToSellStocks {
    // time complexity o(n2).
    public static int bestTimeToSellStocks(int arr[], int n) {
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int profit = (arr[j] - arr[i]);
                    maxProfit = Math.max(profit, maxProfit);
                }
            }
        }
        return maxProfit;
    }

    // time complexity o(n).
    public static int optimalBestTimeToSellStocks(int arr[], int n) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(arr[i], minPrice);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
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
        System.out.println(bestTimeToSellStocks(arr, n));
        System.out.println(optimalBestTimeToSellStocks(arr, n));
        sc.close();
    }
}
