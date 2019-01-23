package Practice.Strings.Syntax_Checker;

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();

            //Write your code
            /*
            Pattern.compile Method는 Syntax가 잘못되면
            PatternSyntaxException을 일으킨다.
             */
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            finally {
                testCases -= 1;
            }
        }
    }
}




