import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cyberpunk1994Test {

    @Test
    public void referenceTest() {
        int [][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        assertArrayEquals(new int[] {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10},Cyberpunk1994.matrix(4,4,matrix));
    }

    @Test
    public void fiveTest() {
        int [][] matrix = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        assertArrayEquals(new int[] {1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13},Cyberpunk1994.matrix(5,5,matrix));
    }

    @Test
    public void columTest() {
        int [][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        assertArrayEquals(new int[] {1,2,3,6,9,12,15,14,13,10,7,4,5,8,11},Cyberpunk1994.matrix(3,5,matrix));
    }

    @Test
    public void rowTest() {
        int [][] matrix = new int[][] {{1,2,3,4,5,6,7,8,9},{18,17,16,15,14,13,12,11,10}};
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},Cyberpunk1994.matrix(9,2,matrix));
    }

    @Test
    public void spiralTest() {
        int [][] matrix = new int[][] {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9},Cyberpunk1994.matrix(3,3,matrix));
    }
}