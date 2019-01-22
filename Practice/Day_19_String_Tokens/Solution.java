package Practice.Day_19_String_Tokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        // StringTokenizer의 Delimeter를 다양하게 지정해줄 수 있다.
        StringTokenizer st = new StringTokenizer(s, "!,?._'@ ");
        int tokenCount = st.countTokens();

        System.out.println(tokenCount + "");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        scan.close();
    }
}


