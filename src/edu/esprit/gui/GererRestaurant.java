/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;


import edu.esprit.dao.RestaurantDAO;
import edu.esprit.entities.restaurant;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AHMED
 */
public class GererRestaurant extends AbstractTableModel{
    
        List<restaurant> listRestaurant = new ArrayList<>();
    String []header = {"Identifiant","Nom","Email","Adresse","Description","Tel","Site","Hr ouverture","Hr fermeture"};

    
    
    
    public GererRestaurant(){
    listRestaurant=new RestaurantDAO().DisplayAllRestaurant();
    }
        @Override
    public int getRowCount() {
        
        return listRestaurant.size();
        
    }

        @Override
    public int getColumnCount() {

        return  header.length;
    }

        @Override
   public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            
                 case 0:
                return listRestaurant.get(rowIndex).getId();            
                 case 1:
                return listRestaurant.get(rowIndex).getNom();
                 case 2:
                return listRestaurant.get(rowIndex).getAdresse();
                 case 3:
                return listRestaurant.get(rowIndex).getEmail();
                 case 4:
                return listRestaurant.get(rowIndex).getDescription();
                 case 5:
                return listRestaurant.get(rowIndex).getTel();
                 case 6:
                return listRestaurant.get(rowIndex).getSite();
                 case 7:
                return listRestaurant.get(rowIndex).getHeure_ouverture();
                 case 8:
                return listRestaurant.get(rowIndex).getHeure_fermeture();
            
   
            default: 
            
                return null;
        }
         
    }
    
    
     
        @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
    
}
    



