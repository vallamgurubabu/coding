/*Given an integer array Arr of size N the task is to find the count of elements whose value is greater than
all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of 3 elements is present in the array that meets the condition.

Hence the output = 3.
*/
import java.util.Scanner;
public class count_max {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                count++;
                max=arr[i];
            }
        }
        System.out.println(count);
    }
}
