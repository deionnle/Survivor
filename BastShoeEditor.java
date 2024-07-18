import java.util.*;

public class Level1 {
    public static String BastShoe(String command) {

        if (command.charAt(0) == '1') {
            return Level1.add(command);
        }
        if (command.charAt(0) == '2') {
            return Level1.del(command);
        }
        if (command.charAt(0) == '3') {
            if ((Integer.parseInt(command.substring(2)) > stringBuffer.length() - 1)) {
                return "";
            }
            return Level1.iss(command);
        }
        if (command.equals("4")) {
            if (value.get(count).equals("1") || value.get(count).equals("2")) {
                count--;
                if (count < 0 && strAdd.size() == 1) {
                    count = 0;
                    stringBuffer.delete(0, stringBuffer.length());
                    return "";
                }
                if (count >= 0) {
                    strAdd.add(strAdd.get(count));
                    value.add(command);
                    stringBuffer.delete(0, stringBuffer.length());
                    stringBuffer.append(strAdd.get(count));
                } else count += 2;
            }
            return strAdd.get(count);
        }
        if (command.equals("5")) {
            if (count != strAdd.size() - 1 && !value.get(count + 1).contains("4")) {
                count ++;
            }
            if (value.get(count).equals("4")){
                strAdd.add(strAdd.get(count));
                value.add(command);
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(strAdd.get(count));
            } else {
                strAdd.add(strAdd.get(count));
                value.add(command);
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(strAdd.get(count));
            }
            return strAdd.get(count);
        }
        return command;
    }

    static ArrayList<String> strAdd = new ArrayList<>();
    static ArrayList<String> value = new ArrayList<>();
    static StringBuffer stringBuffer = new StringBuffer();
    static int count = 0;

    public static String add(String command) {
        stringBuffer.append(command.substring(2));
        strAdd.add(String.valueOf(stringBuffer));
        value.add(String.valueOf(command.charAt(0)));
        count = strAdd.size()-1;
        return String.valueOf(stringBuffer);
    }

    public static String del(String command) {
        int val = Integer.parseInt(command.substring(2));
        if (val > stringBuffer.length()) {
            stringBuffer.delete(0, stringBuffer.length());
            count = strAdd.size() - 1;
            return String.valueOf(stringBuffer);
        }
        stringBuffer.delete(stringBuffer.length() - val, stringBuffer.length());
        strAdd.add(String.valueOf(stringBuffer));
        value.add(String.valueOf(command.charAt(0)));
        count = strAdd.size() - 1;
        return String.valueOf(stringBuffer);
    }

    public static String iss(String command) {
        int val = Integer.parseInt(command.substring(2));
        return String.valueOf(stringBuffer.charAt(val));
    }
}


