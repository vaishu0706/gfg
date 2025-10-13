import java.util.Scanner;

public class sort_arrayof012 {

        public static void sort(int[]arr){

            int low = 0,mid=0,high=arr.length-1;
            for(int i=0;i<arr.length;i++){

                if(arr[mid]==0){
                    int temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                }
                else if(arr[mid]==1){
                    mid++;
                }else if(arr[mid]==2){
                    int t = arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=t;
                    high--;
                }
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
        sort(arr);
        for(int num :arr){
        System.out.println(num);
        }
    }
}
