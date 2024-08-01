public class Recursion1 {
    public static int exp(int n, int m) {
        if (m == 1) {
            return n;
        } if (m == 0) {
            return 1;
        }
        return n * exp(n, m - 1);
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        if (n > 0) {
            sum = n % 10;
            sum += sumNumbers(n / 10);
        }
        return sum;
    }
}