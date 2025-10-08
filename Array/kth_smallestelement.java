import java.util.Scanner;

public class kth_smallestelement {
    
    public static int smallest(int[]arr,int k){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int temp[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=arr[i];
        }
        int count = 0;
        int ans = 0;

        for(int i=0;i<temp.length;i++){
            if(count==k){
                break;
            }
            if(temp[i]!=0){
                count++;
                ans = temp[i];
            }
        }
        return ans;
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
        System.out.println("Enter k");
        int k = sc.nextInt();
        sc.close();
        int ele = smallest(arr,k);
        System.out.println(ele);

    }
}
