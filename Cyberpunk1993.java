public class Cyberpunk1993 {
    public static int[] TRC_sort(int[] trc) {
        return sort(trc, -1, 0, trc.length-1);
    }
    public static int[] sort(int[] trc, int lo, int mid, int hi) {
        if (mid > hi) {
            return trc;
        }
        int val;
        if (trc[mid] == 0) {
            val = trc[mid];
            trc[mid] = trc[lo +1];
            trc[lo +1] = val;
            lo++;
            mid++;
        } else if (trc[mid] == 1) {
            mid++;
        } else if (trc[mid] == 2) {
            val = trc[mid];
            trc[mid] = trc[hi];
            trc[hi] = val;
            hi--;
        }
        return sort(trc, lo, mid, hi);
    }
}
