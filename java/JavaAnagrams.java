

import java.util.Scanner;
import java.util.HashMap; 
import java.util.Map; 

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length())
            return false;
        
        a = a.toUpperCase();
        b = b.toUpperCase();

        for(int i=0; i < a.length(); i ++){
            int index = b.indexOf(a.charAt(i));
            if(index != -1){
                b = b.substring(0, index) + b.substring(index+1, b.length());
            }
            else{
                return false;
            }
        }

       

        return true;
        // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}