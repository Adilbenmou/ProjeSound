/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database.parameter;
import static Database.parameter.IPHOST;
import Database.dbcnx;
import static java.awt.SystemColor.menu;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

public class MenuAdmin extends javax.swing.JFrame {

    dbcnx db; //pour la connection avec la base de donnees
    ResultSet rs; //contenir la requete
    String login,passs,typeacces; //donnee de la formulaire
    
    
    public MenuAdmin() {
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        SetIcon();
        setResizable(false);
        
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
        jButton2 = new javax.swing.JButton();
        conx = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        logi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usern = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton2.setText("Deconnexion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(506, 382, 190, 33);

        conx.setBackground(new java.awt.Color(255, 255, 255));
        conx.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        conx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/ente.png"))); // NOI18N
        conx.setText("Connexion");
        conx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conxActionPerformed(evt);
            }
        });
        getContentPane().add(conx);
        conx.setBounds(290, 382, 173, 33);

        Pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        getContentPane().add(Pass);
        Pass.setBounds(397, 292, 250, 30);

        logi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logiActionPerformed(evt);
            }
        });
        getContentPane().add(logi);
        logi.setBounds(397, 212, 250, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/shield.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 192, 140, 160);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mot de pass :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(234, 292, 145, 35);

        usern.setBackground(new java.awt.Color(0, 0, 0));
        usern.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        usern.setForeground(new java.awt.Color(255, 255, 255));
        usern.setText("Nom :");
        getContentPane().add(usern);
        usern.setBounds(234, 215, 70, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestion de fourinsseur");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(276, 122, 260, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gear (1).png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(379, 40, 64, 64);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/c235810c25cc4b138529332bfff45132.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-9, -10, 1010, 720);

        setSize(new java.awt.Dimension(778, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void conxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conxActionPerformed
        // TODO add your handling code here:
        
           if(logi.getText().equals("")  && Pass.getText().equals("")   ){
            JOptionPane.showMessageDialog(this,"champ vide");
        }
        else{
           
           rs=db.SelectALL("utilisateur"," Username ='"+logi.getText()+"' and Password ='"+Pass.getText()+"'");
           try{
               while(rs.next()){
            login=rs.getString("Username"); 
            passs=rs.getString("Password");
            typeacces=rs.getString("Type");
        }
              }
           catch (SQLException ex) {
                Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(login==null && passs==null){
           JOptionPane.showMessageDialog(this,"le nom utilisateur ou le mots de pass est incorrect");
       }
            else
            {
           if(typeacces.equals("admin")){
              ClientProduit u=new ClientProduit();
               u.setVisible(true);
               this.dispose();
           }
       }
            
    }
    }//GEN-LAST:event_conxActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton conx;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField logi;
    private javax.swing.JLabel usern;
    // End of variables declaration//GEN-END:variables

    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
