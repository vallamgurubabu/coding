import java.util.HashSet;
import java.util.Scanner;

public class DistinctXORSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size and elements
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // HashSet to store distinct XOR values
        HashSet<Integer> distinctXORs = new HashSet<>();

        // Iterate through each starting index
        for (int i = 0; i < n; i++) {
            int xor = 0;
            // Iterate through each ending index starting from i
            for (int j = i; j < n; j++) {
                xor |= arr[j]; // Update xor by XORing it with current element
                distinctXORs.add(xor); // Add xor to HashSet
            }
        }

        // Print distinct XOR values
        System.out.println("Distinct XOR values from all subarrays:");
        for (int xor : distinctXORs) {
            System.out.print(xor + " ");
        }
    }
}
