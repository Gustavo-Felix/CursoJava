package section15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("src/section15/in.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.print(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
