import java.io.File;
import java.util.*;

public class Recursion4 {
    public static int secondMax(int[] arr) {
        int max = 0;
        int premax = 0;
        if (arr[0] > arr[1]) {
            max = arr[0];
            premax = arr[1];
        } else {
            premax = arr[0];
            max = arr[1];
        }
        return maxValue(arr,max,premax, 2);
    }

    public static int maxValue(int[] arr, int max, int preMax, int index) {
        if (index == arr.length) return preMax;
        if (arr[index] > max) {
            preMax = max;
            max = arr[index];
        } else if (arr[index] > preMax) {
            preMax = arr[index];
        }
        return maxValue(arr,max,preMax,index + 1);
    }

public static List<File> listFiles(File root, List<File> files) {
    File[] expand = root.listFiles();
    for (File file : expand) {
        if (file.isFile()) {
            files.add(file);
        } else if (file.isDirectory()){
            listFiles(file,files);
        }
    }
    return files;
    }
}
