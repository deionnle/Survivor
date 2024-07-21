import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurnMatrixTest {

    @Test
    public void referenceTest() {
        String[] matrix = {"123456", "234567", "345678", "456789"};
        String[] matrixRes = {"212345", "343456", "456767", "567898"};
        TurnMatrix.MatrixTurn(matrix, 4, 6, 1);
        assertArrayEquals(matrixRes,matrix);
    }
    @Test
    public void fourTest() {
        String[] matrix = {"1234", "2345", "3456", "4567"};
        String[] matrixRes = {"5432", "6341", "7452", "6543"};
        TurnMatrix.MatrixTurn(matrix,4,4,4);
        assertArrayEquals(matrixRes,matrix);
    }
}