import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class sql {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "database=iACADEMY;" + "user=SA;"
                + "password=Xtreme19;" + "encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
        }

        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Connect to your database.
    // Replace server name, username, and password with your credentials

}