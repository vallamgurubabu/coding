import java.util.Scanner;

public class max_priority {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max_priority=Integer.MIN_VALUE;
        s.close();
        for(int i=0;i<n/2;i++){
            max_priority=Math.max(max_priority, arr[i]);
        }
        int count=0;
        for(int i=0;i<n/2;i++){
            if(max_priority==arr[i]){
                count++;
            }        
        }
        System.out.println(count);
    }
}
