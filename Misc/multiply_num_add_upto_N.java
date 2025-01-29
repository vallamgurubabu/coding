package Misc;
import java.util.Scanner;

public class multiply_num_add_upto_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i<n){
                System.out.print(i+"X"+n+"+");
            }else{
                System.out.print(i+"X"+n);
            }
            
            sum=sum+(n*i);
        }
        System.out.print(" = ");
        System.out.println(sum);
        s.close();
    }
}
