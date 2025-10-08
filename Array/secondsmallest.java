import java.util.Scanner;

public class secondsmallest {
    
    public static int secondSmallest(int[]arr){

        int first = Integer.MAX_VALUE,second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<first){
                second = first;
                first = arr[i];

            }else if(arr[i]<second){
                second = arr[i];
            }
        }
        return second;
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
        int ele = secondSmallest(arr);
        System.out.println("second Smallest "+ele);
    }
}
