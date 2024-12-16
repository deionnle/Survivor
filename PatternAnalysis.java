public class PatternAnalysis {

    private static final Character STAR = '*';
    private static final Character DOT = '.';

    public static boolean LineAnalysis(String line) {

        if (line == null || line.isEmpty()) {
            return false;
        }

        if (line.charAt(0) != STAR && line.charAt(line.length()-1) != STAR) {
            return false;
        }
        if (!line.contains(String.valueOf(DOT))) {
            return true;
        }
        int dotLenght = 0;
        for (int i = 1; i < line.length(); i ++) {
            if (line.charAt(i) == STAR) {
                break;
            }
                dotLenght++;
        }

        String l = line;
        for (int i = 0; i < line.length() / (dotLenght + 1); i ++) {
            for (int j = 1; j <= dotLenght; j ++) {
                if (l.charAt(j) != DOT) {
                    return false;
                }
            }
            if (l.charAt(dotLenght + 1) != STAR) {
                return false;
            }
            l = l.substring(dotLenght + 1);
        }
        return true ;
    }
}


