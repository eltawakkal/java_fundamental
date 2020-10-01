package database;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseHelper {
    
    private static String DATABASE_NAME = "dbPenjualan";
    private static String USER = "root";
    private static String PASSWORD = "";
    private static String URL = "jdbc:mysql://localhost/" + DATABASE_NAME + "?serverTimezone=UTC";
  
    private static Connection connection;
    
    public static Connection getConnection() {
        if (connection == null) {
            
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setDatabaseName(DATABASE_NAME);
                dataSource.setUrl(URL);
                dataSource.setUser(USER);
                dataSource.setPassword(PASSWORD);

                connection = dataSource.getConnection();
            } catch (SQLException e) {
                System.out.println("Terjadi Kesalah: " + e.getMessage());
            }
            
        }
        
        return connection;
    }
}
