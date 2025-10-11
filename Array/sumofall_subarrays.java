import java.util.Scanner;

public class sumofall_subarrays {

    public static int count(int[]arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){

            sum = sum+arr[i]*(i+1)*(arr.length-i);
        }
        return sum;
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
        int ele = count(arr);
        System.out.println("Max sum is "+ele);

    }
}
