// FileOperations.java
import java.io.*;

public class FileOperations {
    public static void writeFile(String filename, String data) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(data + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
