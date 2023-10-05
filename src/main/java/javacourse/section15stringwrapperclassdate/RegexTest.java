package javacourse.section15stringwrapperclassdate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
        // Tạo pattern vs Pattern.compile
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        // Lấy về các "nhóm" match với .matcher (return match)
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
        // Mỗi lần .find() sẽ di chuyển con trỏ tới index max tiếp theo
        // Lấy chuỗi substring tg ứng với .start() và .end() (trả về index start và end)
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
            //2-12-2018
            //12/12/2018
        }

        String text2 = "2/12/2018";
        String text3 = "12/12/aaaa";
        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: "
                + pattern.matcher(text2).matches());

        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: "
                + pattern.matcher(text3).matches());
    }
}
