import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        s.close();
        int a=0,b=1;
        int c=0;
        int sum=1;
        if(n==1){
            System.out.println("The "+n+"th Fibonacc is 0");
            sum=0;
        }else if(n==2){
            System.out.println("The "+n+"th Fibonacc is 1");
            sum=1;
        }else{
            System.out.print(a+" "+b);
            for(int i=0;i<n-2;i++){
                c=a+b;
                sum+=c;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
            System.out.println("\nThe "+n+"th Fibonacc is "+c);
            
        }
        System.out.println("sum of  till "+n+"th fibonacci series "+ sum);
        
        

    }
}
