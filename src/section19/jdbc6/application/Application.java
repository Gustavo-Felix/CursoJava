package section19.jdbc6.application;

import section19.jdbc6.db.exceptions.DBException;
import section19.jdbc6.db.entities.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {

            connection = DB.getConnection();

            connection.setAutoCommit(false);

            statement = connection.createStatement();

            String sql1 = "UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1";
            String sql2 = "UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2";

            int rows1 = statement.executeUpdate(sql1);

            /*
            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake Error");
            }
            */

            int rows2 = statement.executeUpdate(sql2);

            connection.commit();

            System.out.println("Rows 1 (DepartmentId = 1) - " + rows1);
            System.out.println("Rows 2 (DepartmentId = 2) - " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DBException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DBException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }

    }

}
