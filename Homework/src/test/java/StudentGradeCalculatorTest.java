import org.example.StudentGradeCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentGradeCalculatorTest {

    @Test
    void testTC01() {
        assertEquals("Input không hợp lệ", StudentGradeCalculator.determineGrade(11, 1));
    }

    @Test
    void testTC02() {
        assertEquals("Xuất sắc", StudentGradeCalculator.determineGrade(10, 1));
    }

    @Test
    void testTC03() {
        assertEquals("Giỏi", StudentGradeCalculator.determineGrade(8, 5));
    }

    @Test
    void testTC04() {
        assertEquals("Khá", StudentGradeCalculator.determineGrade(8, 7));
    }

    @Test
    void testTC05() {
        assertEquals("Không đạt", StudentGradeCalculator.determineGrade(10, 8));
    }
}
