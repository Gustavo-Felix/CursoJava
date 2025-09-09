package section14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        File file = new File("YOUR_PATH");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}
