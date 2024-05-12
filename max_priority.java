import java.util.*;

public class max_priority {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int [n];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])==true){
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
            }
        }
         s.close();
         for(int i : hm.keySet()){
            // System.out.println(hm.get(i)+"->"+i);
            if(hm.get(i)>n/2){
                System.out.print(i);
            }
         }
         
        
    
    }
}
