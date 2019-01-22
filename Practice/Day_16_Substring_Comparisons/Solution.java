package Practice.Day_16_Substring_Comparisons;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // Initialize substring
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i < s.length()-k+1; i++) {
            String subString = s.substring(i, k+i);

            // smallest가 substring보다 크다면 갱신
            if (smallest.compareTo(subString) > 0) {
                smallest = subString;
            }

            // largest가 substring보다 작다면 갱신
            if (largest.compareTo(subString) < 0) {
                largest = subString;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
