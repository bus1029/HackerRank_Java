package Practice.Day_14_Strings_Introduction;

import java.io.*;
import java.util.*;

public class Solution {

    private static String capitalizeFirstLetter(final String line) {
        // string.substring(index) => string의 해당 index부터 가져오게됨
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();

        // For the first line, sum the lengths of A and B
        System.out.println(length + "");

        // For the second line, write Yes if A is lexicographically greater than B otherwise print No instead
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // For the third line, capitalize the first letter in both A and B and print
        // them on a single line, separated by a space.\
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));

    }
}




