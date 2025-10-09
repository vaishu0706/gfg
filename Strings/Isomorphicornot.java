package Strings;
import java.util.*;
public class Isomorphicornot {

    public static boolean Isomorphicnot(String s1,String s2){

        HashMap<Character,Integer>m1=new HashMap<>();
          HashMap<Character,Integer>m2=new HashMap<>();

          if(s1.length()!=s2.length())return false;
          for(int i=0;i<s1.length();i++){

            if(!m1.containsKey(s1.charAt(i))){
                m1.put(s1.charAt(i),i);
            }

            if(!m2.containsKey(s2.charAt(i))){
                m2.put(s2.charAt(i),i);
            }

            if(!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))){
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
