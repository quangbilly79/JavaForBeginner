package javacourse.section18arrayarraylists;

import java.util.Arrays;

public class ExerciseStudentClass {
    // Khởi tạo class Student nhận tên và ds điểm
    // Qua đó tính số số điểm, tổng, trung bình, max, min từ ds điểm
    public static class Students {
        String name;
        int[] marksList;
        // Constructor
        public Students(String name, int[] marksList) {
            this.name = name;
            this.marksList = marksList;
        }
        // số số điểm
        public int numberOfMarks() {
            return this.marksList.length;
        }
        // tổng
        public int totalSumOfMarks() {
            int sum = 0;
            for (int elem:this.marksList) {
                sum += elem;
            }
            return sum;
        }
        // trung bình
        public double averageMarks() {
            int sum = totalSumOfMarks();
            double average = (float) sum/this.marksList.length;
            return average;
        }
        // max: sort xong lấy tử cuối
        public int getMaxElem() {
            int[] tempMarksList = marksList;
            Arrays.sort(tempMarksList);
            return tempMarksList[tempMarksList.length - 1];
        }
        // min: sort xong lấy tử đầu
        public int getMinElem() {
            int[] tempMarksList = marksList;
            Arrays.sort(tempMarksList);
            return tempMarksList[0];
        }
    }
    // Sử dụng varargs
    public static class StudentsVarargs {
        String name;
        int[] marksList;
        // Constructor, sử dụng varargs
        public StudentsVarargs(String name, int... marksList) {
            this.name = name;
            this.marksList = marksList;
        }
        // Phần dưới giữ nguyên
        // số số điểm
        public int numberOfMarks() {
            return this.marksList.length;
        }
        // tổng
        public int totalSumOfMarks() {
            int sum = 0;
            for (int elem : this.marksList) {
                sum += elem;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Students student1 = new Students("quang", new int[]{9,4,7,4,5});
        System.out.println(student1.numberOfMarks());
        System.out.println(student1.totalSumOfMarks());
        System.out.println(student1.getMaxElem());
        System.out.println(student1.getMinElem());
        System.out.println(student1.averageMarks());

        StudentsVarargs student2 = new StudentsVarargs("quang", 9,4,7,4,5);
        System.out.println(student2.numberOfMarks());
        // Tạo 1 Array các Instance từ 1 Class
        StudentsVarargs[] listStudent = {new StudentsVarargs("a",1,2,3), new StudentsVarargs("b", 3,4,5)};
        
    }
}
