package in.codekamp.kfcPOS;

import java.sql.*;
import java.io.*;

/**
 * Created by cerebro on 29/02/16.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codekamp_java", "rajnikant", "codekamp");


            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM students");

            FileOutputStream writer = null;
            BufferedOutputStream bufferedWriter = null;
            try {
                writer = new FileOutputStream("/Users/cerebro/Desktop/codekamp.csv");
                bufferedWriter = new BufferedOutputStream(writer);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            while (result.next()) {
                String name = result.getString("name");
                int id = result.getInt("id");
                String email = result.getString("email");
                int age = result.getInt("age");

                String output = name + ", " + email + ", " + age + "\n";
                bufferedWriter.write(output.getBytes());
                System.out.println("name: " + name + ", id: " + id + ", email: " + email);
            }
            bufferedWriter.close();

        } catch (ClassNotFoundException e) {
            System.out.println("It seems Sqlite JDBC connector is not installed. Please download it from https://bitbucket.org/xerial/sqlite-jdbc");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
