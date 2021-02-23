package hackerrank.java;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().length() > 0) {
            String[] tokens = s.trim().split("[ !,?.\\_'@]+");
            // Write your code here.

            System.out.println(tokens.length);
            for (String a : tokens) {
                System.out.println(a);
            }
        } else {
            System.out.println(0);
        }
        scan.close(); 
    }
}
