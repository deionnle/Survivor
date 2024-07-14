import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternAnalysisTest {

    @Test
    public void regerenceTest() {
        String line = "*..*..*..*..*..*..*";
        String line2 = "*";
        String line3 = "***";
        String line4 = "*.......*.......*";
        String line5 = "**";
        String line6 = "*.*";
        assertEquals(true,PatternAnalysis.LineAnalysis(line));
        assertEquals(true,PatternAnalysis.LineAnalysis(line2));
        assertEquals(true,PatternAnalysis.LineAnalysis(line3));
        assertEquals(true,PatternAnalysis.LineAnalysis(line4));
        assertEquals(true,PatternAnalysis.LineAnalysis(line5));
        assertEquals(true,PatternAnalysis.LineAnalysis(line6));
    }
    @Test
    public void regerencefalseTest() {
        String line = "*..*...*..*..*..*..*";
        String line2 = "*..*..*..*..**..*..*";
        assertEquals(false,PatternAnalysis.LineAnalysis(line));
        assertEquals(false,PatternAnalysis.LineAnalysis(line2));
    }
    @Test
    public void myTest() {
        String line = "*...*....*";
        assertEquals(false,PatternAnalysis.LineAnalysis(line));
    }
    @Test
    public void pointTest() {
        String line = "*....*...*";
        assertEquals(false,PatternAnalysis.LineAnalysis(line));
    }
    @Test
    public void starTest() {
        String line = "*...**...*";
        assertEquals(false,PatternAnalysis.LineAnalysis(line));
    }
}