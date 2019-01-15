package Practice.Day_07_Loops_2;

import java.util.*;

class Solution{
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int current = a;
            for (int j = 0; j < n; j++) {
                int result = current + ((int) (Math.pow(2, j)) * b);
                System.out.print(result + " ");
                current = result;
            }
            System.out.println();

        }
        in.close();
    }
}


