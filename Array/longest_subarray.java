import java.util.HashMap;
import java.util.Scanner;

public class longest_subarray {
    
    public static int count(int[]arr,int k){

        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0;
        int pre = 0;
        for(int i=0;i<arr.length;i++){
            pre+=arr[i];

            if(pre==k){
                res = i+1;
            }

            if(map.containsKey(pre-k)){
                res+=Math.max(res, i-map.get(pre-k));
            }
            if(!map.containsKey(pre-k)){
                map.put(pre, i);
            }
        }
        return res;
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
         System.out.println("Enter target");
         int k = sc.nextInt();

        sc.close();
        int ele = count(arr,k);
        System.out.println("Longest Subarray "+ele);

    }
}
