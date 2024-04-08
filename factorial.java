import java.util.Scanner;

/**
 * factorial with out using multiplication operator
 */
public class factorial {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    s.close();
    int ans=n;
    for(int i=n-1;i>0;i--){
        int sum=0;
        for(int j =0;j<i;j++){
            sum=sum+ans;
        }
        ans=sum;
    }
    System.out.println(ans);
}
    
}
