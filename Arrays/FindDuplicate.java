package Arrays;

import java.util.Scanner;

public class FindDuplicate {
    // we can do this using HashMap of frequency Array time complexity O(2n) and
    // space complexity O(n)
    // we can do this sort the array and check i, i+1 index using 2 for loops
    // time complexity o(n2)
    // we can do this using fast and slow technique
    // time complexity O(n) and space complexity O(1)
    // but the array elements should be within the index
    private static int findDuplicate(int[] arr, int n) {
        int fast = arr[0];
        int slow = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        fast = arr[0];
        while (fast != slow) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = findDuplicate(arr, n);
        System.out.println("Duplicate element is: " + val);
    }
}
