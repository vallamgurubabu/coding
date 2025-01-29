package Misc;
/*Write a program to find non repeating element in an array (Uniqu
elements)

input: Size of Array, Array
Output: Non repeating elements

Example:

nput: 5
[12341]

Output: Non-repeating element[1]:2 Non-repeating element[2]:3 Non-repeating element[3]:4
Ac
0(n*n)
*/

// import java.util.Scanner;

// public class NonRepeatingElement  {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n=s.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=s.nextInt();
//         }
//         s.close();
//         for(int i=0;i<n-1;i++){
//             int count=0;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
                    
//                    count++;
//                 }   
//             }
//             if(count==0){
//                 System.out.print(arr[i]+" ");
//             }
            
//         }
//     }
// }

//0(n)
import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        boolean foundNonRepeating = false;
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                System.out.print(num + " ");
                foundNonRepeating = true;
            }
        }
        if (!foundNonRepeating) {
            System.out.println("No non-repeating element found.");
        }
    }
}
