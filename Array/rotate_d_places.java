import java.util.Scanner;

public class rotate_d_places {
     
    public static void rotate(int[]arr,int d){
        int n = arr.length;
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
        static void reverse(int[]arr,int start,int end){
                while(start<end){
                    int t = arr[start];
                    arr[start]=arr[end];
                    arr[end]=t;
                    start++;
                    end--;
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
        System.out.println("Enter d");
        int d = sc.nextInt();
        sc.close();
        rotate(arr,d);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
