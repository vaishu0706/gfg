import java.util.Scanner;

public class thirdlargest {
        public static int thirdlargestt(int[]arr){

            int first = Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){

                if(arr[i]>first){
                    third = second;
                    second = first;                   
                    first = arr[i];
                }

                else if(arr[i]>second){
                    third = second;
                    second = arr[i];
                   
                }
                else if(arr[i]>third){
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
        int ele = thirdlargestt(arr);
        System.out.println("third largest "+ele);

    }
}
