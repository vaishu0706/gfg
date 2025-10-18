package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class print_substrings {
    
    public static List<String>print(String s){
         List<String>list = new ArrayList<>();
        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        return list;

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        sc.close();
        List<String>res = print(str);
        for(String a:res){
            System.out.println(a);
        }
    }
}
