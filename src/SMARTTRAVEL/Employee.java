/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAMS;

import java.sql.Connection;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
  
/**
 *
 * @author HP
 */
public class Employee extends javax.swing.JFrame {
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    

    /**
     * Creates new form Employee
     */
    
    public Employee() {
        initComponents();
        conn = Mysqlconnect.ConnectDB();
        fetch();
    }
    
    public void fetch(){
        try{
                    String sql="select * from employee";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    Etable.setModel(DbUtils.resultSetToTableModel(rs));
                }
        
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Epane = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ename = new javax.swing.JTextField();
        Ephone = new javax.swing.JTextField();
        Eaddress = new javax.swing.JTextField();
        Eid = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Modbtn = new javax.swing.JButton();
        Delbtn = new javax.swing.JButton();
        Clrbtn = new javax.swing.JButton();
        Espane = new javax.swing.JScrollPane();
        Etable = new javax.swing.JTable();
        Ejdate = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Epane.setBackground(new java.awt.Color(0, 0, 51));

        header.setBackground(new java.awt.Color(102, 0, 153));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMPLOYEE DASHBOARD");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Joining Date");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number");

        Ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnameActionPerformed(evt);
            }
        });

        Ephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EphoneActionPerformed(evt);
            }
        });

        Eaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EaddressActionPerformed(evt);
            }
        });

        Eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EidActionPerformed(evt);
            }
        });

        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setText("ADD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Modbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Modbtn.setText("MODIFY");
        Modbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModbtnActionPerformed(evt);
            }
        });

        Delbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delbtn.setText("DELETE");
        Delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelbtnActionPerformed(evt);
            }
        });

        Clrbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clrbtn.setText("CLEAR");
        Clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrbtnActionPerformed(evt);
            }
        });

        Etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee name ", "Phone", "Address", "Join Date"
            }
        ));
        Etable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtableMouseClicked(evt);
            }
        });
        Espane.setViewportView(Etable);

        javax.swing.GroupLayout EpaneLayout = new javax.swing.GroupLayout(Epane);
        Epane.setLayout(EpaneLayout);
        EpaneLayout.setHorizontalGroup(
            EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EpaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(73, 73, 73)
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ephone, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(Ename)
                    .addComponent(Eaddress)
                    .addComponent(Eid)
                    .addComponent(Ejdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Espane)
                .addContainerGap())
        );
        EpaneLayout.setVerticalGroup(
            EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EpaneLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EpaneLayout.createSequentialGroup()
                        .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ename, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EpaneLayout.createSequentialGroup()
                        .addComponent(Modbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EpaneLayout.createSequentialGroup()
                        .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Ephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Eaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(EpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ejdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EpaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(Delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addComponent(Espane, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Epane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Epane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnameActionPerformed

    private void EphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EphoneActionPerformed

    private void EaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EaddressActionPerformed

    private void EidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EidActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();
        
        String query = "INSERT INTO EMPLOYEE (ENAME,EPHONE,EADDRESS,EJDATE)VALUES(?,?,?,?)";
        
        try{
            
            pst =conn.prepareStatement(query);
            //pst.setString(1,Eid.getText());
            pst.setString(1,Ename.getText());
            pst.setString(2,Ephone.getText());
            pst.setString(3,Eaddress.getText());
            pst.setDate(4, new java.sql.Date(Ejdate.getDate().getTime()));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Employee added");
            
            fetch();
            
            try{
              
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);  
            }  
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null,e);  
        }
         
    }//GEN-LAST:event_AddbtnActionPerformed

    private void ModbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();
        
        int row = Etable.getSelectedRow();
        //System.out.println(row);
        
        String cell = Etable.getModel().getValueAt(row,0).toString();
        
        System.out.println(cell);
        
        String modsql = "UPDATE EMPLOYEE SET ENAME =?,EPHONE =?,EADDRESS=?,EJDATE=? WHERE EID ="+cell;
        
        try{
            pst=conn.prepareStatement(modsql);
            
            pst.setString(1,Ename.getText());
            pst.setString(2,Ephone.getText());
            pst.setString(3,Eaddress.getText());
            pst.setDate(4, new java.sql.Date(Ejdate.getDate().getTime()));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Table Modified");
            
            fetch();
        }
        
        catch(Exception e){  
           JOptionPane.showMessageDialog(null,e);  
        }    
    }//GEN-LAST:event_ModbtnActionPerformed

    private void DelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();

        int row = Etable.getSelectedRow();
        //System.out.println(row);
        String cell = Etable.getModel().getValueAt(row,0).toString();
        System.out.println(cell);

        String delsql = "DELETE FROM EMPLOYEE WHERE EID = "+ cell;
        
        try{
            pst=conn.prepareStatement(delsql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Employee Deleted");
            fetch();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_DelbtnActionPerformed

    private void ClrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrbtnActionPerformed
        // TODO add your handling code here:
            Eid.setText(" ");
            Ename.setText("  ");
            Ephone.setText("  ");
            Eaddress.setText("  ");
            Ejdate.setDate(null);
    }//GEN-LAST:event_ClrbtnActionPerformed

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
        dispose();
        Home Hobj = new Home();
        Hobj.setVisible(true);
    }//GEN-LAST:event_headerMouseClicked

    private void EtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtableMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        // TO LOAD DATA INTO TEXT FIELD
       DefaultTableModel model = (DefaultTableModel)Etable.getModel();

        // get the selected row index
       int selectedRowIndex = Etable.getSelectedRow();
       
        // set the selected row data into jtextfields
       Eid.setText(model.getValueAt(selectedRowIndex, 0).toString());
       Ename.setText(model.getValueAt(selectedRowIndex, 1).toString());
       Ephone.setText(model.getValueAt(selectedRowIndex, 2).toString());
       Eaddress.setText(model.getValueAt(selectedRowIndex, 3).toString());
       java.util.Date date1;

       
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRowIndex,4).toString());
            Ejdate.setDate(date1);

        } catch (ParseException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        try {
//            Date date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedRowIndex, 4));
//            //System.out.println(date.toString());
//            Ejdate.setDate(model.getValueAt(selectedRowIndex,date);
//        }
//        catch (ParseException ex) {
//            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_EtableMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Clrbtn;
    private javax.swing.JButton Delbtn;
    private javax.swing.JTextField Eaddress;
    private javax.swing.JTextField Eid;
    private org.jdesktop.swingx.JXDatePicker Ejdate;
    private javax.swing.JTextField Ename;
    private javax.swing.JPanel Epane;
    private javax.swing.JTextField Ephone;
    private javax.swing.JScrollPane Espane;
    private javax.swing.JTable Etable;
    private javax.swing.JButton Modbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
