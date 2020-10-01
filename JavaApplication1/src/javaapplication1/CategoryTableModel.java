/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hayaqo
 */
public class CategoryTableModel extends AbstractTableModel{
    
    List<Courses> listCourse = new ArrayList<>();

    public void setListCourse(List<Courses> listCourse) {
        this.listCourse = listCourse;
    }
    
    @Override
    public int getRowCount() {
        return listCourse.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(rowIndex) {
            case 0:
                return rowIndex+1;
            case 1:
                return listCourse.get(rowIndex).getCourseName();
            case 2:
                return listCourse.get(rowIndex).getCourseOverView();
                default:
                    return null;
                    
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "No.";
            case 1:
                return "Course Name";
            case 2:
                return "Course Overview";
                default:
                    return null;
        }
    }
    
    
    
}
