package javacourse.section18arrayarraylists;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Exercise {
    public static String findLongestDay(String[] dayOfWeek) {
        int maxLength = 0;
        String maxWord = "";
        for (String day:dayOfWeek) {
            int length = day.length();
            if (length >= maxLength) {
                maxLength = length;
                maxWord = day;
            }
        }
        return maxWord;
    }

    // Tìm elem lớn thứ 2 trong 1 Array
    // Ý tưởng là sort, lấy ptử lớn nhất, xong iterate để lấy ptử lớn thứ 2, xong break luôn
    public int findSecondLargestElement(int[] array) {
        if (array.length <= 2) {
            return -1;
        }

        Arrays.sort(array);
        int largest = array[array.length-1];
        int secondLargest = -1;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < largest) {
                secondLargest = array[i];
                break;
            }
        }
        return secondLargest;
    }

    // Check xem 1 array có đang sort asc hay k
    // Kiểm tra xem ptử trc có < hơn ptử sau k, có thì false luôn
    // Hoặc dùng Arrays.sort cho nhanh cx đc
    public boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    // Đảo ngc 1 array
    // Ý tưởng là tạo 1 array trống vs length = array gốc
    // Iterate array gốc theo index, gán giá trị tg ứng vào vị trí [length-i-1] của array đích
    public int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[length-i-1] = array[i];
        }
        return reverseArray;
    }

    // Lấy ds các thừa số của 1 số
    // Ý tưởng là iterate từ 1 đến n, số nào chia hết thì thêm vào array list thôi
    public List<Integer> determineAllFactors(int number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (number <= 0) {
            return arrayList;
        }
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                arrayList.add(i);
            }
        }
        arrayList.add(number);
        return arrayList;
    }

    // Lấy các bội của 1 số mà nhỏ hơn limit
    // Ý tưởng là lấy number*i, tăng dần i cho đến khi chạm đến limit
    public List<Integer> determineMultiples(int number, int limit) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; number*i < limit; i++) {
            arrayList.add(i*number);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(findLongestDay(dayOfWeek));
        for (int i = dayOfWeek.length - 1; i>=0; i--) {
            System.out.printf("%s ", dayOfWeek[i]);
        }

        System.out.println(dayOfWeek.toString());

    }
}
