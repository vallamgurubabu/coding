package Misc;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class tatak_sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String items[] = new String[n];
        double price[] = new double[n];
        int units[] = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = scanner.next();
            price[i] = scanner.nextDouble();
            units[i] = scanner.nextInt();
        }
        
        HashMap<String, Double> hm = new HashMap<>();
        HashMap<String, Integer> hm1 = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            double total_Price = price[i] * units[i];
            if (hm.containsKey(items[i])) {
                double temp = hm.get(items[i]) + total_Price;
                hm.put(items[i], temp);
            } else {
                hm.put(items[i], total_Price);
            }
        }

        for (int i = 0; i < n; i++) {
            if (hm1.containsKey(items[i])) {
                int temp = hm1.get(items[i])+units[i] ;
                hm1.put(items[i], temp);
            } else {
                hm1.put(items[i],units[i] );
            }
        }
        
        double total = 0;
        String best_Seller_item = "";
        double max = Double.MIN_VALUE;
        System.out.println("Total sells List");
        for (Entry<String, Double> entry : hm.entrySet()) {
            total += entry.getValue();
            System.out.println(entry.getKey() + " => " + entry.getValue());
            if (entry.getValue() > max) {
                best_Seller_item = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println("Quantities List");
        for (Entry<String, Integer> entry : hm1.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            if (entry.getValue() > max) {
                best_Seller_item = entry.getKey();
                max = entry.getValue();
            }
        }
        
        System.out.println("Best Selling Item is " + best_Seller_item);
        System.out.println("Total = " + total);
        System.out.println("Average = " + (total / hm.size()));
        
        scanner.close();
    }
}
