import java.util.Scanner;

public class thirdsmallest {

    public static int thirdSmallest(int[]arr){

        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE,third=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]<third){
                third = arr[i];
            }
        }
        return third;
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
        int ele = thirdSmallest(arr);
        System.out.println("third smallest "+ele);
    }
}
