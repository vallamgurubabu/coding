//input = [ 2 4 7 1 6 3 ]  k= 3 output = 7 7 7 6
import java.util.Scanner;

public class max_element_K_sub_array {
   public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int n =s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int k =s.nextInt();    
        s.close();
    for(int i=0;i<n-k+1;i++){
        int max=0;
        int j=i;
        for(int l=0;l<k;l++){
            
            max=Math.max(max, arr[j]);
            j++;
        }
        System.out.print(max+" ");
    }
   }
}
