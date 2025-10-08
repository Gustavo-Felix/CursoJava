package exercicies.section17.Ex02;

import exercicies.section17.Ex02.entities.User;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Set<User> usersSet = new HashSet<>();

        List<Character> courses = Arrays.asList('A', 'B', 'C');

        try {

            for (Character course : courses) {
                System.out.printf("How many students for course %c? ", course);
                int students = sc.nextInt();
                for (int j = 0; j < students; j++) {
                    int userid = sc.nextInt();
                    usersSet.add(new User(userid));
                }
            }

            System.out.println("Total Students: " + usersSet.size());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();
    }
}
