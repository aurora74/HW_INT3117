import org.example.StudentGradeCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DFT {

    @Test
    void testTC01() {
        assertEquals("Input không hợp lệ", StudentGradeCalculator.determineGrade(-1, 5));
    }

    @Test
    void testTC02() {
        assertEquals("Xuất sắc", StudentGradeCalculator.determineGrade(9, 1));
    }

    @Test
    void testTC03() {
        assertEquals("Giỏi", StudentGradeCalculator.determineGrade(7, 3));
    }

    @Test
    void testTC04() {
        assertEquals("Khá", StudentGradeCalculator.determineGrade(6, 6));
    }

    @Test
    void testTC05() {
        assertEquals("Không đạt", StudentGradeCalculator.determineGrade(4, 8));
    }
}
