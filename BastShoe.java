import java.util.*;

public class Level1 {
    public static String BastShoe(String command) {
        String[] commArr = command.split(" ", 2);
        class Operation {
            static final ArrayList<String> str = new ArrayList<>();
            static int count = 0;
            static int undo = 1;
            static int value = 0;
            static int id = 0;
        }
        String res;

        if (commArr[0].equals("1") && Operation.count == 0) {
            Operation.str.add(commArr[1]);
            Operation.count ++;
            Operation.value ++;
        } else if (commArr[0].equals("1")) {
            res = Operation.str.get(Operation.count - 1);
            Operation.str.subList(Operation.count,Operation.undo).clear();
            Operation.str.add(res + commArr[1]);
            Operation.value ++;
            Operation.count ++;
            Operation.undo ++;
            Operation.id ++;

        }
        if (commArr[0].equals("2") && Integer.parseInt(commArr[1]) < Operation.str.get(Operation.count - 1).length()) {
            res = Operation.str.get(Operation.count - 1);
            Operation.str.subList(Operation.count,Operation.undo).clear();
            res = res.substring(0, res.length() - Integer.parseInt(commArr[1]));
            Operation.str.add(res);
            Operation.count ++;
            Operation.undo ++;
            Operation.id ++;

        } else if (commArr[0].equals("2") && Integer.parseInt(commArr[1]) >= Operation.str.get(Operation.count - 1).length()) {
            res = "";
            Operation.str.subList(Operation.count,Operation.undo).clear();
            Operation.str.add(res);
            Operation.count ++;
            Operation.undo ++;
            Operation.id ++;

        }
        if (Operation.undo > Operation.str.size()) {
            Operation.undo = Operation.str.size();
        }
        if (Operation.id == 1) {
            Operation.value = 1;
        }

        if (commArr[0].equals("3") && Integer.parseInt(commArr[1]) < Operation.str.get(Operation.count - 1).length()) {
            res = Operation.str.get(Operation.count - 1);
            res = String.valueOf(res.charAt(Integer.parseInt(commArr[1])));
            Operation.str.subList(Operation.count,Operation.undo).clear();
            Operation.str.add(res);
            Operation.count ++;

        } else if (commArr[0].equals("3") && Integer.parseInt(commArr[1]) >= Operation.str.get(Operation.count - 1).length()) {
            res = "";
            Operation.str.subList(Operation.count,Operation.undo).clear();
            Operation.str.add(res);
            Operation.count ++;
        }
        if (commArr[0].equals("4") && Operation.value > 0) {
            Operation.count --;
            Operation.value --;
            Operation.id = 0;
        }
        if (commArr[0].equals("5") && Operation.count < Operation.str.size()) {
            Operation.count ++;
            Operation.value ++;
        }
        res = Operation.str.get(Operation.count - 1);
        return res;
    }
}


