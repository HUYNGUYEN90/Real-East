
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14085
 */
public class P_Property {
    private int id;
    private int type;
    private int  size;
    private  int owner_ID;
    private String price;
    private String address;
    private int bedroom;
    private int bathroom;
    private int age;
    private boolean balcone;
    private boolean pool;
    private boolean garage;
    private boolean backyard;
    private String description;
    
    public P_Property(){}
    public P_Property(int ID , int type , int size , int owner_ID, String price , String address , int bedroom , int bathroom, int age , boolean balcone , boolean pool , boolean garage , boolean backyard , String description)
            
    {
        this.id = ID;
        this.type = type;
        this.size = size;
        this.owner_ID = owner_ID;
        this.price = price;
        this.address = address;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.age = age;
        this.backyard = backyard;
        this.balcone = balcone;
        this.pool = pool;
        this.garage = garage;
        this.description = description;
                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwner_ID() {
        return owner_ID;
    }

    public void setOwner_ID(int owner_ID) {
        this.owner_ID = owner_ID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBalcone() {
        return balcone;
    }

    public void setBalcone(boolean balcone) {
        this.balcone = balcone;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Create  a function to add a new property
    public boolean addNewProperty(P_Property property)
    {
        return true;
    }
    
     public boolean editNewProperty(P_Property property)
    {
        return true;
    }
     
      public boolean removeNewProperty(P_Property property)
    {
        return true;
    }
      //create a function to return  an arraylist of properties
      public ArrayList<P_Property> propertiesList ()
      {
          return new ArrayList<P_Property>();
      }
}
