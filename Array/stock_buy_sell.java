import java.util.Scanner;

public class stock_buy_sell {
    
    public static int stock(int[]arr){
        int prices = 0;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1]<arr[i]){
                prices+=arr[i]-arr[i-1];
            }
        }
        return prices;
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
        int ele = stock(arr);
        System.out.println("Max Profit is "+ele);

    }
}
