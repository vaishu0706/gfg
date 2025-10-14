import java.util.Scanner;

public class rotateArray {
    
    public static void rotate(int[]arr){

        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
         arr[arr.length-1]=temp;
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
        rotate(arr);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
