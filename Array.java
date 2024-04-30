import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); 
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(arr[i]);
        }
        System.out.println("\n"+sum);
        s.close();
    }
}
