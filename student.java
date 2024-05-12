import java.util.ArrayList;
import java.util.Scanner;
public class student {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Students ");
        int n = s.nextInt();
        s.nextLine(); 
        String details[][] = new String[n][4]; 
        System.out.println("Enter Student Details for each student (Name Age Grade Gender)");
        for (int i = 0; i < n; i++) {
            String line = s.nextLine();
            String[] studentDetails = line.split(" ");
            for (int j = 0; j < 4; j++) {
                details[i][j] = studentDetails[j];
            }
        }
        ArrayList<Integer>Grade_convert=new ArrayList<>();
        ArrayList <String> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
              if(Integer.parseInt(details[i][1])>20){
                arr.add(details[i][0]);
                int value = (int)details[i][2].charAt(0);
                Grade_convert.add(value);
              }
        }
        System.out.println("STUDENT NAMES WHOS AGE IS GREATER THAN 20");
        for(String i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\nAverage GRADE IN ASCII VALUE WHOS AGE IS GREATER THAN 20 ");
        int avg=0;
        for(int i : Grade_convert){
            avg+=i;
        }
        System.out.println(avg/n);
        s.close();
    }
}
