package section19.jdbc.application;

import section19.jdbc.db.DB;

import java.sql.Connection;

public class Application {

    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        if (connection != null){
            System.out.println("Application successfully connected to the database.");
        }
        DB.closeConnection();

    }

}
