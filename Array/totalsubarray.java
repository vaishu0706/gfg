import java.util.Scanner;

public class totalsubarray {
    public static int count(int[]arr){
        int n = arr.length;
            return n*(n+1)/2;
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
        System.out.println("total possible "+ele);

    }
}
