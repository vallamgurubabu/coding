package Misc;
import java.util.Scanner;

public class sum_cubes_natural_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long first =s.nextInt();//2
        long second = s.nextInt();//5
        s.close();
        long sum=0;
        for(long i=first;i<=second;i++){
            sum+=Math.pow(i,3);
        }
        System.out.println(sum);
    }  
}
