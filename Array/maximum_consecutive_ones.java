import java.util.Scanner;

public class maximum_consecutive_ones {
    public static int maximum(int[]arr){

        int count = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else {
                count = 0;
            }
            max = Math.max(max,count);
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
        int count = maximum(arr);
        System.out.println("max is "+count);
       
    }
}
