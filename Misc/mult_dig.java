package Misc;
/*A supermarket maintains a pricing format for all its products. A value N is printed on each product.
When the scanner reads the value N on the item, the product of all the digits in the value N is the price
of the item. The task here is to design the software such that given the code of any item N the product
(multiplication) of all the digits of value should be computed(price).

Example 1:

Input :5244 -> Value of N

Output :

160 -> Price
*/

import java.util.Scanner;

public class mult_dig {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.close();
    int price=1;
    while(n>0){
        int dig=n%10;
        price*=dig;
        n=n/10;
    }
    System.out.println(price);
   } 
}
