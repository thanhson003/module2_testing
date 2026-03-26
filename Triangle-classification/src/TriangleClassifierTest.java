import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giac deu";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giac can";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangle4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.triangle(a,b,c);
        assertEquals(expected, result);
    }
}