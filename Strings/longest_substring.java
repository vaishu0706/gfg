package Strings;
import java.util.Scanner;

public class longest_substring {
    
    public static int longest(String s){

        int left = 0, right = 0;
        int res = 0;
        boolean value[]=new boolean[26];
        while(right<s.length()){

            while(value[s.charAt(right)-'a']==true){
                value[s.charAt(left)-'a']=false;
                left++;
            }
            res = Math.max(res,right-left+1);
            value[s.charAt(right)-'a']=true;
            right++;
        }
        return res;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        sc.close();
       int l = longest(str);
       System.out.println(l);      
    }
}
