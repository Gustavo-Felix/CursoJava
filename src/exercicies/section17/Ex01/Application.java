package exercicies.section17.Ex01;

import exercicies.section17.Ex01.model.entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Set<User> users = new HashSet<>();

        System.out.print("Enter file full path: "); // "src/exercicies/section17/Ex01/in.txt"
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String username = line.split(" ")[0];
                Instant lastAccess = Instant.parse(line.split(" ")[1]);

                User user = new User(username, lastAccess);

                users.add(user);
                line = br.readLine();
            }

            System.out.println("Total users: " + users.size());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
