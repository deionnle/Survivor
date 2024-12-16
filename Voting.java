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

        double[] candidateVotingResult = new double[N];
        for (int i = 0; i < candidateVotingResult.length; i ++) {
            double res = Votes[i] / (double) totalNumbersOfVotes;
            candidateVotingResult[i] = Math.ceil(res * 100000) / 1000;
        }
        double max = Arrays.stream(candidateVotingResult).max().getAsDouble();
        int n = 0;
        int K = 0;
        for (int i = 0; i < candidateVotingResult.length; i ++) {
            if (candidateVotingResult[i] == max) {
                n ++;
                K = i + 1;
            }
        }
        if (n > 1) {
            return "no winner";
        }
        if (max > 50.0) {
            return ("majority winner " + K);
        }
        return ("minority winner " + K);
    }
}


