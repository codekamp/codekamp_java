package in.codekamp.kfcPOS;

import java.sql.*;

/**
 * Created by cerebro on 29/02/16.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/codekamp.sqlite");


            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM students");

            while (result.next()) {
                String name = result.getString("name");
                int id = result.getInt("id");
                String email = result.getString("email");
                String phoneNumber = result.getString("phone_number");

                System.out.println("name: " + name + ", id: " + id + ", email: " + email);
            }

            //1. create a statement
            Statement statement1 = connection.createStatement();
            Boolean output = statement1.execute("INSERT INTO students (name, email, phone_number) VALUES ('Ghansyam Das', 'ghansyam@das.com', '8811228822')");
            Boolean output = statement1.execute("SELECT * FROM WHERE ");
            System.out.println(output);

        } catch (ClassNotFoundException e) {
            System.out.println("It seems Sqlite JDBC connector is not installed. Please download it from https://bitbucket.org/xerial/sqlite-jdbc");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
