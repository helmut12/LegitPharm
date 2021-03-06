/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagwaan.ops;

import wagwaan.config.AMSUtility;
import wagwaan.config.ConnectionDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import wagwaan.com.MD5Encrypter;
import wagwaan.config.SQLHelper;
import wagwaan.config.TableModel;
/**
 *
 * @author Helmut
 */
public class PasswordResetting extends javax.swing.JInternalFrame {
Connection con;
    /**
     * Creates new form PasswordResetting
     */
    public PasswordResetting() {
        initComponents();
        con=ConnectionDB.getInstance().getCon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSearchDialog28 = new javax.swing.JDialog();
        jSearchPanel29 = new javax.swing.JPanel();
        jTextField1139 = new javax.swing.JTextField();
        jSearchScrollPane29 = new javax.swing.JScrollPane();
        jSearchTable29 = new javax.swing.JTable();
        jButton529 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jSearchDialog28.setModal(true);
        jSearchDialog28.setUndecorated(true);
        jSearchDialog28.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel29.setLayout(new java.awt.GridBagLayout());

        jTextField1139.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1139CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel29.add(jTextField1139, gridBagConstraints);

        jSearchTable29.setToolTipText("");
        jSearchTable29.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable2.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable29MouseClicked(evt);
            }
        });
        jSearchScrollPane29.setViewportView(jSearchTable29);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel29.add(jSearchScrollPane29, gridBagConstraints);

        jButton529.setText("Close");
        jButton529.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton529ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jSearchPanel29.add(jButton529, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog28.getContentPane().add(jSearchPanel29, gridBagConstraints);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("PASSWORD RESETTING");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Staff Names");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Select UserName");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Staff ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        jTextField3.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel4.setText("PassWord");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPasswordField1, gridBagConstraints);

        jLabel5.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPasswordField2, gridBagConstraints);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton4, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jButton1, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1139CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1139CaretUpdate
        if(jTextField1139.getCaretPosition()>3){
            jSearchTable29.setModel(TableModel.createTableVectors(con, "select username, names from access_control where username ilike '%"+jTextField1139.getText()+"%'"));
            jSearchScrollPane29.setViewportView(jSearchTable29);
        }
    }//GEN-LAST:event_jTextField1139CaretUpdate

    private void jSearchTable29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable29MouseClicked
        jTextField1.setText(jSearchTable29.getValueAt(jSearchTable29.getSelectedRow(), 0).toString());
        jTextField2.setText(jSearchTable29.getValueAt(jSearchTable29.getSelectedRow(), 1).toString());
        jSearchDialog28.dispose();
    try {
        ResultSet rs=SQLHelper.getResultset(con, "select first_name||' '||middle_name||' '||last_name from staff_registration where staff_id='"+jTextField2.getText()+"'");
        while(rs.next()){
            jTextField3.setText(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(PasswordResetting.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jSearchTable29MouseClicked

    private void jButton529ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton529ActionPerformed
        jSearchDialog28.dispose();
    }//GEN-LAST:event_jButton529ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AMSUtility.showSearchDialog(jTextField1, jSearchDialog28);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select the userName", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select the staff Id", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(jTextField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select the staff Names", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(jPasswordField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please  enter your password", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(jPasswordField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please confirm your password", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
//        if(jPasswordField1.gett)
        if(!MD5Encrypter.encrypt(jPasswordField2.getText()).equals(MD5Encrypter.encrypt(jPasswordField1.getText()))){
            JOptionPane.showMessageDialog(this, "Your passwords do not match", "Missing variables", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        PreparedStatement pr=null;
        String sql="update access_control set password='"+MD5Encrypter.encrypt(jPasswordField2.getText())+"', pwd_expiry_date=current_date-1 where username='"+jTextField1.getText()+"' and"
                + " names='"+jTextField2.getText()+"'";
    try {
        con.setAutoCommit(false);
        pr=con.prepareStatement(sql);
        pr.executeUpdate();
        if(pr!=null){
        JOptionPane.showMessageDialog(this, "Update is successful");
        con.commit();
        con.setAutoCommit(true);
        resetDetails();
        }
    } catch (SQLException ex) {
        Logger.getLogger(PasswordResetting.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PasswordResetting.class.getName()).log(Level.SEVERE, null, ex1);
            }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        resetDetails();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    private void resetDetails(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton529;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JDialog jSearchDialog28;
    private javax.swing.JPanel jSearchPanel29;
    private javax.swing.JScrollPane jSearchScrollPane29;
    private javax.swing.JTable jSearchTable29;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1139;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
