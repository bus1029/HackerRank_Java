package Practice.Strings.Tag_Content_Extractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            boolean found = false;

            //Write your code here
            // .: 임의의 한 문자
            // .+: 한 개 이상의 임의의 문자들이 올 수 있음.(공백 포함)
            // 여기선 tag 사이의 컨텐츠가 없는 경우는 None으로 나와야 하기 때문에
            // * 대신 +를 사용한다.
            // [^<]: <을 제외한 모든 문자가 내용으로 올 수 있음.
            // <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par> 이런 경우를 고를 수 있음.
            String regex = "<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }

            if (! found) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}




