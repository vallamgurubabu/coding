package Misc;
public class digit_sum_prime {
    public static void main(String[] args) {
        print_prime_range(10,40);
    }
    public static void print_prime_range(int start,int end){
        for(int i=start;i<=end;i++){
            
            if(check_prime(i)){
                int sum=digit_sum(i);
                if(check_prime(sum)){
                    System.out.print("\n"+sum+"->"+i);
                }
                
            }
        }
    }
    public static boolean check_prime(int n){
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int digit_sum(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
          int r=temp%10;
          sum+=r;
          temp=temp/10;
        }
        return sum;
    }
}
