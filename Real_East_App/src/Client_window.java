
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14085
 */
public class Client_window extends javax.swing.JFrame {

    /**
     * Creates new form Client_window
     */
    public Client_window() {
        initComponents();
         Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235,125,22));
        jPanel_Title1.setBorder(panel_title_border);
        //set border to the jbuttons
         Border button_border = BorderFactory.createMatteBorder(3, 3, 3, 3,new Color(96,255,255));
        jButton_Add_Client.setBorder(button_border);
        jButton_Edit_Client.setBorder(button_border);
        jButton_Remove_Client.setBorder(button_border);
        jButton_Refresh.setBorder(button_border);
        fillJTableWithClientData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
     public void fillJTableWithClientData()
    {
        P_Client client= new P_Client();
        ArrayList<P_Client> clientList = client.clientList();
        // the jtable columns
        String[] colName = {"ID","First Name","Last Name","Phone","Email","Address"};
        
        //the jtable row
        //ownerslist.size() = the size of the arraylist and 6 is the number of columns
        Object[][] rows = new Object[clientList.size()][6];
        
        //add data form the  list to the rows 
        for(int i = 0 ; i < clientList.size(); i++)
        {
            rows[i][0]= clientList.get(i).getId();
            rows[i][1]= clientList.get(i).getFirstName();
            rows[i][2]= clientList.get(i).getLastName();
            rows[i][3]= clientList.get(i).getPhoneNumber();
            rows[i][4]= clientList.get(i).getEmail();
            rows[i][5]= clientList.get(i).getAddress();
        }
        
//        DefaultTableModel  model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(rows);
DefaultTableModel model = new DefaultTableModel(rows,colName);
jTable1.setModel(model);
jTable1.setRowHeight(40);
//change the jtable selection background
jTable1.setSelectionBackground(Color.blue);
//change the "ID"column width
jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
//change the "Address" column width
jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_Title1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Last_Name = new javax.swing.JTextField();
        jTextField_ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Addres = new javax.swing.JTextArea();
        jButton_Remove_Client = new javax.swing.JButton();
        jButton_Owner_Properties = new javax.swing.JButton();
        jButton_Edit_Client = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_First_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Email_Name = new javax.swing.JTextField();
        jTextField_Phone_Name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Add_Client = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jPanel_Title1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 58)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Clients");

        javax.swing.GroupLayout jPanel_Title1Layout = new javax.swing.GroupLayout(jPanel_Title1);
        jPanel_Title1.setLayout(jPanel_Title1Layout);
        jPanel_Title1Layout.setHorizontalGroup(
            jPanel_Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Title1Layout.createSequentialGroup()
                .addGap(597, 597, 597)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Title1Layout.setVerticalGroup(
            jPanel_Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Title1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText(" First Name:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Address");

        jTextField_Last_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jTextField_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jTextArea_Addres.setColumns(20);
        jTextArea_Addres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea_Addres.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Addres);

        jButton_Remove_Client.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Client.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Remove_Client.setText("Remove");
        jButton_Remove_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ClientActionPerformed(evt);
            }
        });

        jButton_Owner_Properties.setBackground(new java.awt.Color(255, 0, 204));
        jButton_Owner_Properties.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Owner_Properties.setText("Owner Properties");
        jButton_Owner_Properties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Owner_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Owner_PropertiesActionPerformed(evt);
            }
        });

        jButton_Edit_Client.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Edit_Client.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Edit_Client.setText("Edit");
        jButton_Edit_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ClientActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Refresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Refresh.setText("Refresh");
        jButton_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("  Last Name:");

        jTextField_First_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Phone:");

        jTextField_Email_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jTextField_Phone_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_Add_Client.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Add_Client.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Add_Client.setText("Add");
        jButton_Add_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(49, 49, 49))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jButton_Edit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton_Remove_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1398, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Phone_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Edit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(713, Short.MAX_VALUE)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Remove_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ClientActionPerformed
        //remove the selected iwner from the system

        try{
            int clientId = Integer.valueOf(jTextField_ID.getText());
            P_Client client = new P_Client();
            if(jTextField_ID.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Owner Id number", "Empty ID",2);
            }
            else{
                int yes_or_no = JOptionPane.showConfirmDialog(null,"Do you want to deleted this client ?","Delete Type",JOptionPane.YES_NO_OPTION);
                if (yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(  client.deleteClient(clientId))
                    {
                        JOptionPane.showMessageDialog(null, " Cleint  data Delete", "Delete client", 1);
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delete client", 2);
                    }
                }
            }
        }

        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter the Valid Client ID", "Invalid Id", 0);
        }

    }//GEN-LAST:event_jButton_Remove_ClientActionPerformed

    private void jButton_Owner_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Owner_PropertiesActionPerformed
     

    }//GEN-LAST:event_jButton_Owner_PropertiesActionPerformed

    private void jButton_Edit_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ClientActionPerformed

        String Fname = jTextField_First_Name.getText();
        String Lname = jTextField_Last_Name.getText();
        String phone = jTextField_Phone_Name.getText();
        String address = jTextArea_Addres.getText();
        String email = jTextField_Email_Name.getText();
        P_Client client = new P_Client();

        try{
            int clientID = Integer.valueOf(jTextField_ID.getText());
            if(Fname.trim().equals("")||Lname.trim().equals("")||phone.trim().equals("")||address.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the required client information[first name , last name , phone number  , address]", "Edit client", 2);
            }
            else{
                if(client.editClientData(new P_Client(clientID, Fname, Lname, email, phone, address)))
                {
                    JOptionPane.showMessageDialog(null, "New Client data edit to the System", "Edit client",1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Owner Not edit to the System", "Edit client", 2);
                }
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter the Valid Owner ID", "Invalid Id", 0);
        }

    }//GEN-LAST:event_jButton_Edit_ClientActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        // call the fill jtable function to show the new data in jtable
       // fillJTableWithOwnersData();
        fillJTableWithClientData();
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRowIndex = jTable1.getSelectedRow();
        jTextField_ID.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        jTextField_First_Name.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Last_Name.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        jTextField_Phone_Name.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        jTextField_Email_Name.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_Addres.setText(jTable1.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_Add_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ClientActionPerformed
        //Here we will show the selected owner properties in a new form
  // add the selected type
        //add a new client
        //get the owner data

        String Fname = jTextField_First_Name.getText();
        String Lname = jTextField_Last_Name.getText();
        String phone = jTextField_Phone_Name.getText();
        String address = jTextArea_Addres.getText();
        String email = jTextField_Email_Name.getText();

        P_Client client = new P_Client();

        //before editing the  owner data we need to check  if the required data are empty
        //required data -. first name , last name , phone number  , address

        if(Fname.trim().equals("")||Lname.trim().equals("")||phone.trim().equals("")||address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the required client information[first name , last name , phone number  , address]", "Add client", 2);
        }
        else{
            if(client.addNewClient(new P_Client(0, Fname, Lname, email, phone, address)))
            {
                JOptionPane.showMessageDialog(null, "New Client addes to the System", "Add client",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Client Not added to the System", "Add cleint", 2);
            }
        }
    }//GEN-LAST:event_jButton_Add_ClientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Client;
    private javax.swing.JButton jButton_Edit_Client;
    private javax.swing.JButton jButton_Owner_Properties;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove_Client;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Title1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Addres;
    private javax.swing.JTextField jTextField_Email_Name;
    private javax.swing.JTextField jTextField_First_Name;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Last_Name;
    private javax.swing.JTextField jTextField_Phone_Name;
    // End of variables declaration//GEN-END:variables
}
