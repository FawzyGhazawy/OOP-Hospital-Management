/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Doctor;
import control.DBAccess;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jean
 */
public class UpdateDoctorSchedule extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDoctorSchedule
     */
    public UpdateDoctorSchedule() {
        initComponents();
        MRI.removeAllItems();
        ArrayList<Integer> idList = null;

        idList = new DBAccess().getAllHospitalID();
        for (int i = 0; i < idList.size(); i++) {

            Hosp_ID.addItem("" + idList.get(i));

        }
        ArrayList<Integer> idList1 = null;

        try {
            idList1 = new DBAccess().getallDocID();
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < idList1.size(); i++) {

            Doc_ID.addItem("" + idList1.get(i));

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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Doc_LN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Doc_Qual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Doc_Sch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Hosp_ID = new javax.swing.JComboBox<>();
        Add_BTN = new javax.swing.JButton();
        Doc_FN = new javax.swing.JTextField();
        Doc_ID = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        MRI = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("First Name:");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        jLabel4.setText("Qualifications:");

        jLabel5.setText("Schedule:");

        jLabel6.setText("Hospital ID:");

        jLabel1.setText("Doctor ID:");

        Hosp_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hosp_IDActionPerformed(evt);
            }
        });

        Add_BTN.setText("Update Doctor");
        Add_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_BTNActionPerformed(evt);
            }
        });

        Doc_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doc_IDActionPerformed(evt);
            }
        });

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Appointment id:");

        MRI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(96, 96, 96))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(87, 87, 87)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doc_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hosp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Doc_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Doc_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(Add_BTN)))
                    .addComponent(Doc_Qual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MRI, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Doc_Sch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Doc_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hosp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Doc_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Doc_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Doc_Qual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Doc_Sch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_BTN)
                    .addComponent(jButton1))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Hosp_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hosp_IDActionPerformed
        Doc_ID.removeAllItems();
        DBAccess dba = new DBAccess();
        ArrayList<Integer> drs = null;
        try {
            drs = dba.getDrIDfromHospID(Integer.parseInt(Hosp_ID.getSelectedItem().toString()));
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < drs.size(); i++) {

            Doc_ID.addItem("" + drs.get(i));

        }
    }//GEN-LAST:event_Hosp_IDActionPerformed

    private void Add_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_BTNActionPerformed

        DBAccess dba = new DBAccess();
        Doctor d = new Doctor(Integer.parseInt(Doc_ID.getSelectedItem().toString()),
                Doc_FN.getText(),
                Doc_LN.getText(),
                Doc_Qual.getText(),
                Doc_Sch.getText(),
                Integer.parseInt(Hosp_ID.getSelectedItem().toString()));
        dba.UpdateDocotrbyID(d);
        this.dispose();

    }//GEN-LAST:event_Add_BTNActionPerformed

    private void Doc_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doc_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Doc_IDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DBAccess dba = new DBAccess();
        MRI.removeAllItems();
        /* ArrayList<Integer> drs = null;
        try {
            drs = dba.getDrIDfromHospID(Integer.parseInt(Hosp_ID.getSelectedItem().toString()));
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < drs.size(); i++) {
            
            Doc_ID.addItem("" + drs.get(i));
            
        }
         */
        Doctor SpDr = dba.getDoctorbyID(Doc_ID.getSelectedItem().toString());
        Doc_FN.setText(SpDr.getDoc_FN() + " ");
        Doc_LN.setText(SpDr.getDoc_LN() + " ");
        Doc_Qual.setText(SpDr.getDoc_Qual() + " ");
        Doc_Sch.setText(SpDr.getDoc_Sch() + " ");

      /*  String id;
        id = dba.getAppIDbyDocID(Doc_ID.getSelectedItem().toString());
        appID.setText(id + " ");*/
        ArrayList<Integer> MRid;
        try {
            MRid = dba.getAppIDbyDocID(Integer.parseInt(Doc_ID.getSelectedItem().toString()));
            for (int i = 0; i < MRid.size(); i++) {
                MRI.addItem(String.valueOf(MRid.get(i)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctorSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_BTN;
    private javax.swing.JTextField Doc_FN;
    private javax.swing.JComboBox<String> Doc_ID;
    private javax.swing.JTextField Doc_LN;
    private javax.swing.JTextField Doc_Qual;
    private javax.swing.JTextField Doc_Sch;
    private javax.swing.JComboBox<String> Hosp_ID;
    private javax.swing.JComboBox<String> MRI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
