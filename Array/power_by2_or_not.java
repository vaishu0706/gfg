import java.util.Scanner;

public class power_by2_or_not {
    
    public static boolean power(int num){
        while(num>1){
            if(num%2!=0){
                return false;
            }
            num/=2;
        }
        return true;
    }
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
      
        sc.close();
        boolean value = power(num);
        System.out.println(value);
    }
}
