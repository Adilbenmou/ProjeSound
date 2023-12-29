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
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class dePm extends javax.swing.JFrame {

    /**
     * Creates new form dePm
     */
        ResultSet rs;
        dbcnx db;
    public dePm() {
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
         setResizable(false);
         table();
         mod.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        re = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        mod = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/product.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Details Produit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 53, 155, -1));

        a.setFont(new java.awt.Font("Andalus", 2, 20)); // NOI18N
        a.setText("Entrer la reference de produit");
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 117, 250, -1));

        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });
        re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reKeyReleased(evt);
            }
        });
        getContentPane().add(re, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 121, 228, -1));

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
        jScrollPane1.setViewportView(Table2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 192, 629, 180));

        mod.setFont(new java.awt.Font("Andalus", 2, 18)); // NOI18N
        mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/order.png"))); // NOI18N
        mod.setText("Modifier");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        getContentPane().add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 377, 140, -1));

        jButton1.setFont(new java.awt.Font("Andalus", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton1.setText("Ferme");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 377, 135, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        setSize(new java.awt.Dimension(900, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked

        mod.setVisible(true);
        re.setText(String.valueOf(Table2.getValueAt(Table2.getSelectedRow(),0)));
    }//GEN-LAST:event_Table2MouseClicked

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
 if (re.getText().equals("") ) {
   JOptionPane.showMessageDialog(this, "Selectionne le produit");
   }else{
        String en=re.getText();
        String no=String.valueOf(Table2.getValueAt(Table2.getSelectedRow(),1));
        String pr=String.valueOf(Table2.getValueAt(Table2.getSelectedRow(),2));
        String de=String.valueOf(Table2.getValueAt(Table2.getSelectedRow(),3));

        mdfProduit m=new mdfProduit (en,no,pr,de);
        m.setVisible(true);
        this.dispose();
 }
    }//GEN-LAST:event_modActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//         re.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        produit m=new produit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_reActionPerformed

    private void reKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reKeyReleased
        // TODO add your handling code here:
          if(a.getText().equals("Entrer la reference de produit")) {
                rs = db.SelectALL("produit", "reference LIKE '%" + re.getText() + "%' ");
                Table2.setModel(new datatable(rs){});
            }
    }//GEN-LAST:event_reKeyReleased

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
            java.util.logging.Logger.getLogger(dePm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dePm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dePm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dePm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dePm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JLabel a;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mod;
    private javax.swing.JTextField re;
    // End of variables declaration//GEN-END:variables
private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
