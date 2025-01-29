package Misc;
// > TCS NQT JANUARY 2024 <-
/* Write a program to calculate the pair count in the given array such that the sum of the pairs is
divisible by 2*/

import java.util.Scanner;

public class pair_count {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%2==0){
                     count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int countPair(int[] arr, int n) {
        int cntPair = 0;
        Map<Pair, Boolean> mp = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int c = a + b;
                Pair p = new Pair(a, b);

                // Check if the pair's sum is even and if it's not already counted
                if (c % 2 == 0 && !mp.containsKey(p)) {
                    cntPair++;
                    mp.put(p, true);
                }
            }
        }
        return cntPair;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int ans = countPair(arr, n);
        System.out.println(ans);
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Pair)) return false;
            Pair other = (Pair) obj;
            return (this.first == other.first && this.second == other.second)
                    || (this.first == other.second && this.second == other.first);
        }

        @Override
        public int hashCode() {
            return first + second;
        }
    }
}

 */