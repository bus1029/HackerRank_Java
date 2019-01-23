package Practice.Introduction.If_Else;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        // Check Number is odd or even
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
        	else if (N >= 20) {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}


