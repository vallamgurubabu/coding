import java.util.Scanner;
public class max_length_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str=str+" ";
        s.close();
        int count = 0;
        int max;
        if(str.length()==0){
             max=0;
        }else{
            max = Integer.MIN_VALUE;
        }
    
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                max = Math.max(max, count);
                count = 0;
            } else{
               
                count++;
            }
                
            
        }
        System.out.println(max);
    }
}
