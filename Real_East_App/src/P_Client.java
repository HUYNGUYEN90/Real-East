

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
public class P_Client {
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
    
    public P_Client(){}
    public P_Client(int id , String FName, String LName, String phone,  String Email , String Address){
        this.id = id;
        this.firstName = FName;
        this.lastName = LName;
        this.email = Email;
        this.phoneNumber = phone;
        this.address = Address;
    }
    // create a function to add new client
    // first create the owner in database
    
    
    public boolean addNewClient(P_Client client)
    {
        PreparedStatement ps;
       
        
      
      
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("INSERT INTO `property_client`( `Fname`, `Lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)");
         ps.setString(1,client.getFirstName());
         ps.setString(2,client.getLastName());
         ps.setString(3,client.getPhoneNumber());
         ps.setString(4,client.getEmail());
         ps.setString(5,client.getAddress());
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
//ps = The_connection.getTheConnection().prepareStatement(addQuery);
       
        
    }
    //create a function to edit the selected client data
    public boolean editClientData(P_Client client)
    {
          PreparedStatement ps;
       
        
     
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("UPDATE `property_client` SET `Fname`=?,`Lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?");
         ps.setString(1,client.getFirstName());
         ps.setString(2,client.getLastName());
         ps.setString(3,client.getPhoneNumber());
         ps.setString(4,client.getEmail());
         ps.setString(5,client.getAddress());
         ps.setInt(6, client.getId());
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
    }
    //create a function to delete the selected owner
    public boolean deleteClient (int clientID)
    {
        PreparedStatement ps;
       
        
     
        
         try {
         ps = The_connection.getTheConnection().prepareStatement("DELETE FROM `property_client` WHERE `id`=?");
         ps.setInt(1,clientID);
         
         return (ps.executeUpdate()>0);
           
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    // create a unction to return an arraylist of owner
    public ArrayList<P_Client> clientList(){
        ArrayList<P_Client> list = new ArrayList<>();
        
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        String selecQuery = "SELECT * FROM `property_client` ";
        
        try {
            st = The_connection.getTheConnection().createStatement();
            rs = st.executeQuery(selecQuery);
            P_Client client;
            
            
            while (rs.next())
            {
                client = new P_Client(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
