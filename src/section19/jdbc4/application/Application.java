package section19.jdbc4.application;


import section19.jdbc4.db.DB;
import section19.jdbc4.db.DBException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Application {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            String sql = "UPDATE seller " +
                         "SET BaseSalary = BaseSalary + ?" +
                         "WHERE" +
                         "(DepartmentId = ?)";

            statement = connection.prepareStatement(sql);

            statement.setDouble(1, 200.00);
            statement.setInt(2, 2);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {

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
