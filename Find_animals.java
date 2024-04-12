//Count Number of animals in a zoo from given number of head and legs
/*Given the total number of Legs and Head of Rabbits and Pigeons. The task is to calculate the number of Rabbits and Pigeons.

Examples: 

Input: Heads = 200, Legs = 540 
Output: Rabbits = 70, Pigeons = 130
Input: Heads = 100, Legs = 300
Output: Rabbits = 50, Pigeons = 50

*/

import java.util.Scanner;

public class Find_animals {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int Heads=s.nextInt();//taking total heads
    int Legs=s.nextInt();//taking total legs
    int Rabbits = 0; //rabbits had 4 legs
    int Pigeons =0 ;//pigeons had 2 legs
    s.close();
     Rabbits = (Legs-2*Heads)/2;  //formula is (Rabbits = legs-2*heads)/2
     Pigeons = Heads-Rabbits;
    System.out.println("Rabbits => "+Rabbits+" "+"Pigeons => "+Pigeons);
   } 
}
