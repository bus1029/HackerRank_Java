package Practice.Strings.Day_22_Duplicate_Words;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        /*
        (?i): 대소문자를 구분하지 않음
        \\b: Word Boundary
        - 말 그대로 각 단어들의 Boundary를 지정해줌
        ([a-z]+): 한 개 이상의 문자들로 이루어진 단어
        \\b: Word Boundary
        (?:X): X, as a non-capturing group
        \\s+: 한 개 이상의 space가 나옴

        Back References
        \n: Whatever the nth capturing group matched

        \\1: Back reference to the first (captured) group; so the word is repeated here
        \\b: word Boundary

        )+: 반복되는 문자 외에 다른 문자들이 한개 이상 나올 수 있다.

        => 위 문자들을 풀어서 설명해보면

        1. 대소문자를 구분하지 않고 어떤 패턴을 인식할 건데,
        2. 특정 단어가 Boundary를 가지고 있다. \\b()\\b
        3. 특정 단어는 a-z까지가 1개 이상 나온다.
        4. 무시해야 할 패턴이 있는데, (?:
        5. 공백이 한 개 이상 나오는 경우이다. (\\s+)
        6. 그리고 공백 뒤에 처음에 capture된 패턴이 다시 나온다. (\\1)
        7. 그리고 그 패턴은 word boundary를 가지고 있다. (Word Character로 끝난다)
        8. 처음에 반복된 패턴들이 한 개 이상 나온다. )+

         */
        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        // By default, case-insensitive matching assumes that only characters in the US-ASCII charset are being matched.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            /*
            Goodbye bye bye world world world 문장에서 예를 들어보면
            m.find()
            group(0): bye bye
            group(1): bye (\\1이 쓰이는 이유)

            m.find()
            group(0): world world world
            group(1): world (\\1이 쓰이는 이유)

             */
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}


