public class TrafficOptimization {
    public static int getTotalTime(int L, int N, int[][] track) {
        int timeAfterStart = 0;
        int dist = 0;
        for (int i = 1; i <= L; i ++) {
            dist++;
            if (timeAfterStart < N && i == track[timeAfterStart][0]) {
                dist += getDistance(timeAfterStart, dist, track);
                timeAfterStart++;
            }
        }
        return dist;
    }
    public static int getDistance(int index, int dist, int[][] track) {
        int redTrafficLightTime = track[index][1];
        int greenTrafficLightTime = track[index][2];
        while (dist > 0) {
            if (dist - redTrafficLightTime <= 0) {
                dist = redTrafficLightTime - dist;
                break;
            }
            if (dist - redTrafficLightTime > 0) {
                dist -= redTrafficLightTime;
            }
            if (dist < greenTrafficLightTime) {
                dist = 0;
                break;
            }
            if (dist - greenTrafficLightTime > 0) {
                dist -= greenTrafficLightTime;
            }
        }
        return dist;
    }
}


