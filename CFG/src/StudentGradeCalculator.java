public class StudentGradeCalculator {
    public static String determineGrade(int averageScore, int absences) {
        if (averageScore < 0 || averageScore > 10) {
            throw new IllegalArgumentException("Điểm trung bình phải nằm trong khoảng từ 0 đến 10");
        }

        if (absences < 0) {
            throw new IllegalArgumentException("Số buổi nghỉ không thể âm");
        }

        if (averageScore >= 8 && absences <= 2) {
            return "Xuất sắc";
        } else if (averageScore >= 7 && absences <= 5) {
            return "Giỏi";
        } else if (averageScore >= 5 && absences <= 7) {
            return "Khá";
        } else {
            return "Không đạt";
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Học lực: " + determineGrade(-9, 1));  // Xuất sắc
            System.out.println("Học lực: " + determineGrade(7, 3));  // Giỏi
            System.out.println("Học lực: " + determineGrade(5, 6));  // Khá
            System.out.println("Học lực: " + determineGrade(4, 8));  // Không đạt
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}