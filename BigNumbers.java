public class BigNumbers {
    public static String BigMinus(String s1, String s2) {
        String absoluteDifference = "";
        if (s1.equals(s2)) {
            return absoluteDifference = "0";
        }
        char[] digitsOfFirstNumber;
        char[] digitsOfSecondNumber;
        boolean isStringsAreEqual = false;
        if (s1.length() == s2.length()) {
            isStringsAreEqual = equalsStr(s1, s2);
        }
        if (s1.length() > s2.length() || isStringsAreEqual) {
            digitsOfFirstNumber = s1.toCharArray();
            digitsOfSecondNumber = s2.toCharArray();
        } else {
            digitsOfFirstNumber = s2.toCharArray();
            digitsOfSecondNumber = s1.toCharArray();
        }

        int[] GreatestNumber = new int[digitsOfFirstNumber.length];
        for (int i = 0; i < digitsOfFirstNumber.length; i ++) {
            GreatestNumber[i] = Character.getNumericValue(digitsOfFirstNumber[i]);
        }
        int[] SmallerNumber = new int[digitsOfSecondNumber.length];
        for (int i = 0; i < digitsOfSecondNumber.length; i ++) {
            SmallerNumber[i] = Character.getNumericValue(digitsOfSecondNumber[i]);
        }
        int len = GreatestNumber.length - SmallerNumber.length;
        for (int i = SmallerNumber.length-1; i >= 0; i --) {
            if (GreatestNumber[i + len] >= SmallerNumber[i]) {
                GreatestNumber[i + len] = GreatestNumber[i + len] - SmallerNumber[i];
            }
            else if (GreatestNumber[i + len] < SmallerNumber[i]) {
                GreatestNumber[i + len] = GreatestNumber[i + len] + 10;
                GreatestNumber[i + len -1] = GreatestNumber[i + len - 1] - 1;
                GreatestNumber[i + len] = GreatestNumber[i + len] - SmallerNumber[i];
            }
        }
        for (int i = GreatestNumber.length - 1; i > 0; i --) {
            if (GreatestNumber[i] < 0) {
                GreatestNumber[i] += 10;
                GreatestNumber[i - 1] -= 1;
            }
        }
        for (int value : GreatestNumber) {
            absoluteDifference = String.format("%s%s", absoluteDifference, value);
        }
        while (absoluteDifference.charAt(0) == '0') {
            absoluteDifference = absoluteDifference.substring(1);
        }
        return absoluteDifference;
    }
    public static boolean equalsStr(String s1, String s2) {
        for (int i = 0; i < s1.length(); i ++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            if (s1.charAt(i) > s2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}


