import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VotingTest {

    @Test
    public void referenceTest() {
        int N = 5;
        int[] Votes = new int[] {60,10,10,15,5};
        assertEquals("majority winner 1", Voting.MassVote(N,Votes));
    }

    @Test
    public void reference2Test() {
        int N = 3;
        int[] Votes = new int[] {10,15,10};
        assertEquals("minority winner 2", Voting.MassVote(N,Votes));
    }

    @Test
    public void reference3Test() {
        int N = 4;
        int[] Votes = new int[] {111,111,110,110};
        assertEquals("no winner", Voting.MassVote(N,Votes));
    }

    @Test
    public void zeroTest () {
        int N = 3;
        int[] votes = {0,0,100};
        assertEquals("majority winner 3",Voting.MassVote(N,votes));
    }

    @Test
    public void minorityTest () {
        int N = 12;
        int[] votes = {20,60,15,80,35,90,24,100,52,36,99,88};
        assertEquals("minority winner 8",Voting.MassVote(N,votes));
    }

    @Test
    public void majorityTest () {
        int N = 4;
        int[] votes = {1,1,96,1};
        assertEquals("majority winner 3",Voting.MassVote(N,votes));
    }

    @Test
    public void oneTest () {
        int N = 1;
        int[] votes = {20};
        assertEquals("majority winner 1",Voting.MassVote(N,votes));
    }

    @Test
    public void bigTest () {
        int N = 10;
        int[] votes = {20, 30, 40, 50, 65, 80, 25, 70, 19, 80, 50};
        assertEquals("no winner",Voting.MassVote(N,votes));
    }

    @Test
    public void threeTest () {
        int N = 3;
        int[] votes = {500, 1, 510};
        assertEquals("majority winner 3",Voting.MassVote(N,votes));
    }

    @Test
    public void three2Test () {
        int N = 3;
        int[] votes = {500, 501, 1};
        assertEquals("minority winner 2",Voting.MassVote(N,votes));
    }
}