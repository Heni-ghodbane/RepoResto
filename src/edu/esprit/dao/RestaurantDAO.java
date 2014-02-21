

package edu.esprit.dao;

import edu.esprit.entities.restaurant;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RestaurantDAO {

    
    public void insertRestaurant(restaurant rest){

         String requete = "insert into restaurant ( nom, adresse, email, descreption, tel, site, heure_ouverture, heure_fermeture,id_restaurateur) values (?,?,?,?,?,?,?,?,1)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, rest.getNom());
            ps.setString(2, rest.getAdresse());
            ps.setString(3,rest.getEmail() );
            ps.setString(4,rest.getDescription() );
            ps.setString(5,rest.getTel() );
            ps.setString(6,rest.getSite() );
            ps.setString(7,rest.getHeure_ouverture() );
            ps.setString(8,rest.getHeure_fermeture() );
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
    }

    public void updateRestaurant(restaurant rest){
        String requete = "update restaurant set nom=?, adresse=?, email=?, descreption=? , tel=?, site=?, heure_ouverture=?, heure_fermeture=?  where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, rest.getNom());
            ps.setString(2, rest.getAdresse());
            ps.setString(3, rest.getEmail());
            ps.setString(4, rest.getDescription());
            ps.setString(5, rest.getTel());
            ps.setString(6, rest.getSite());
            ps.setString(7, rest.getHeure_ouverture());
            ps.setString(8, rest.getHeure_fermeture());
            ps.setInt(9, rest.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }

     public void deleteRestaurant(int id_rest){

          String requete = "delete from restaurant where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_rest);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

     
      public restaurant findRestaurantById(int id){

        String requete = "select * from restaurant where id=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        RestaurantDAO restaurantDAO = new RestaurantDAO();
        restaurant resto = new restaurant();
        while (resultat.next()){

                resto.setId(resultat.getInt(1));
                resto.setNom(resultat.getString(2));
                resto.setAdresse(resultat.getString(3));
                resto.setEmail(resultat.getString(4));
                resto.setDescription(resultat.getString(5));
                resto.setTel(resultat.getString(6));
                resto.setSite(resultat.getString(7));
                resto.setHeure_ouverture(resultat.getString(8));
                resto.setHeure_fermeture(resultat.getString(9));
        }
        return resto;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }


       public List<restaurant> DisplayAllRestaurant (){


        List<restaurant> listeRestaurant = new ArrayList<restaurant>();

        String requete = "select * from restaurant";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            RestaurantDAO restaurantDAO = new RestaurantDAO();
            while(resultat.next()){
                restaurant resto =new restaurant();
                resto.setId(resultat.getInt(1));
                resto.setNom(resultat.getString(2));
                resto.setAdresse(resultat.getString(3));
                resto.setEmail(resultat.getString(4));
                resto.setDescription(resultat.getString(5));
                resto.setTel(resultat.getString(6));
                resto.setSite(resultat.getString(7));
                resto.setHeure_ouverture(resultat.getString(8));
                resto.setHeure_fermeture(resultat.getString(9));
                            
                listeRestaurant.add(resto);
            }
            return listeRestaurant;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des restaurants "+ex.getMessage());
            return null;
        }
    }

    
}
