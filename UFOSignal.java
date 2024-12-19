public class UFOSignal {
    public static int [] UFO(int N, int [] data, boolean octal) {
        final int OCTAL_SYSTEM = 8;
        final int HEXADECIMAL_SYSTEM = 16;
        int currentSystem;
        if (octal == true) {
            currentSystem = OCTAL_SYSTEM;
        } else {
            currentSystem = HEXADECIMAL_SYSTEM;
        }
        int[] value = new int[N];
        for (int i = 0; i < N; i ++) {
            int len = String.valueOf(data[i]).length();
            for (int j = 0; j < len; j ++) {
                value[i] += (data[i] % 10) * Math.pow(currentSystem, j);
                data[i] /= 10;
            }
        }
        return value;
    }
}


