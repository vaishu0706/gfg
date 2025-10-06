import java.util.Scanner;

public class SmallestElement {
    
    public static int smallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min = arr[i];
            }
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
        int ele = smallest(arr);
        System.out.println(ele);

    }
}
