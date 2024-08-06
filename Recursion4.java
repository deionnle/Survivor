import java.io.File;
import java.util.*;

public class Recursion4 {
    public static int secondMax(int[] arr) {
        return maxValue(arr,0,0, 0);
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


    public static List<File> listFiles(String path) {
        File root = new File(path);
        List<File> files = new ArrayList<>();
        return searchFiles(root, files);
    }

    public static List<File> searchFiles(File root, List<File> files) {
        File[] expand = root.listFiles();
        for (File file : expand) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()){
                searchFiles(file,files);
            }
        }
        return files;
    }
}
