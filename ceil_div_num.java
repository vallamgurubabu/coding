import java.util.Scanner;

public class ceil_div_num {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        double ans=Math.ceil(n1/n2);
        int ans1=(int)ans*n2; 
        s.close();
        //o(1) time complexity
         
        // for(int i=n1;i>0;i--){
        //     if(i%n2==0){
        //         ans=i;
        //         break;
        //     }
        // }   
        //o(n) time complexity
        System.out.println(ans1);

    }
}
