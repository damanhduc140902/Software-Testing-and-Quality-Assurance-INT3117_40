import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAssessmentCsvTest {
    /*
    Ham test cho phuong phap kiem thu gia tri bien
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data1.csv", numLinesToSkip = 1)
    void test1 (float a, float b, String result) {
        StudentAssessment assessment = new StudentAssessment();
        assertEquals(assessment.undervest(a,b),result);
    }

    /*
    Ham test cho phuong phap phan lop tuong duong
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv", numLinesToSkip = 1)
    void test2 (float a, float b, String result) {
        StudentAssessment assessment = new StudentAssessment();
        assertEquals(assessment.undervest(a,b),result);
    }
}
