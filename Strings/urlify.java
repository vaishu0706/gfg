package Strings;

import java.util.Scanner;

public class urlify {

    public static StringBuilder urlifyy(String s){

        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                str.append("%20");
            }else {
                str.append(s.charAt(i));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        sc.close();

        StringBuilder str1 = urlifyy(s);
        System.out.println(str1);
    }
}
