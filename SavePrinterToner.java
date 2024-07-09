import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        HashMap<Character, Integer> symbolASCII = new HashMap<>();
        symbolASCII.put(' ', 0); symbolASCII.put('&', 24); symbolASCII.put(',', 7);
        symbolASCII.put('2', 22); symbolASCII.put('8', 23); symbolASCII.put('>', 10);
        symbolASCII.put('D', 26); symbolASCII.put('J', 18); symbolASCII.put('P', 23);
        symbolASCII.put('V', 19); symbolASCII.put('\\', 10); symbolASCII.put('b', 25);
        symbolASCII.put('h', 21); symbolASCII.put('n', 18); symbolASCII.put('t', 17);
        symbolASCII.put('z', 19); symbolASCII.put('!', 9); symbolASCII.put('\'', 3);
        symbolASCII.put('-', 7); symbolASCII.put('3', 23); symbolASCII.put('9', 26);
        symbolASCII.put('?', 15); symbolASCII.put('E', 26); symbolASCII.put('K', 21);
        symbolASCII.put('Q', 31); symbolASCII.put('W', 26); symbolASCII.put(']', 18);
        symbolASCII.put('c', 17); symbolASCII.put('i', 15); symbolASCII.put('o', 20);
        symbolASCII.put('u', 17); symbolASCII.put('{', 18); symbolASCII.put('"', 6);
        symbolASCII.put('(', 12); symbolASCII.put('.', 4); symbolASCII.put('4', 21);
        symbolASCII.put(':', 8); symbolASCII.put('@', 32); symbolASCII.put('F', 20);
        symbolASCII.put('L', 16); symbolASCII.put('R', 28); symbolASCII.put('X', 18);
        symbolASCII.put('^', 7); symbolASCII.put('d', 25); symbolASCII.put('j', 20);
        symbolASCII.put('p', 25); symbolASCII.put('v', 13); symbolASCII.put('|', 12);
        symbolASCII.put('#', 24); symbolASCII.put(')', 12); symbolASCII.put('/', 10);
        symbolASCII.put('5', 27); symbolASCII.put(';', 11); symbolASCII.put('A', 24);
        symbolASCII.put('G', 25); symbolASCII.put('M', 28); symbolASCII.put('S', 25);
        symbolASCII.put('Y', 14); symbolASCII.put('_', 8); symbolASCII.put('e', 23);
        symbolASCII.put('k', 21); symbolASCII.put('q', 25); symbolASCII.put('w', 19);
        symbolASCII.put('}', 18); symbolASCII.put('$', 29); symbolASCII.put('*', 17);
        symbolASCII.put('0', 22); symbolASCII.put('6', 26); symbolASCII.put('<', 10);
        symbolASCII.put('B', 29); symbolASCII.put('H', 25); symbolASCII.put('N', 25);
        symbolASCII.put('T', 16); symbolASCII.put('Z', 22); symbolASCII.put('`', 3);
        symbolASCII.put('f', 18); symbolASCII.put('l', 16); symbolASCII.put('r', 13);
        symbolASCII.put('x', 13); symbolASCII.put('~', 9); symbolASCII.put('%', 22);
        symbolASCII.put('+', 13); symbolASCII.put('1', 19); symbolASCII.put('7', 16);
        symbolASCII.put('=', 14); symbolASCII.put('C', 20); symbolASCII.put('I', 18);
        symbolASCII.put('O', 26); symbolASCII.put('U', 23); symbolASCII.put('[', 18);
        symbolASCII.put('a', 23); symbolASCII.put('g', 30); symbolASCII.put('m', 22);
        symbolASCII.put('s', 21); symbolASCII.put('y', 24);

        int res = 0;
        for (int i = 0; i < Line.length(); i ++) {
            if (!symbolASCII.containsKey(Line.charAt(i))) {
                res += 23;
                continue;
            }
            for (Character ch: symbolASCII.keySet()) {
                if (ch == Line.charAt(i)) {
                    res += symbolASCII.get(ch);
                    break;
                }
            }
        }
        return res;
    }
}


