import java.util.*;

public class Voting {
    public static String getVotingResult(int N, int [] Votes) {
        if (Votes == null || Votes.length != N || N == 0) {
            throw new IllegalArgumentException("Invalid input data");
        }

        int totalNumbersOfVotes = Arrays.stream(Votes).sum();
        if (totalNumbersOfVotes == 0) {
            return "no winner";
        }

        double[] candidateVotingResult = calculateVotingResults(N, Votes, totalNumbersOfVotes);
        double resultValueMax = Arrays.stream(candidateVotingResult).max().getAsDouble();
        int winnerIndex = findWinner(candidateVotingResult, resultValueMax);

        if (winnerIndex == -1) {
            return "no winner";
        }

        return getVictoryType(candidateVotingResult, winnerIndex, resultValueMax);
    }

    private static double[] calculateVotingResults(int N, int[] Votes, int totalNumbersOfVotes) {
        double[] candidateVotingResult = new double[N];
        for (int i = 0; i < N; i++) {
            double res = Votes[i] / (double) totalNumbersOfVotes;
            candidateVotingResult[i] = Math.ceil(res * 100000) / 1000;
        }
        return candidateVotingResult;
    }

    private static int findWinner(double[] candidateVotingResult, double max) {
        int count = 0;
        int winnerIndex = -1;
        for (int i = 0; i < candidateVotingResult.length; i++) {
            if (candidateVotingResult[i] == max) {
                count++;
                winnerIndex = i + 1;
            }
        }
        return count > 1 ? -1 : winnerIndex;
    }

    private static String getVictoryType(double[] candidateVotingResult, int winnerIndex, double max) {
        if (max > 50.0) {
            return "majority winner " + winnerIndex;
        }
        return "minority winner " + winnerIndex;
    }
}


