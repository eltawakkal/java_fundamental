/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hayaqo
 */
public class JavaApplication1 {
    
    
    
    private static String queryInsert = "INSERT INTO courses (course_name, course_overview, image_url, video_url) VALUES (?, ?, ?, ?)";
    private static String queryUpdate = "UPDATE courses SET course_name = ?, course_overview = ?, image_url = ?, video_url = ? WHERE id = ?";
    private static String queryDelete = "DELETE FROM courses WHERE id = ?";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        insertCourse();
//        updateCourse();
        deleteCourse();
    }  
    
    public void insertCourse(String cName, String cOverView, String cImage, String cVideo) {
        
        System.out.println("Name: " + cImage);
        
        Connection con = SlpDataHelper.getConnection();
        
        PreparedStatement statement = null;
        
        try {
            statement = con.prepareStatement(queryInsert);
            statement.setString(1, cName);
            statement.setString(2, cOverView);
            statement.setString(3, cImage);
            statement.setString(4, cVideo);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void updateCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Course Name :");
        String cName = scanner.nextLine();
        System.out.println("Masukkan Course Overview :");
        String cOverview = scanner.nextLine();
        System.out.println("Masukkan Course Image :");
        String cImage = scanner.nextLine();
        System.out.println("Masukkan Course Video :");
        String cVidUrl= scanner.nextLine();
        System.out.println("Masukkan Course ID :");
        String cID= scanner.nextLine();
        
        Connection con = SlpDataHelper.getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(queryUpdate);
            statement.setString(1, cName);
            statement.setString(2, cOverview);
            statement.setString(3, cImage);
            statement.setString(4, cVidUrl);
            statement.setString(5, cID);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void deleteCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Course ID :");
        String cID= scanner.nextLine();
        
        Connection con = SlpDataHelper.getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(queryDelete);
            statement.setString(1, cID);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
}
