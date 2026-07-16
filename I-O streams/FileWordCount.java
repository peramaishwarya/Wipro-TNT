import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }
        TreeMap<String, Integer> map = new TreeMap<>();
        try {
            Scanner sc = new Scanner(new File(args[0]));
            while (sc.hasNext()) {
                String word = sc.next();
                word = word.replaceAll("[^a-zA-Z0-9]", "");
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            sc.close();
            FileWriter fw = new FileWriter(args[1]);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                fw.write(entry.getKey() + " : " + entry.getValue() + System.lineSeparator());
            }
            fw.close();
            System.out.println("Word count written to " + args[1]);
        } catch (Exception e) {
            System.out.println("Error processing files.");
        }
    }
}