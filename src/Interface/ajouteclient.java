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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ajouteclient extends javax.swing.JFrame {

    dbcnx db;
    public ajouteclient() {
        db=new dbcnx(new parameter().HOST_DB,new parameter().USERNAME_DB,new parameter().PASSWORD_DB,new parameter().IPHOST,new parameter().PORT);
        initComponents();
        setResizable(false);
        SetIcon();
    }
    
      public void actualiser(){
        cin.setText("");
        nom.setText("");
        prenomm.setText("");
        teel.setText("");
        add.setText("");
        sss.setSelectedIndex(1); 
        emmai.setText("");
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenomm = new javax.swing.JTextField();
        teel = new javax.swing.JTextField();
        emmai = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sss = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        di = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel2.setText("Cin ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(129, 125, 41, 35);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel3.setText("Nom");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(129, 175, 47, 35);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel4.setText("Prenom");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(129, 215, 77, 35);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel5.setText("Tel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(129, 265, 30, 35);

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(129, 315, 56, 35);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel7.setText("Adress");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(129, 365, 65, 35);

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 22)); // NOI18N
        jLabel8.setText("Sex");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(129, 415, 34, 35);

        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinKeyTyped(evt);
            }
        });
        getContentPane().add(cin);
        cin.setBounds(299, 125, 178, 26);

        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom);
        nom.setBounds(299, 175, 178, 26);

        prenomm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prenommKeyTyped(evt);
            }
        });
        getContentPane().add(prenomm);
        prenomm.setBounds(299, 225, 178, 26);

        teel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                teelFocusLost(evt);
            }
        });
        teel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teelKeyTyped(evt);
            }
        });
        getContentPane().add(teel);
        teel.setBounds(357, 275, 120, 26);

        emmai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emmaiFocusLost(evt);
            }
        });
        getContentPane().add(emmai);
        emmai.setBounds(299, 325, 178, 26);
        getContentPane().add(add);
        add.setBounds(299, 375, 178, 26);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Andalus", 2, 25)); // NOI18N
        jLabel9.setText("Nouveau Client");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 46, 170, 39);

        sss.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femme", "Homme" }));
        sss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sssActionPerformed(evt);
            }
        });
        getContentPane().add(sss);
        sss.setBounds(299, 425, 178, 26);

        jButton1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/diskette.png"))); // NOI18N
        jButton1.setText("Sauvegarder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(175, 501, 160, 37);

        jButton2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/refresh.png"))); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(351, 501, 162, 37);

        jButton3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/close.png"))); // NOI18N
        jButton3.setText("Fermer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(283, 564, 140, 37);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/icons8-add-administrator-50.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 16, 90, 100);

        di.setText("+212");
        getContentPane().add(di);
        di.setBounds(299, 275, 49, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/gvff3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-9, -10, 710, 710);

        setSize(new java.awt.Dimension(692, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        
          if(cin.getText().equals("") || nom.getText().equals("") || prenomm.getText().equals("") || teel.getText().equals("") || emmai.getText().equals("") || add.getText().equals("") || sss.getSelectedItem().equals("") ){
            JOptionPane.showMessageDialog(this,"champ vide");
           
        }else{
            String[] colon=
              {"cin","nom","prenom","tel","email","adress","sex"};
            String[] inf={cin.getText(),nom.getText(),prenomm.getText(),teel.getText(),emmai.getText(),add.getText(),String.valueOf(sss.getSelectedItem())};
              System.out.println(db.Insertdata("client",colon,inf));
              JOptionPane.showMessageDialog(this,"le client est ajoute");
              
              actualiser();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        client m=new client();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sssActionPerformed

    private void teelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teelKeyTyped

           char car =evt.getKeyChar();
        if((car<'0' || car >'9' )&& teel.getText().contains("") &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        
       
    }else if((car<'0' || car >'9') &&(car!='.') 
            &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
    }
        
                              String mobileNo=teel.getText();
        if(mobileNo.matches("^[0-9]*$")&& mobileNo.length()>9)
        {
 JOptionPane.showMessageDialog(null,"Vérifiez votre numéro de téléphone","valider le numéro",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_teelKeyTyped

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        // TODO add your handling code here:
          char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
//            JOptionPane.showMessageDialog(null,"seul le texte est autorisé","valider le texte",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_nomKeyTyped

    private void prenommKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenommKeyTyped
        // TODO add your handling code here:
          char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_prenommKeyTyped

    
       public boolean adil(String email){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(email);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    private void emmaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emmaiFocusLost
        // TODO add your handling code here:
          if(adil(emmai.getText())){
                
        }else{
                JOptionPane.showMessageDialog(null,"e-mail incorrect","valider le email",JOptionPane.INFORMATION_MESSAGE);

        }
          
          //            JOptionPane.showConfirmDialog(null,"Mauvaise adresse email","valider le email",JOptionPane.INFORMATION_MESSAGE);
//            h.requestFocus();
//        }
    }//GEN-LAST:event_emmaiFocusLost

    private void teelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teelKeyPressed
        // TODO add your handling code here:
//          String phoneNumber=teel.getText();
//        int length =phoneNumber.length();
//          if(length < 10){
//                teel.setEditable(true);
//            }else{
//                teel.setEditable(false);
//            }
                 
                  
    }//GEN-LAST:event_teelKeyPressed

    private void cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyTyped
        // TODO add your handling code here:
                   char car = evt.getKeyChar();
        if ((car<'a'||car>'z')&& (car<'A'||car>'Z') && (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           
               
        if((car<'0' || car >'9') && cin.getText().contains("") &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        
    }else if((car<'0' || car >'9') &&(car!='.') 
            &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
    }
        }
    }//GEN-LAST:event_cinKeyTyped

    private void teelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_teelFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
          di.setEditable(false);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ajouteclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouteclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouteclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouteclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouteclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField di;
    private javax.swing.JTextField emmai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenomm;
    javax.swing.JComboBox sss;
    private javax.swing.JTextField teel;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
