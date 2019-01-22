package Practice.Strings.Day_18_Anagrams;

import java.util.Scanner;

public class Solution2 {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        // Counter를 저장하기 위한 HashMap 선언
        java.util.Map<Character, Integer> aMap = new java.util.HashMap<>();

        // for 문을 돌면서 각각의 문자들을 Dictionary에 넣음
        for (int i = 0; i < a.length(); i++) {
            Character letter = charsA[i];

            if (!aMap.containsKey(letter)) {
                aMap.put(letter, 1);
            }
            else {
                aMap.put(letter, aMap.get(letter) + 1);
            }
        }

        // b의 for문을 돌면서 생성되어 있는 Dictionary와 비교를 시작
        for (int i = 0; i < b.length(); i++) {
            Character letter = charsB[i];

            if (!aMap.containsKey(letter)) {
                return false;
            }
            else {
                Integer count = aMap.get(letter);
                count -= 1;

                if (count < 0) {
                    return false;
                } else {
                    aMap.put(letter, count);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
