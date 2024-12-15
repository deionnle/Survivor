public class Recursion1 {
    public static int getExponentiation(int n, int m) {
        if (m == 1) {
            return n;
        } if (m == 0) {
            return 1;
        }
        return n * getExponentiation(n, m - 1);
    }

    public static int getSumOfDigitsOfNumber(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + getSumOfDigitsOfNumber(n / 10);
    }

    public static int sumNumbers2(int n, int sum) {
        if (n < 1) {
            return sum;
        }
        sum += n % 10;
        return sumNumbers2(n / 10, sum);
    }
}