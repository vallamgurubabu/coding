import java.util.Scanner;

public class max_sum_sub_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum<0){
                sum=0;
            }
            max=Math.max(max, sum);
        }
        System.out.println(max);
        s.close();
    }
}
