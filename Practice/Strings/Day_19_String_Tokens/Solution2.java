package Practice.Strings.Day_19_String_Tokens;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        /*
        정규표현식
        []: 문자의 집합이나 범위를 표현합니다. - 기호를 통해 범위를 나타낼 수 있습니다.
        ^가 존재하면 not을 의미합니다.

        +: 앞 문자가 1개 이상 존재할 수 있습니다.

         */
        String delimeters = "[ !,?._'@]+";
        // trim: 왼쪽, 오른쪽에 있는 공백들을 모두 제거해주는 함수
        String[] splits = s.trim().split(delimeters);

        // String에 공백도 포함되서 올 수 있는데, 이 때 trim을 사용하면 좌우 공백이 모두 지워진다.
        if (s.trim().equals("")) {
            System.out.println("0");
        }
        else {
            System.out.println(splits.length + "");
        }

        for (String split : splits) {
            System.out.println(split);
        }

        scan.close();
    }
}
