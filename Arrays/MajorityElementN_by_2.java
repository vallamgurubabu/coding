package Arrays;

import java.util.Scanner;

public class MajorityElementN_by_2 {
    // we can run two loops and find Majority element
    // time complexity O(n2)

    // we can use HashMap
    // time complexity O(2n)+Nlogn
    // space complexity O(unique n elements)
    // we can use Optimal approach Moore's Voting Approach
    // time complexity O(n)
    private static int MooresVotingApproach(int arr[], int n) {
        if (n == 0)
            return -1;
        int count = 1;
        int majority = arr[0];
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                count = 1;
                majority = arr[i];
            } else if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        if (count != 0) {
            count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == majority)
                    count++;
            }
        }
        int finalAns = (count > n / 2) ? majority : -1;
        return finalAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int val = MooresVotingApproach(arr, n);
        System.out.println(val);
    }

}
