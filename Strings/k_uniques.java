package Strings;

import java.util.Scanner;

public class k_uniques {
    
    public static int unique(String s,int k){
        int freq[]=new int[26];
        int j=0,i=0;
        int count=0;
        int res = -1;
        while(j<s.length()){

           freq[s.charAt(j)-'a']++;
           if(freq[s.charAt(j)-'a']==1){
            count++;
           }

           while(count>k){
            freq[s.charAt(j)-'a']--;
            if(freq[s.charAt(j)-'a']==0){
                count--;
            }
            i++;
           }
           if(count==k){
            res = Math.max(res, j-i+1);
           }
           j++;
        }
        return res;

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        
        System.out.println("Enter k");
        int k = sc.nextInt();
        sc.close();
       int l = unique(str,k);
       System.out.println(l);      
    }
}
