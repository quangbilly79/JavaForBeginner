package javacourse.section25functionalprogramming;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalExerciseMethod {
    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }
    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1, n+1).boxed().map(i -> i*i*i).collect(Collectors.toList());
    }

    // Độ dài các từ trong 1 List
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null) {
            List<Integer> tempList = new ArrayList<>();
            return tempList;
        }
        return courses.stream().map(s -> s.length()).collect(Collectors.toList());
    }

    public static long sumOfSquares(List<Integer> numbers) {
        // Check if the list is null. If so, return 0.
        // Stream over the list of numbers, find squares and sum them up
        if (numbers == null) {
            return 0;
        }
        Long result = numbers.stream()
                .mapToLong(elem -> elem*elem)
                .reduce(Long::sum)
                .orElse(0);
        return result;
    }



    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null) {
            return 0;
        }
        return numbers.stream()
                .filter(elem -> elem % 2 == 0)
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> list1 = null;
        System.out.println(findMaxEvenNumber(list1));
    }
}
