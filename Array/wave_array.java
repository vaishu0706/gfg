import java.util.Scanner;
public class wave_array {
    public static void wave(int[]arr){

        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
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
        wave(arr);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
