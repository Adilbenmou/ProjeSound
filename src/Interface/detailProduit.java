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
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class detailProduit extends javax.swing.JFrame {

    
    ResultSet rs;
    dbcnx db;
    
    
    public detailProduit() {
         db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        table();
        setResizable(false);
        SetIcon();
    }

    
     public void table(){
            String t[]=
            {"reference","nom_produit","prix","description"};
            rs=db.SelectSome(t,"produit");
            Table2.setModel(new datatable(rs) {});
        }
     
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ci = new javax.swing.JLabel();
        re = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/product.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 20, 64, 64);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Details Produit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 40, 155, 35);

        ci.setFont(new java.awt.Font("Andalus", 2, 20)); // NOI18N
        ci.setText("Entrer la reference de produit");
        getContentPane().add(ci);
        ci.setBounds(207, 117, 260, 32);

        re.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reMouseClicked(evt);
            }
        });
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });
        re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reKeyTyped(evt);
            }
        });
        getContentPane().add(re);
        re.setBounds(485, 121, 228, 26);

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        Table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Table2KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 181, 820, 200);

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(723, 386, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-29, -30, 1080, 550);

        setSize(new java.awt.Dimension(975, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        produit m=new produit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
           
        
         re.setText(String.valueOf(Table2.getValueAt(Table2.getSelectedRow(),0))); 
         
    }//GEN-LAST:event_Table2MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        re.setEditable(false);
     
    }//GEN-LAST:event_formComponentShown

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_reActionPerformed

    private void reMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reMouseClicked

    private void Table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table2KeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Table2KeyReleased

    private void Table2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table2KeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Table2KeyTyped

    private void reKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reKeyReleased

                 if(ci.getText().equals("Entrer la reference de produit")) {
                rs = db.SelectALL("produit", "reference LIKE '%" + re.getText() + "%' ");
                Table2.setModel(new datatable(rs){});
            }
    }//GEN-LAST:event_reKeyReleased

    private void reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_reKeyTyped

    private void reKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(detailProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JLabel ci;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField re;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
