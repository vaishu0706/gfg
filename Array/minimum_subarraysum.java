import java.util.Scanner;

public class minimum_subarraysum {

    public static int count(int[]arr){

            int sum = 0;
            int min = Integer.MAX_VALUE;
           for(int num : arr){
            sum+=num;
            if(num<sum){
                sum=num;
            }
            min = Math.min(sum, min);
           }
           return min;
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
        System.out.println("Min sum is "+ele);

    }
}

