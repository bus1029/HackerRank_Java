package Practice.Day_10_Static_Initializer_Block;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int B;
    private static int H;
    private static boolean flag;
    private static Scanner sc = new Scanner(System.in);

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        flag = B > 0 && H > 0;

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main
}//end of class


