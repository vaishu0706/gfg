import java.util.Scanner;

public class number_appears_once {
 
    public static int Appears(int[]arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        return res;
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
        int c = Appears(arr);
        System.out.println("Appears once in an Array "+c);
    }
}
