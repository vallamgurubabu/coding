package Misc;
/*Problem Statement:
Write a Java program that takes an array of integers as input and prints all elements that occur an even number of times in the array.
Input:
Array: [1, 2, 3, 2, 4, 1, 3, 5, 4]
Output:
1 2 3 4

Example:
Given an array [1, 2, 3, 2, 4, 1, 3, 5, 4], the program should output 1 2 3 4, as these elements occur twice in the array.

Explanation:
The program first takes an integer n as input, representing the number of elements in the array. Then it takes n integers as input to populate the array. It uses a HashMap to store the frequency of each element in the array. Finally, it iterates through the HashMap and prints the keys (elements) whose frequency is even.
*/

import java.util.HashMap;
import java.util.Scanner;

public class Even_Frequency_Elements_Finder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])==true){
                int temp=hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {

            if (entry.getValue() % 2 == 0) {

                System.out.print(entry.getKey() + " ");

            }

        }
    }
}
