/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagwaan.com;

import wagwaan.config.AMSUtility;
import wagwaan.config.ConnectionDB;
import wagwaan.config.TableModel;
import java.sql.*;
import wagwaan.reports.SupplierInvPdf;
/**
 *
 * @author Helmut
 */
public class ExternalPaymentDlg extends javax.swing.JDialog {
    Connection con;
    /**
     * Creates new form ExternalPaymentDlg
     * @param parent
     * @param modal
     */
    public ExternalPaymentDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setName("INVOICE NO SELECTION"); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Select Invoice No.");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextField1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(400, 161));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1139CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1139CaretUpdate
        if(jTextField1139.getCaretPosition()>2){
            jSearchTable29.setModel(TableModel.createTableVectors(con, "select distinct(invoice_no) from creditors_ledger where invoice_no ilike '%"+jTextField1139.getText()+"%'"));
            jSearchScrollPane29.setViewportView(jSearchTable29);
        }
    }//GEN-LAST:event_jTextField1139CaretUpdate

    private void jSearchTable29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable29MouseClicked
        jTextField1.setText(jSearchTable29.getValueAt(jSearchTable29.getSelectedRow(), 0).toString());
        jSearchDialog28.dispose();
    }//GEN-LAST:event_jSearchTable29MouseClicked

    private void jButton529ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton529ActionPerformed
        jSearchDialog28.dispose();
    }//GEN-LAST:event_jButton529ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AMSUtility.showSearchDialog(jTextField1, jSearchDialog28);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SupplierInvPdf sup=new SupplierInvPdf();
        sup.SupplierInvPdf(con, String.valueOf(jTextField1.getText()));
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton529;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDialog jSearchDialog28;
    private javax.swing.JPanel jSearchPanel29;
    private javax.swing.JScrollPane jSearchScrollPane29;
    private javax.swing.JTable jSearchTable29;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1139;
    // End of variables declaration//GEN-END:variables
}