import java.util.Scanner;

public class reverse_array_in_group {
    
    public static void reversegroup(int[]arr,int k){

        int n = arr.length;
        for(int i=0;i<n;i+=k){
            int left = i;
            int right = Math.min(i+k-1,n-1);

            while(left<right){
                int t = arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
        }
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
        System.out.println("Enter k");
        int k = sc.nextInt();
        sc.close();
        reversegroup(arr,k);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
