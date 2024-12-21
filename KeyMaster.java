public class KeyMaster {

    private static final int CLOSED_DOOR = 0;
    private static final int OPEN_DOOR = 1;

    public static String Keymaker(int k) {

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
        for (int door : doors) {
            res.append(door);
        }
        return res.toString();
    }
}


