import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Recursion4Test {

    @Test
    public void secondMaxValueTest() {
        assertEquals(5, Recursion4.secondMax(new int[] {2,5,4,3,6}));
        assertEquals(5, Recursion4.secondMax(new int[] {2,5,4,3,5}));
        assertEquals(6, Recursion4.secondMax(new int[] {9,5,4,3,6}));
        assertEquals(1, Recursion4.secondMax(new int[] {1,0,1,0,2,0,1,0}));
    }

    @Test
    public void getListTest() {
        String path = "E:\\exercises";
        List<File> expected = scanDir(path);
        List<File> actual = Recursion4.listFiles(path);
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected,actual);
    }

    public static List<File> scanDir(String path) {
        List<File> res = new ArrayList<>();
        List<File> expand = new ArrayList<>();
        File root = new File(path);
        expand.addAll(Arrays.asList(root.listFiles()));
        for(int depth = 0; depth < 3; depth++) {
            File[] expandCopy = expand.toArray(new File[expand.size()]);
            expand.clear();
            for (File file : expandCopy) {
                if (file.isDirectory()) {
                    expand.addAll(Arrays.asList(file.listFiles()));
                } else if (file.isFile()){
                    res.add(file);
                }
            }
        }
        return res;
    }
}