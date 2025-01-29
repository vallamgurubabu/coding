package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//time complexity O(nlogn+2n)
public class MergeOverLapingSubIntervals {
    private static void mergeOverLapingSubIntervals(int arr[][]) {
        int n = arr.length;
        // sort the sub intervals
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int arr1[], int arr2[]) {
                return arr1[0] - arr2[0];
            }
        });
        // for storing answer
        List<List<Integer>> ans = new ArrayList<>();
        // traversal all the sub intervals
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            // if present intervals end in the answer list is less than or equal to present
            // checking interval's end. then we don't need to check
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            // other than above condition
            for (int j = i + 1; j < n; j++) {
                // if start of present interval is less than end
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        printList(ans);
    }

    // time complexity o(nlogn+n)
    private static void mergeOverLapingSubIntervals_Optimal(int arr[][]) {
        int n = arr.length;
        // sort Intervels
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        // travers Intervels
        for (int i = 0; i < n; i++) {
            // if answer empty or present interval start is greater than answer intervel end
            // we simply add present interval
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));

            } else {
                // other wise
                int maxEnd = Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]);
                ans.get(ans.size() - 1).set(1, maxEnd);
            }
        }
        printList(ans);
    }

    private static void printList(List<List<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many intervals you wants to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " intervals");
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("===========================");
        mergeOverLapingSubIntervals(arr);
        System.out.println("===========================");
        mergeOverLapingSubIntervals_Optimal(arr);

    }
}
