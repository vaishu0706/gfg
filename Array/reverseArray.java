import java.util.Scanner;

public class reverseArray {
    
    public static void reverse(int[]arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
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
        reverse(arr);
        
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

    }
}
