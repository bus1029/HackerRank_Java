package Practice.Strings.Valid_Username_Regular_Expression;

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */

    // 첫 번째 글자는 무조건 알파벳이어야 한다.
    // [a-zA-Z]\\w만 해줘도 첫 번째 글자는 알파벳이고 그 뒤는 알파벳, 숫자 다 나올 수 있다는 뜻이다.
    public static final String regularExpression = "[a-zA-Z]\\w{7,29}|[a-zA-Z]\\w_\\w{7,29}";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
