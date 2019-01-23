package Practice.Strings.String_Reverse;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // Given a String A, print Yes if it is a palindrome, print No otherwise.
        /*
        StringBuilder

        a mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no
        guarantee of synchronization. Where possible, it is recommended that this class be used in preference to
        StringBuffer as it will be faster under most implementations.
         */
        StringBuilder reversed = new StringBuilder();
        char[] chars = A.toCharArray();

        for (int i = A.length()-1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        if (A.equals(reversed.toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        /*
        혹은 reversed.reverse().toString();과 비교할 수도 있다.
         */
    }
}




