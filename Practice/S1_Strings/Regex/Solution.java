package Practice.S1_Strings.Regex;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    /*
    (): 소괄호 안의 문자를 하나의 문자로 인식한다.
    []: 문자의 집합이나 범위를 나타내며, 두 문자 사이는 -기호로 표현한다.
    [] 내에서 ^가 선행하여 존재하면 not을 나타낸다.

    {}: 횟수 또는 범위를 나타낸다.
    \: 정규표현식 \는 확장문자. \다음에 일반 문자가 오면 특수문자로 취급하고,
    \다음에 특수문자가 오면 그 문자 자체를 의미한다.

    \\d{1,2}: 1~2자리의 숫자들을 잡아낸다.
    (0|1)\\d{2}: 0이나 1로 시작하는 3자리 숫자들을 잡아낸다.
    2[0-4]\\d: 200-249사이의 숫자들을 잡아낸다.
    25[0-5]: 250-255 사이의 숫자들을 잡아낸다.
     */
    private String matches = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = matches + "\\." + matches + "\\." + matches + "\\." + matches;
}

