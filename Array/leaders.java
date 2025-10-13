import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class leaders {
    
    public static ArrayList<Integer> leaders(int[]arr){
        
        ArrayList<Integer>ap = new ArrayList<>();
        int max = arr[arr.length-1];
        ap.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                ap.add(max);
            }
        }
        Collections.reverse(ap);
        return ap;
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter Array Elements");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
       ArrayList<Integer>result = leaders(arr);
       System.out.println(result);
    }
}
