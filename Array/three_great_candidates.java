import java.util.Scanner;

public class three_great_candidates {
    public static int candidates(int[]arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int mina= Integer.MAX_VALUE;
        int minb= Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];

            } else if(arr[i]>second){
                third = second;
                second = arr[i];

            } else if(arr[i]>third){
                third = arr[i];
            }

            if(arr[i]<mina){
                minb=mina;
                mina=arr[i];

            } else if(arr[i]<minb){
                minb = arr[i];
            }
        }
        return Math.max(mina*minb*first , first*second*third);
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
        int ele = candidates(arr);
        System.out.println(ele);
    }
}
