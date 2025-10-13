import java.util.Scanner;

public class majority_element {

    public static int count(int[]arr){

        int count = 0;
        int ele = 0;
        for(int i=0;i<arr.length;i++){

            if(count==0){
                ele = arr[i];
                count = 1;
            }
            else if(ele==arr[i]){
                count++;
            }
            else {
                count--;
            }
        }
        int c =0;
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i])c++;
        }
        if(c>arr.length/2){
            return ele;
        }
        return -1;
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
        System.out.println(ele);

    }
}
