import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Recursion3Test {

    @Test
    public void evenTest() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i ++) {
            list.add(i);
        }
        Recursion3.evenNums(list);
    }

    @Test
    public void evenIndexTest() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i ++) {
            if (i % 2 == 0) {
                list.add("четный индекс");
            } else {
                list.add("не четный индекс");
            }
        }
        Recursion3.evenIndex(list);
    }
}