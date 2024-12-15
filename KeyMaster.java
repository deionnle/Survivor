public class KeyMaster {
    public static String Keymaker(int k) {
        final int CLOSED_DOOR = 0;
        final int OPEN_DOOR = 1;

        int[] doors = new int[k];
        for (int i = 0; i < k; i ++) {
            for (int j = i; j < k; j += i + 1) {
                if (doors[j] == CLOSED_DOOR) {
                    doors[j] = OPEN_DOOR;
                } else {
                    doors[j] = CLOSED_DOOR;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i ++) {
            res.append(doors[i]);
        }
        return res.toString();
    }
}


