public class Squirrel {
    public static int getFirstDigitOfFactorial(int N) {
        int factorial = calculateFactorial(N);
        return extractFirstDigit(factorial);
    }

    private static int calculateFactorial(int N) {
        int factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int extractFirstDigit(int number) {
        while (number > 10) {
            number /= 10;
        }
        return number;
    }
}


