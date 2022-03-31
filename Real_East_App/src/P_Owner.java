

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14085
 */
public class P_Owner {
    private int id ;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public P_Owner(){}
    public P_Owner(int id , String FName, String LName, String phone,  String Email , String Address){
        this.id = id;
        this.firstName = FName;
        this.lastName = LName;
        this.email = Email;
        this.phoneNumber = phone;
        this.address = Address;
    }
    // create a function to add new owner
    // first create the owner in database
    
    
    public boolean addNewOwner(P_Owner owner)
    {
        PreparedStatement ps;
       
        
      
      
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("INSERT INTO `property_own`( `Fname`, `Lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)");
         ps.setString(1,owner.getFirstName());
         ps.setString(2,owner.getLastName());
         ps.setString(3,owner.getPhoneNumber());
         ps.setString(4,owner.getEmail());
         ps.setString(5,owner.getAddress());
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
//ps = The_connection.getTheConnection().prepareStatement(addQuery);
       
        
    }
    //create a function to edit the selected owner data
    public boolean editOwnerData(P_Owner owner)
    {
          PreparedStatement ps;
       
        
     
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("UPDATE `property_own` SET `Fname`=?,`Lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?");
         ps.setString(1,owner.getFirstName());
         ps.setString(2,owner.getLastName());
         ps.setString(3,owner.getPhoneNumber());
         ps.setString(4,owner.getEmail());
         ps.setString(5,owner.getAddress());
         ps.setInt(6, owner.getId());
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
    }
    //create a function to delete the selected owner
    public boolean deleteOwner (int OwnerID)
    {
        PreparedStatement ps;
       
        
     
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("DELETE FROM `property_own` WHERE `id`=?");
         ps.setInt(1,OwnerID);
         
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    // create a unction to return an arraylist of owner
    public ArrayList<P_Owner> ownersList(){
        ArrayList<P_Owner> list = new ArrayList<>();
        
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        String selecQuery = "SELECT * FROM `property_own` ";
        
        try {
            st = The_connection.getTheConnection().createStatement();
            rs = st.executeQuery(selecQuery);
            P_Owner owner;
            
            
            while (rs.next())
            {
                owner = new P_Owner(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(owner);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_Owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
