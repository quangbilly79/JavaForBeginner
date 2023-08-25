package javacourse.section15stringwrapperclassdate;

public class StringMethod {
    public static int countUppercaseLetters(String str) {
        int count = 0;
        // Count den' str length -1 vi` la` 0 indẽ
        for (int i = 0; i <= str.length() - 1; i++) {
            // neu' sau khi lower case mà khác (! equals) thì ms +1 (xử lý TH dấu cách, dù l or u thì vẫn k thay đổi)
            // dùng charAt để lấy kí tự ở vị trí i, vì char k có method l or u nên phải cv sang String với String.valueOf
            // dùng method equals thay vì == để ss String
            if (!String.valueOf(str.charAt(i)).toLowerCase().equals(String.valueOf(str.charAt(i)))){
                count += 1;
            }
        }
        return count;

    }
    public static boolean hasConsecutiveDuplicates(String str) {
        // Ý tưởng là chỉ check đến kí tự gần cuối, nếu nó = kí tự cuối thì ok luôn
        // Còn vs các kí tự trc đó phải check kí tự tiếp theo và tiếp theo nữa
        for (int i = 0; i <= str.length() - 2; i++) {
            Character char0 = str.charAt(i);
            Character char1 = str.charAt(i+1);
            if (i < (str.length() - 2)) {
                Character char2 = str.charAt(i+2);
                if (char0.equals(char1) && char1.equals(char2)) {
                    return false;
                } else if (char0.equals(char1)) {
                    return true;
                }
            } else {
                if (char0.equals(char1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getRightmostDigit(String str) {
        // Ý tưởng là quét từ phải sang trái, dùng 2 hàm isDigit để check cx như getNumericValue để trả về
        for (int i = str.length() - 1; i >= 0; i--) {
            Character char0 = str.charAt(i);
            if (Character.isDigit(char0)) {
                return Character.getNumericValue(char0);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(hasConsecutiveDuplicates("abcDD"));
    }
}
