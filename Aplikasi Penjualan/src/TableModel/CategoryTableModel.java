/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import entity.Category;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hayaqo
 */
public class CategoryTableModel extends AbstractTableModel{
    
    List<Category> listCategory = new ArrayList<>();

    public Category getCategory(int row) {
        return listCategory.get(row);
    }
    
    public CategoryTableModel(List<Category> listCategorys) {
        this.listCategory = listCategorys;
    }

    @Override
    public int getRowCount() {
        return listCategory.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return listCategory.get(rowIndex).getName();
            case 2:
                return listCategory.get(rowIndex).getStatus();
                default:
                    return false;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "No.";
            case 1:
                return "Nama";
            case 2:
                return "Status";
                default:
                    return null;
        }
    }
    
    
}
