/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.datatable;
import Database.dbcnx;
import Database.parameter;
import java.awt.Toolkit;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class client extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
        
   ResultSet rs;
   dbcnx db;
    public client() {
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        setResizable(false);
        SetIcon();
        table();
    }
      public void table(){
            String t[]=
            {"cin","nom","prenom","tel","email","adress","sex"};
            rs=db.SelectSome(t,"client");
            Table1.setModel(new datatable(rs) {});
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        to = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 900));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 15)); // NOI18N
        jLabel1.setText("Nouv Client");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(64, 128, 96, 24);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-details-64 (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(182, 39, 70, 73);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 15)); // NOI18N
        jLabel2.setText("Details client");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(169, 128, 94, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-add-administrator-50.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 39, 70, 73);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-client-management-80.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(279, 39, 75, 73);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 15)); // NOI18N
        jLabel3.setText("Mdf client");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(278, 128, 85, 24);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-delete-document-50.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(389, 39, 71, 73);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 15)); // NOI18N
        jLabel4.setText("Supp client");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(381, 128, 80, 24);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel5.setText("les Clients");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(222, 928, 241, 47);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/target.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(117, 202, 143, 144);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/crm.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(366, 202, 128, 144);

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 35)); // NOI18N
        jLabel8.setText("Les Clients");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 362, 223, 47);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-delete-64.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(491, 39, 70, 73);

        jLabel9.setFont(new java.awt.Font("Andalus", 1, 15)); // NOI18N
        jLabel9.setText("Ferme ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(501, 128, 48, 24);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 400, 200, 5);

        to.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        to.setText("0");
        to.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toMouseClicked(evt);
            }
        });
        getContentPane().add(to);
        to.setBounds(290, 410, 20, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel10PropertyChange(evt);
            }
        });
        jLabel10.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jLabel10VetoableChange(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-10, -20, 700, 520);

        setSize(new java.awt.Dimension(658, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        detailclient m=new detailclient();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ajouteclient m=new ajouteclient();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         mdfclient m=new mdfclient();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        suppclient m=new suppclient();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ClientProduit m=new ClientProduit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void toMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_toMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
           int numrow =Table1.getRowCount();

        int tot=0;

        for(int i=0; i< numrow; i++){
            double val = Double.valueOf(Table1.getSelectedRow());
            tot -=val;

        }
        to.setText(""+tot);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel10VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10VetoableChange

    private void jLabel10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel10PropertyChange
        // TODO add your handling code here:
             int numrow =Table1.getRowCount();

        int tot=0;

        for(int i=0; i< numrow; i++){
            double val = Double.valueOf(Table1.getSelectedRow());
            tot -=val;

        }
        to.setText(""+tot);
    }//GEN-LAST:event_jLabel10PropertyChange

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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
