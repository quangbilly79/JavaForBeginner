package javacourse.section21collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionExercises {

    // Check xem các chữ cấu thành 1 từ, có cấu thành đc 1 từ khác không
    // Vd abc và cba => true
    // Ý tưởng là convert thành array các chữ (lowercase), xong sort, và ss 2 array
    public static boolean areAnagrams(String str1, String str2) {

        // Check null
        if (str1 == null || str2 == null) {
            return false;
        }
        String[] arrayStr1 = str1.toLowerCase().split("");
        String[] arrayStr2 = str2.toLowerCase().split("");
        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);
        return Arrays.equals(arrayStr1, arrayStr2);
    }

    // Kiểm tra xem 1 char có phải dạng hex k (0-9, a-f, A-F)
    // Dùng isDigit và char >= <= 'x'
    public static boolean isHexadecimalChar(char ch) {
        if (Character.isDigit(ch) ||
                (ch >= 'A' && ch <= 'F') ||
                        (ch >= 'a' && ch <= 'z')
        ) {
            return true;
        }
        return false;
    }
    // Kiểm tra xem 1 String có phải dạng hex k (mỗi kí tự phải thỏa mãn hàm isHexChar bên trên)
    public static boolean isHexadecimal(String str) {
        if (str == "" || str == null) {
            return false;
        }

        String[] arrayStr = str.split("");
        // Dùng stream để xài map và filter giống Scala
        Stream<String> streamChar = Arrays.stream(arrayStr)
                .filter(ch -> !isHexadecimalChar(ch.charAt(0)));
        List<String> listChar = streamChar.collect(Collectors.toList());
        System.out.println(listChar);
        if (listChar.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    // Hoặc dùng Regex cho nhanh
    public static boolean isHexadecimalRegex(String str) {
        if (str == "" || str == null) {
            return false;
        }
        return str.matches("[a-fA-F\\d]*");
    }

    // Đảo ngc từng từ trong 1 câu. Vd "Hello World" => "olleH dlroW"
    // Ý tưởng là tách ra từng từ, từng chữ, dùng Collections.reverse
    // và String.join để join ngc lại thành từ ngược, và thêm dần thành 1 câu
    public static String reverseWordsInSentence(String sentence) {
        if ( sentence == null) {
            return "INVALID";
        } else if (sentence == "") {
            return "";
        }
        String result = "";
        String[] wordsList = sentence.split(" ");
        for (String word:wordsList) {
            List<String> charsList = Arrays.asList(word.split(""));
            Collections.reverse(charsList);
            String reversed = String.join("", charsList);
            result += reversed + " ";
        }
        return result.substring(0, result.length() - 1);

    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("abc", "cba"));
        System.out.println(areAnagrams(null, "abc"));
        System.out.println(isHexadecimal("A0b9"));
        System.out.println(isHexadecimal("G2b55"));
        System.out.println(isHexadecimalRegex("A0b9"));
        System.out.println(isHexadecimalRegex("G2b55"));
        System.out.println(reverseWordsInSentence("Hello World"));
    }
}
