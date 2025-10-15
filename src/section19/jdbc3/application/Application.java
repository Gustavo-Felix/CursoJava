package section19.jdbc3.application;

import section19.jdbc3.db.DB;
import section19.jdbc3.db.DBException;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {

    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("22/04/1975", format);

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            /*
            statement = connection.prepareStatement("INSERT INTO seller " +
                                                    "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                                                    "VALUES" +
                                                    "(?, ?, ?, ?, ?)",
                                                    Statement.RETURN_GENERATED_KEYS
            );

            statement.setString(1, "Gustavo Felix");
            statement.setString(2, "gustavo@gmail.com");
            statement.setDate(3, Date.valueOf(date));
            statement.setDouble(4, 3000.00);
            statement.setInt(5, 4);
             */

            statement = connection.prepareStatement("INSERT INTO department (Name) VALUES ('D1'),('D2')",
                                                    Statement.RETURN_GENERATED_KEYS
            );

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = statement.getGeneratedKeys();

                while (rs.next()) {

                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);

                }

                System.out.println("Done! Rows Affected: " + rowsAffected);
            } else {
                System.out.println("No rows affected");
            }



        } catch (Exception e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }

    }

}
