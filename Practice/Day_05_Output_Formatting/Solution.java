package Practice.Day_05_Output_Formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String str_x = x + "";

            if (str_x.length() == 3) {
                System.out.println(String.format("%-15s%3s", s1, str_x));
            }
            else if (str_x.length() == 2) {
                System.out.println(String.format("%-15s%3s", s1, "0" + str_x));
            }
            else if (str_x.length() == 1) {
                System.out.println(String.format("%-15s%3s", s1, "00" + str_x));
            }
        }

        System.out.println("================================");

    }
}




