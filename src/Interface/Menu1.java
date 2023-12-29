/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Toolkit;

/**
 *
 * @author hp
 */
public class Menu1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu1
     */
    public Menu1() {
        initComponents();
        SetIcon();
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        c = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion de Fournisseur ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(52, 16, 331, 34);

        a.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("%");
        getContentPane().add(a);
        a.setBounds(250, 240, 80, 40);

        c.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(c);
        c.setBounds(0, 290, 457, 13);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modules de chargement :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(15, 248, 229, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/supply-chain.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(195, 91, 64, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/foto/c235810c25cc4b138529332bfff45132.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-19, -10, 560, 350);

        setSize(new java.awt.Dimension(463, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
                   
                Menu1 j =new Menu1();
                j.setVisible(true);
           try{
           for(int i=0;i<=100;i++)
       {
            Thread.sleep(60);
            j.c.setValue(i);
            j.a.setText(Integer.toString(i)+"%");
    }
           }
           catch (Exception e){
    
      }
       new MenuAdmin().setVisible(true);
       j.dispose();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JProgressBar c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
 private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rating.png")));
    }
}
