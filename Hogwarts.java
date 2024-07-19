import java.util.*;

public class Level1 {
    public static String BiggerGreater(String input) {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> strNo = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(input);
        char[] ch = input.toCharArray();
        int count = 0;
        int count2 = 0;
        for (char i : ch) {
            if (i == ch[0]){
                count++;
            }
        }
        if (count == input.length()) {
            return "";
        }
        if (count > 1) {
            for (char i : ch) {
                for (int j = 0; j < ch.length / 2; j ++) {
                    if (i == ch[j]){
                        count2++;
                    }
                }
            }
        }
        int len = fact(ch);
        if (count > 1 && count == count2) {
            len /= count;
        } else if (count2 > 1){
            len /= count2;
        }
        while (str.size() + strNo.size() != len) {
            boolean b = true;
            int[] rand = randomizer(ch);
            int n1 = rand[0];
            int n2 = rand[1];
            StringBuffer val = new StringBuffer();
            char value = ch[n1];
            ch[n1] = ch[n2];
            ch[n2] = value;
            val.append(ch);
            for (String i : str) {
                if (i.equals(val.toString())) {
                    b = false;
                    break;
                }
            }
            for (String i : strNo) {
                if (i.equals(val.toString())) {
                    b = false;
                    break;
                }
            }
            if (val.compareTo(stringBuffer) > 0 && b) {
                str.add(String.valueOf(val));
            } else if (b) {
                strNo.add(String.valueOf(val));
            }
        }
        str.sort(Comparator.naturalOrder());
        return str.getFirst();
    }

    public static int[] randomizer(char[] ch) {
        Random random = new Random();
        int n1 = random.nextInt(ch.length);
        int n2 = random.nextInt(ch.length);
        while (n1 == n2) {
            n2 = random.nextInt(ch.length);
        }
        return new int[]{n1, n2};
    }

    public static int fact(char[] ch) {
        int factorial = 1;
        for (int i = 2; i <= ch.length; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


