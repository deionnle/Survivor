import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransformTransformationTest {

    @Test
    public void oneTest() {
        int[] A = new int[] {2};
        assertEquals(true, TransformTransformation.TransformTransform(A, A.length));
    }

    @Test
    public void twoTest() {
        int[] A = new int[] {1,2};
        assertEquals(false, TransformTransformation.TransformTransform(A, A.length));
    }

    @Test
    public void threeTest(){
        int[] A = {1,2,3};
        assertEquals(true,TransformTransformation.TransformTransform(A, A.length));
    }

    @Test
    public void fourTest(){
        int[] A = {2,5,4,2};
        assertEquals(true,TransformTransformation.TransformTransform(A, A.length));
    }
}