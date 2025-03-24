package org.example;

public class StudentGradeCalculator {
    public static String determineGrade(int averageScore, int absences) {
        String result = "";
        if (averageScore < 0 || averageScore > 10 || absences < 0) {
            return "Input không hợp lệ";
        }
        if (averageScore >= 8 && absences <= 2) {
            result = "Xuất sắc";
        } else if (averageScore >= 7 && absences <= 5) {
            result = "Giỏi";
        } else if (averageScore >= 5 && absences <= 7) {
            result = "Khá";
        } else {
            result = "Không đạt";
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Học lực: " + determineGrade(11, 1));
            System.out.println("Học lực: " + determineGrade(10, 1));
            System.out.println("Học lực: " + determineGrade(8, 5));
            System.out.println("Học lực: " + determineGrade(8, 7));
            System.out.println("Học lực: " + determineGrade(10, 8));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}