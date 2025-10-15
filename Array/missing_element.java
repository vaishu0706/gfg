import java.util.Scanner;

public class missing_element {
    
    public static int missing(int[]arr){
        int n = arr.length+1;
        int esum = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (esum-sum);
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
        int c = missing(arr);
        System.out.println("Missing Element is "+c);
       
    }
}
