package Practice.Introduction.End_of_File;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int index = 0;
        while (sc.hasNextLine()) {
            index += 1;
            String line = sc.nextLine();
            System.out.println(String.format("%d %s", index, line));
        }

    }
}


