public class UFOSignal {
    public static int [] UFO(int N, int [] data, boolean octal) {

        int currentSystem = getCurrentSystem(octal);
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            value[i] = convertToDecimal(data[i], currentSystem);
        }
        return value;
    }
        private static int getCurrentSystem(boolean octal) {
            final int OCTAL_SYSTEM = 8;
            final int HEXADECIMAL_SYSTEM = 16;
            return octal ? OCTAL_SYSTEM : HEXADECIMAL_SYSTEM;
        }

    private static int convertToDecimal(int number, int currentSystem) {
        int result = 0;
        int len = String.valueOf(number).length();
        for (int j = 0; j < len; j++) {
            result += (number % 10) * Math.pow(currentSystem, j);
            number /= 10;
        }
        return result;
    }
}


