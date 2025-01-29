package Misc;
import java.util.Scanner;

public class sub_array_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target = s.nextInt();
        int count =0;
        int idx=0;
        s.close();
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++ ){
                    sum=sum+arr[k];
                    idx=k;
                }
                if(target == sum){
                    for(int l=i;l<=idx;l++){
                        System.out.print(arr[l]+" ");
                    }
                    System.out.println(" ");
                    count++;
                }   
            }
           
        }
        System.out.println(count);
    }

}
