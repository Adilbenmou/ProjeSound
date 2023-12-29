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
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class suppProduit extends javax.swing.JFrame {

    /**
     * Creates new form suppProduit
     */
    dbcnx db;
    
    String en;
    String no;
    String pr;
    String de ;
 
    public suppProduit(String en,String no,String pr,String de) {
        this.en=en;
        this.no=no;
        this.pr=pr;
        this.de=de;
        
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        ref.setText(en);   
        nom.setText(no); 
        prix.setText(pr);
        desc.setText(de);   
        
    }
    
    public suppProduit() {
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        setResizable(false);
        SetIcon();
    }
     
       public void actualiser(){
        ref.setText("");
        nom.setText("");
        prix.setText("");
        desc.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        ref = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(144, 336, 117, 35);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel7.setText("Nom Produit");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(144, 248, 126, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/shopping-basket.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 40, 85, 72);
        getContentPane().add(nom);
        nom.setBounds(307, 248, 190, 26);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Supprimer Produit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 60, 198, 35);
        getContentPane().add(prix);
        prix.setBounds(307, 292, 150, 26);

        jButton1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/trash.png"))); // NOI18N
        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(246, 405, 150, 37);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel4.setText("Reference");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(144, 195, 99, 35);
        getContentPane().add(desc);
        desc.setBounds(307, 336, 190, 26);

        jButton4.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton4.setText("Fermer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(339, 460, 130, 37);

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel8.setText("DH");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(463, 292, 30, 26);

        jButton5.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/refresh.png"))); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(407, 405, 150, 37);

        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        getContentPane().add(ref);
        ref.setBounds(307, 201, 190, 26);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel5.setText("Prix");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(144, 292, 41, 35);

        jButton2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton2.setText("Selectionne");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(347, 140, 140, 37);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel3.setText("Selectionner un produit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(116, 140, 230, 32);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-19, -10, 740, 600);

        setSize(new java.awt.Dimension(712, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        produit m=new produit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dePs m=new dePs();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

if (ref.getText().equals("") || nom.getText().equals("") || prix.getText().equals("") || desc.getText().equals("") ) {
 JOptionPane.showMessageDialog(this, "Remplir tous les champs");
 } else{
         String ids=String.valueOf(en.toString());
        if(JOptionPane.showConfirmDialog(this,"etes-vous sur de vouloir supprimer","attention!",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
           System.out.println(db.DeleteData(" produit "," reference = '"+ids+"'"));
        }else{return;}
        actualiser();
                            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         ref.setEditable(false);
         nom.setEditable(false);
         prix.setEditable(false);
         desc.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refActionPerformed

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
            java.util.logging.Logger.getLogger(suppProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suppProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suppProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suppProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suppProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField ref;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
