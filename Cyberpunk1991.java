public class Cyberpunk1991 {
    public static int artificial_muscle_fibers(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Входной массив не может быть пустым");
        }
        byte[] buffer = new byte[8192];
        int count = 0;
        for (int i : arr) {
            int idx = i / 8;
            int mask = i % 8;
            if ((Byte.toUnsignedInt(buffer[idx]) & (1 << mask)) != 0) {
                if ((Byte.toUnsignedInt(buffer[idx + 4096]) & (1 << mask)) == 0) {
                    buffer[idx + 4096] |= (byte) (1 << mask);
                    count++;
                }
            } else {
                buffer[idx] |= (byte) (1 << mask);
            }
        }
        return count;
    }
}
