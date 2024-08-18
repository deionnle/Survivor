import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk1995Test {

    @Test
    public void referenceTest() {
        int [][] matrix = new int[][] {{1,9,2,3},{4,8,5,6},{0,7,1,2},{0,0,0,0}};
        assertEquals("1 0 3",Cyberpunk1995.army_communication_matrix(4, matrix));
    }

    @Test
    public void reference2Test() {
        int [][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        assertEquals("1 1 2",Cyberpunk1995.army_communication_matrix(3, matrix));
    }

    @Test
    public void myTest() {
        int [][] matrix = new int[][] {{0,0,0,0,0},{0,0,0,1,1},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0},};
        assertEquals("3 1 2",Cyberpunk1995.army_communication_matrix(5, matrix));
    }

    @Test
    public void negativeTest() {
        int [][] matrix = new int[][] {{-1,-2,3},{-4,-5,-6},{-7,-8,-9}};
        String s = "1 0 2";
        assertEquals(s,Cyberpunk1995.army_communication_matrix(3,matrix));
    }

    @Test
    public void twoTest() {
        int [][] matrix = new int[][] {{1,2},{3,4}};
        String s = "0 0 2";
        assertEquals(s,Cyberpunk1995.army_communication_matrix(2,matrix));
    }
}