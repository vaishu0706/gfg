import java.util.Scanner;

public class move_all_zeros_to_end {
    
    public static void move(int[]arr){
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t = arr[i];
                arr[i]=arr[count];
                arr[count]=t;
                count++;
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
        sc.close();
        move(arr);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
