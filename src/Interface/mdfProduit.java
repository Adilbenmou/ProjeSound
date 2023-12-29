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
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class mdfProduit extends javax.swing.JFrame {

    /**
     * Creates new form mdfProduit
     */
    
    dbcnx db;
    String en;
    String no;
    String pr;
    String de ;
 
    public mdfProduit(String en,String no,String pr,String de) {
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
    
    public mdfProduit() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/modification.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(237, 40, 64, 64);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Modifier Produit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(331, 60, 166, 35);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel3.setText("Selectionner un produit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(116, 140, 230, 32);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel4.setText("Reference");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(147, 192, 99, 35);

        desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descKeyTyped(evt);
            }
        });
        getContentPane().add(desc);
        desc.setBounds(310, 333, 190, 26);

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jLabel8.setText("DH");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(466, 289, 30, 26);
        getContentPane().add(ref);
        ref.setBounds(310, 198, 190, 26);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel5.setText("Prix");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(147, 289, 41, 35);

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(147, 333, 117, 35);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel7.setText("Nom Produit");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(147, 245, 126, 35);

        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom);
        nom.setBounds(310, 245, 190, 26);

        prix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixKeyTyped(evt);
            }
        });
        getContentPane().add(prix);
        prix.setBounds(310, 289, 150, 26);

        jButton1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/order.png"))); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(253, 402, 139, 37);

        jButton4.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton4.setText("Fermer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(348, 455, 128, 37);

        jButton5.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/refresh.png"))); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(424, 402, 140, 37);

        jButton2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton2.setText("Selectionne");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(347, 140, 140, 37);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-9, -20, 770, 600);

        setSize(new java.awt.Dimension(712, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        produit m=new produit();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dePm m=new dePm();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
 if (ref.getText().equals("") || nom.getText().equals("") || prix.getText().equals("") || desc.getText().equals("") ) {
 JOptionPane.showMessageDialog(this, "Remplir tous les champs");
 } 
                 else {
String[] colon = {"reference","nom_produit","prix","description"};
 String[] inf = {ref.getText(), nom.getText(), prix.getText(), desc.getText()};
String idm = String.valueOf(en.toString());
db.Updatedata("client", colon, inf, "cin='" + idm + "'");
System.out.println(db.Updatedata("produit", colon, inf, "reference='" + idm + "'"));
 JOptionPane.showMessageDialog(this, "le produit est modifié");
actualiser(); 
        }
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
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_nomKeyTyped

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
            java.util.logging.Logger.getLogger(mdfProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdfProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdfProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdfProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdfProduit().setVisible(true);
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
