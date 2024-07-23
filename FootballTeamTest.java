import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootballTeamTest {

    @Test
    public void referenceTest() {
        assertEquals(true, FootballTeam.Football(new int[] {1,3,2}, 3));
        assertEquals(true, FootballTeam.Football(new int[] {3,2,1}, 3));
        assertEquals(true, FootballTeam.Football(new int[] {1,4,3,2,5}, 5));
        assertEquals(false, FootballTeam.Football(new int[] {9,5,3,7,1}, 5));
        assertEquals(true, FootballTeam.Football(new int[] {1,7,5,3,9}, 5));
        assertEquals(true, FootballTeam.Football(new int[] {1,2,3,9,8,7,6,5}, 8));
        assertEquals(true, FootballTeam.Football(new int[] {6,5,4,3,2,1}, 6));
        assertEquals(false, FootballTeam.Football(new int[] {5}, 1));
        assertEquals(true, FootballTeam.Football(new int[] {2,1}, 2));
        assertEquals(false, FootballTeam.Football(new int[] {1,3,5,9,2,4,6,7}, 8));
    }
}