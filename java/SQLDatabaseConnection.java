import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public void SQLConnect(long BachNum, HashMap<Long, Long> BachPairs) {
        System.out.println("Would you like to save to the database?");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "database=iACADEMY;" + "user=SA;"
                + "password=Xtreme19;" + "encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            PreparedStatement stmt = connection.prepareStatement("insert into GoldbachDataset VALUES (?, ?, ?");
            for (Long keys : BachPairs.keySet()) {
                // fileStream.println(keys + ":" + BachPairs.get(keys));
                stmt.setLong(1, BachNum);
                stmt.setLong(2, keys);
                stmt.setLong(3, BachPairs.get(keys));
                stmt.executeUpdate();
            }
            System.out.println("Saved to database : iACADEMY, table : GoldbachDataset");

        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}