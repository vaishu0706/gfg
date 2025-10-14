import java.util.Scanner;

public class rearrange_elements_by_sign {
    
    public static void rearrange(int[]arr){
        int pos = 0;
        int neg = 1;
        int n = arr.length;
        int temp [] = new int[n];
        for(int i=0;i<n;i++){

            if(arr[i]>0){
                temp[pos]=arr[i];
                pos+=2;

            } else {
                temp[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
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
        rearrange(arr);
        System.out.println("array");
        for(int ele:arr){
        System.out.println(ele);
        }
    }
}
