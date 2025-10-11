package exercicies.section17.Ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Map<String, Integer> candidates = new LinkedHashMap<>();

        System.out.print("Enter file full path: "); // "src/exercicies/section17/Ex03/in.txt"
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String name = line.split(",")[0];
                int votes = Integer.parseInt(line.split(",")[1]);

                if (candidates.containsKey(name)) {
                    int addVotes = candidates.get(name);
                    candidates.put(name, (votes + addVotes));

                } else {
                    candidates.put(name, votes);

                }

                line = br.readLine();
            }

            for (String key : candidates.keySet()) {
                System.out.println(key + ": " + candidates.get(key));
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
