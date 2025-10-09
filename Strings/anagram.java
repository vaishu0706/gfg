package Strings;
import java.util.Scanner;

public class anagram {
    public static boolean Isomorphicnot(String s1,String s2){
        
        int[]freq = new int[26];
        if(s1.length()!=s2.length())return false;
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }

        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = sc.next();

         System.out.println("Enter String2");
         String s2 = sc.next();
         sc.close();

         boolean value = Isomorphicnot(s1,s2);
         System.out.println(value);
    }
}
