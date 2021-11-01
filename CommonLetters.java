import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonLetters {
        public static void main(String args[])
        {
           System.out.println("Enter Your String 1: ");
           Scanner sc = new Scanner(System.in);
           String str1 = sc.nextLine();
           System.out.println("Enter Your String 2: ");
           String str2 = sc.nextLine();
    
           Set<String> str = new HashSet<String>();
           for(int i=0;i<str1.length();i++){
               for (int j = 0; j < str2.length(); j++) {
                  if(str1.charAt(i) == str2.charAt(j)){
                      str.add(str1.charAt(i)+"");
                  }
            }
           }
    
            System.out.println(str);
        }
    }

    
