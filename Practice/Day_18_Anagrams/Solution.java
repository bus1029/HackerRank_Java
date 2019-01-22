package Practice.Day_18_Anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        // 정렬했을 때 같은 형태면 Anagram이다.
        java.util.Arrays.sort(charsA);
        java.util.Arrays.sort(charsB);

        a = new String(charsA);
        b = new String(charsB);

        return a.equals(b);
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

