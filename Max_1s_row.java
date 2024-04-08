/*
problem Statement: - Given a 2D array of n X m, consisting of only 1's and O's. Your mission is to find
he row Number with consisting the maximum number of 1's.
Note: If grid consist only zeros then return -1
*/

import java.util.Scanner;

/**
 * Max_1sMax_row
 */
public class Max_1s_row {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        s.close();
        int idx=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    count++;
                }    
            }
            if(count>max&&count!=0){
                idx=i;
                max=count;
            }
        }
        System.out.println(idx);

    }

}
