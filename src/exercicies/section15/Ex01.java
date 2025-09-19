package exercicies.section15;

import exercicies.section15.entities.Product;

import java.io.*;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Product> list = new ArrayList<>();

        System.out.println("Enter a folder path: ");
        String strPath = sc.next();
        File sourceFile = new File(strPath);
        String sourceParent = sourceFile.getParent(); // Pegar a pasta onde está o arquivo

        boolean success = new File(sourceParent + "\\out").mkdir();

        File pathOut = new File(sourceParent + "\\out\\summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(pathOut + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}