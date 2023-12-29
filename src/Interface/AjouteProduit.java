/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.dbcnx;
import Database.parameter;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class AjouteProduit extends javax.swing.JFrame {

    
    dbcnx db;
    public AjouteProduit() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel1.setText("Reference");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/add-to-basket.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Andalus", 2, 25)); // NOI18N
        jLabel4.setText("Nouveau Produit");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 61, 192, -1));
        getContentPane().add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 190, -1));

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel5.setText("Prix");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel7.setText("Nom Produit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 190, -1));

        prix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixKeyTyped(evt);
            }
        });
        getContentPane().add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, -1));

        desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descKeyTyped(evt);
            }
        });
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 190, -1));

        jButton1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/refresh.png"))); // NOI18N
        jButton1.setText("Actualiser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 365, 151, -1));

        jButton2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/diskette.png"))); // NOI18N
        jButton2.setText("Sauvegarder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 365, 160, -1));

        jButton3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton3.setText("Fermer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 420, 130, -1));

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel8.setText("DH");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 236, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 1010, -1));

        setSize(new java.awt.Dimension(712, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        produit m=new produit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(ref.getText().equals("") || nom.getText().equals("") || prix.getText().equals("") || desc.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"champ vide");
        }else{
            String[] colon=
            {"reference","nom_produit","prix","description"};
            String[] inf={ref.getText(),nom.getText(),prix.getText(),desc.getText()};
            System.out.println(db.Insertdata("produit",colon,inf));
            JOptionPane.showMessageDialog(this,"le produit est ajoute");

            actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void prixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixKeyTyped
        // TODO add your handling code here:
                 char car =evt.getKeyChar();
        if((car<'0' || car >'9') && prix.getText().contains(".") &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
//        JOptionPane.showInputDialog(null,"seuls les numéros sont autorisés","valider les numéros",JOptionPane.INFORMATION_MESSAGE);
        
       
    }else if((car<'0' || car >'9') &&(car!='.') 
            &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
//        JOptionPane.showMessageDialog(null,"seuls les numéros sont autorisés","valider les numéros",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_prixKeyTyped

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        // TODO add your handling code here:
          char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z')  && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_nomKeyTyped

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descKeyTyped
        // TODO add your handling code here:
                  char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z')  &&(car!=',') &&(car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_descKeyTyped

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
            java.util.logging.Logger.getLogger(AjouteProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouteProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouteProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouteProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouteProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
