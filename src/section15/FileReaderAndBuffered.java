package section15;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderAndBuffered {
    public static void main(String[] args) {
        String path = "src\\section15\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }

    }
}
