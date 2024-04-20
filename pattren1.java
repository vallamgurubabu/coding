import java.util.Scanner;

public class pattren1 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int times=s.nextInt();
    int nums[]=new int[times];
    for(int i=0;i<times;i++){
        nums[i]=s.nextInt();
    }

    for(int term=0;term<times;term++){
        int num =nums[term];

        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=num-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    s.close();
}    
}
