package Misc;
/*Problem Statement: Given two sorted arrays arrl and arr2 of size n and m. Find the union of two sorted
arrays.

Note: Return the result in sorted array.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class unnion_sort_arr {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    HashSet<Integer> hs=new HashSet<>();
    int arr1[]=new int [n];
    int arr2[]=new int [m];
    for(int i=0;i<n;i++){
        arr1[i]=s.nextInt();
    }
    for(int i=0;i<m;i++){
        arr2[i]=s.nextInt();
    }
    s.close();
    for(int i=0;i<n;i++){
        hs.add(arr1[i]);
    }
    for(int i=0;i<m;i++){
        hs.add(arr2[i]);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i :hs){
        ans.add(i);
    }
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
    }
   } 
}
