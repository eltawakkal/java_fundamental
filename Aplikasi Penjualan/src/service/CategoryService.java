package service;

import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class CategoryService {
    
    private Connection connection;
    

    public CategoryService(Connection connection) {
        this.connection = connection;
    }   
    
    private static String INSERT_DATA = "INSERT INTO category(name, status) VALUES (?, ?)";
    public void addCategory(Category category) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(INSERT_DATA);
            statement.setString(1, category.getName());
            statement.setString(2, category.getStatus());
            statement.executeUpdate();
          
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
    
    private static String UPDATE_DATA = "UPDATE category SET name=?, status=? WHERE id = ?";
    public void updateCategory(Category category) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(UPDATE_DATA);
            statement.setString(1, category.getName());
            statement.setString(2, category.getStatus());
            statement.setInt(3, category.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
    
    private static String DELETE_DATA = "DELETE FROM category WHERE id = ?";
    public void deleteCategory(int id) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(DELETE_DATA);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
    
    private static String SELECT_DATA = "SELECT * FROM category";
    public List<Category> getAllDAta() {
        List<Category> listCategorys = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(SELECT_DATA);
            while (set.next()) {
                Category category = new Category(
                        set.getInt("id"), 
                        set.getString("name"), 
                        set.getString("status")
                );
                
                listCategorys.add(category);
            }
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
        return listCategorys;
    }
    
}
