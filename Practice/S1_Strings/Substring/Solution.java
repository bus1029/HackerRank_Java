package Practice.S1_Strings.Substring;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String subS = S.substring(start, end);
        System.out.println(subS);
    }
}


