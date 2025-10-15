package section19.jdbc5.application;

import section19.jdbc5.db.entities.DB;
import section19.jdbc5.db.exceptions.DBException;
import section19.jdbc5.db.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            String sql = "DELETE FROM department " +
                         "WHERE " +
                         "Id = ?";

            statement = connection.prepareStatement(sql);

            statement.setInt(1, 2);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {

                System.out.println("Done! Rows Affected: " + rowsAffected);

            } else {

                System.out.println("No rows affected");

            }

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }

    }

}
