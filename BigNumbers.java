import java.util.*;

public class Level1 {
    public static String BigMinus(String s1, String s2) {
        String res = "";
        if (s1.equals(s2)) {
            return res = "0";
        }
        char[] ch1;
        char[] ch2;
        boolean b = false;
        if (s1.length() == s2.length()) {
            b = equalsStr(s1, s2);
        }
        if (s1.length() > s2.length() || b) {
            ch1 = s1.toCharArray();
            ch2 = s2.toCharArray();
        } else {
            ch1 = s2.toCharArray();
            ch2 = s1.toCharArray();
        }

        int[] nums1 = new int[ch1.length];
        for (int i = 0; i < ch1.length; i ++) {
            nums1[i] = Character.getNumericValue(ch1[i]);
        }
        int[] nums2 = new int[ch2.length];
        for (int i = 0; i < ch2.length; i ++) {
            nums2[i] = Character.getNumericValue(ch2[i]);
        }
        int len = nums1.length - nums2.length;
        for (int i = nums2.length-1; i >= 0; i --) {
            if (nums1[i + len] >= nums2[i]) {
                nums1[i + len] = nums1[i + len] - nums2[i];
            }
            else if (nums1[i + len] < nums2[i]) {
                nums1[i + len] = nums1[i + len] + 10;
                nums1[i + len -1] = nums1[i + len - 1] - 1;
                nums1[i + len] = nums1[i + len] - nums2[i];
            }
        }
        for (int i = nums1.length - 1; i > 0; i --) {
            if (nums1[i] < 0) {
                nums1[i] += 10;
                nums1[i - 1] -= 1;
            }
        }
        for (int value : nums1) {
            res = String.format("%s%s", res, value);
        }
        while (res.charAt(0) == '0') {
            res = res.substring(1);
        }
        return res ;
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


