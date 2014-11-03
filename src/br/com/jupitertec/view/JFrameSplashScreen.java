/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jupitertec.view;

import br.com.jupitertec.util.IconApplication;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Rafael
 */
public class JFrameSplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form JFrameSplashScreen
     */
    public JFrameSplashScreen() {
        initComponents();
        new IconApplication().setIcon(this);
        new Thread(){
        
            public void run(){
                
                for(int i = 0; i <101; i++){
                    
                    try {
                        
                        sleep(60);
                        
                        jProgressBarLoading.setValue(i);
                        
                        if(jProgressBarLoading.getValue() <= 15){
                        
                            jLabelTextLoading.setText("Carregando diretrizes");
                            
                        }else if (jProgressBarLoading.getValue() <= 30){
                        
                            jLabelTextLoading.setText("Carregando banco de dados");
                        
                        }else if (jProgressBarLoading.getValue() <= 45){
                        
                            jLabelTextLoading.setText("Eliminando os velhacos");
                        
                        }else if (jProgressBarLoading.getValue() <= 60){
                        
                            jLabelTextLoading.setText("Renderizando aplicação");
                        
                        }else if (jProgressBarLoading.getValue() <= 75){
                        
                            jLabelTextLoading.setText("Colocando os halteres no hack");
                        
                        }else if (jProgressBarLoading.getValue() <= 90){
                        
                            jLabelTextLoading.setText("Inicializando aplicação");
                        
                        }
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFrameSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
                
                      new MenuWindow().setVisible(true);
                      
                      dispose();
                
            }
        
        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBarLoading = new javax.swing.JProgressBar();
        jLabelTextLoading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jProgressBarLoading.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jProgressBarLoading.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBarLoading.setToolTipText("");
        jProgressBarLoading.setStringPainted(true);
        getContentPane().add(jProgressBarLoading);
        jProgressBarLoading.setBounds(10, 270, 380, 20);

        jLabelTextLoading.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelTextLoading.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextLoading.setText("Loanding...");
        getContentPane().add(jLabelTextLoading);
        jLabelTextLoading.setBounds(10, 10, 180, 13);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jupitertec/view/img/splash.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 303);

        setSize(new java.awt.Dimension(400, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
           javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

           // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTextLoading;
    private javax.swing.JProgressBar jProgressBarLoading;
    // End of variables declaration//GEN-END:variables


}
