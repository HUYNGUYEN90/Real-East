
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14085
 */
public class P_Type {
    private int id;
    private String name;
    private String description;
    
    //create the geters and seters method encapsulation.
    public Integer getId()
    {
        return id;
        
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //create the class constructors
    public P_Type(){}
    public P_Type(Integer id, String name , String description )
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    //create a function to insert - edit -remove type
    public boolean execTypeQuery(String queryType , P_Type type)
    {
        PreparedStatement ps;
        // add a new type 
        if(queryType.equals("add"))
        {
            try
            {
                //query-> INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)
                 ps = The_connection.getTheConnection().prepareStatement("INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)");
                  ps.setString(1, type.getName());
                 ps.setString(2, type.getDescription());
                 return (ps.executeUpdate()>0);
                 
            }
            
           
            catch (SQLException ex) {
               Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
               return false;
           }
        }
        
        else if(queryType.equals("edit"))
        {
            try
            {
                //query-> INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)
                 ps = The_connection.getTheConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id`= ?");
                  ps.setString(1, type.getName());
                 ps.setString(2, type.getDescription());
                 ps.setInt(3, type.getId());
                 return (ps.executeUpdate()>0);
                 
            }
            
           
            catch (SQLException ex) {
               Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
               return false;
           }
        }
        
         else if(queryType.equals("remove"))
        {
            try
            {
                //query-> INSERT INTO `property_type`( `name`, `description`) VALUES (?,?)
                 ps = The_connection.getTheConnection().prepareStatement("DELETE FROM `property_type` WHERE `id`=?");
                 
                 ps.setInt(1, type.getId());
                 return (ps.executeUpdate()>0);
                 
            }
            
           
            catch (SQLException ex) {
               Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
               return false;
           }
        }
         else {
             JOptionPane.showMessageDialog(null, "Enter the correct Query(add , edit , remove)", "Invalid Operation", 2);
             return false;
         }
        
    }
    
    //create a function to return a list of  all types in a  HashMap
    public HashMap<String,Integer> getTypesMap()
    {
        HashMap<String , Integer> map = new HashMap <>();
        
        Statement st;
        ResultSet rs;
        try {
            st = The_connection.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `property_type` ");
            P_Type type ;
           
            while(rs.next())
            {
                type = new P_Type(rs.getInt(1), rs.getString(2), rs.getString(3));
                
                map.put(type.getName(), type.getId());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
        
    }
    
    
    //create a function to get the type data by  id 
    // we can use GetTypeMap() function to get the id and name
    // but we want the description to 
    public P_Type getTypeByUd(Integer id)
    {
         PreparedStatement ps;
        ResultSet rs;
        
        P_Type type = new P_Type();; 
        
        
        try {
            ps = The_connection.getTheConnection().prepareStatement("SELECT * FROM `property_type` WHERE `id` = ?");
            
            ps.setInt(1,id);
            rs = ps.executeQuery();
            
            
            if(rs.next())
            {
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));
            }
            
            
        }
              
         catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type;
    }
}
