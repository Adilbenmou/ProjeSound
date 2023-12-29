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
public class deCm extends javax.swing.JFrame {

    /**
     * Creates new form deCm
     */
       ResultSet rs;
       dbcnx db;
    public deCm() {
         db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        setResizable(false);
        SetIcon();
        mode.setVisible(false);
        table();
    }
    
      public void table(){
            String t[]=
            {"cin","nom","prenom","tel","email","adress","sex"};
            rs=db.SelectSome(t,"client");
            Table1.setModel(new datatable(rs) {});
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        mode = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-details-64 (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Details Client");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 44, -1, -1));

        q.setBackground(new java.awt.Color(0, 0, 0));
        q.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        q.setText("Entrer la cin de client");
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 124, 200, -1));

        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cinKeyReleased(evt);
            }
        });
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 125, 254, -1));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 185, 660, 200));

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 397, 132, -1));

        mode.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/order.png"))); // NOI18N
        mode.setText("Modifier");
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });
        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 397, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, -1, -1));

        setSize(new java.awt.Dimension(900, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        cin.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cinActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        mode.setVisible(true);
        cin.setText(String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),0)));

    }//GEN-LAST:event_Table1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        client m=new client();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
   if (cin.getText().equals("") ) {
   JOptionPane.showMessageDialog(this, "Selectionne le client");
   }else{
        String cinid=cin.getText();
        String nomsend=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),1));
        String pren=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),2));
        String t=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),3));
        String em=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),4));
        String ad=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),5));
        String s=String.valueOf(Table1.getValueAt(Table1.getSelectedRow(),6));

        mdfclient m=new mdfclient(cinid,nomsend,pren,t,em,ad,s);
        m.setVisible(true);
        this.dispose();
   }
    }//GEN-LAST:event_modeActionPerformed

    private void cinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyReleased
        // TODO add your handling code here:
         if(q.getText().equals("Entrer la cin de client")) {
                rs = db.SelectALL("client", "cin LIKE '%" + cin.getText() + "%' ");
                Table1.setModel(new datatable(rs){});
            }
    }//GEN-LAST:event_cinKeyReleased

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
            java.util.logging.Logger.getLogger(deCm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deCm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deCm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deCm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deCm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTextField cin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mode;
    private javax.swing.JLabel q;
    // End of variables declaration//GEN-END:variables
private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
