import java.util.Scanner;

public class kadanes {
    public static int count(int[]arr){

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=max){
                max = sum;
            }
            if(sum<0){sum=0;}
        }
        return max;
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
