package sortings;
import java.util.Scanner;
public class insertion {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = s.nextInt();
    }
    s.close();
    for(int i=1;i<n;i++){
        int k =arr[i];
        int j=i-1; 
        while(j>=0 && arr[j]>k){
            arr[j+1]=arr[j];
           j--;
        }
        arr[j+1]=k;

    }
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" "); 
    }
 }   
}
