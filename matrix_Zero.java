/*input:
 * [1 2 3 4 5]
 * [1 2 3 4 5]
 * [1 2 3 4 5]
 * [1 2 3 4 5]
 * [1 2 3 4 5]
 * output:
 * [1 0 0 0 0]
 * [1 2 0 0 0]
 * [1 2 3 0 0]
 * [1 2 3 4 0]
 * [1 2 3 4 5]
 */

import java.util.Scanner;

public class matrix_Zero {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
         for(int j =0;j<n;j++){
             arr[i][j]=s.nextInt();
         }
        } 
        s.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i<j){
                arr[i][j]=0;
              }
            }
        } 
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
              
                System.out.print(arr[i][j]+" ");
              }
              System.out.print("]");
              System.out.println("");
            }
         
          
    } 
}
