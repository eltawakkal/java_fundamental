/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hayaqo
 */
public class SlpDataHelper {
    
    private static final String DATABAE_NAME = "ilc";
    private static final String USER = "root";
    private static final String PASSWORD = "";
//    private static final String URL = "jdbc:mysql://localhost/" + DATABAE_NAME;
    private static final String URL = "jdbc:mysql://localhost/" + DATABAE_NAME +"?serverTimezone=UTC";
    
    private static Connection connection;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
               MysqlDataSource dataSource = new MysqlDataSource();
               dataSource.setUrl(URL);
               dataSource.setUser(USER);
               dataSource.setPassword(PASSWORD);
               connection = dataSource.getConnection();
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
            
        }
        
        return connection;
    }
  
  }
