import java.util.*;
class LargestElement {

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
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element is " +max);
    }
}