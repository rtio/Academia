/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jupitertec.view.util;
import de.humatic.dsj.DSCapture;
import de.humatic.dsj.DSEnvironment;
import de.humatic.dsj.DSFilterInfo;
import de.humatic.dsj.DSFiltergraph;
import de.humatic.dsj.DSJException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafael
 */
public class JDialogCam extends javax.swing.JDialog {
    private static DSCapture player;
    private BufferedImage frame;
    /**
     * Creates new form Cam
     */
    public JDialogCam(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciarWebCam();
        setLocationRelativeTo(null);
        jPanelPlayer.setSize(354,472);
        jPanelPlayer.add(player.asComponent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCor = new javax.swing.JPanel();
        jPanelPlayer = new javax.swing.JPanel();
        jButtonCapture = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonTryAgain = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setTitle("Capturar Foto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelCor.setBackground(new java.awt.Color(255, 255, 255));

        jPanelPlayer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlayer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(214, 214, 214)));
        jPanelPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelPlayer.setMaximumSize(new java.awt.Dimension(354, 472));
        jPanelPlayer.setMinimumSize(new java.awt.Dimension(354, 472));
        jPanelPlayer.setPreferredSize(new java.awt.Dimension(354, 472));

        javax.swing.GroupLayout jPanelPlayerLayout = new javax.swing.GroupLayout(jPanelPlayer);
        jPanelPlayer.setLayout(jPanelPlayerLayout);
        jPanelPlayerLayout.setHorizontalGroup(
            jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        jPanelPlayerLayout.setVerticalGroup(
            jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jButtonCapture.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCapture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCapture.setText("Capturar");
        jButtonCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaptureActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSave.setText("Ok, ficou bom!");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonTryAgain.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTryAgain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonTryAgain.setText("Tentar novamente");
        jButtonTryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTryAgainActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancel.setText("Deixa pra lá");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCorLayout = new javax.swing.GroupLayout(jPanelCor);
        jPanelCor.setLayout(jPanelCorLayout);
        jPanelCorLayout.setHorizontalGroup(
            jPanelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTryAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCapture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCorLayout.setVerticalGroup(
            jPanelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCorLayout.createSequentialGroup()
                        .addComponent(jButtonCapture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTryAgain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addGap(366, 366, 366))
                    .addGroup(jPanelCorLayout.createSequentialGroup()
                        .addComponent(jPanelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaptureActionPerformed
        jButtonTryAgain.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonCapture.setEnabled(false);
        try {
            player.stop();
        } catch (DSJException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        frame = player.getImage();
	
    }//GEN-LAST:event_jButtonCaptureActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String path = "Fotos\\1.png";
        
        if (!System.getProperty("os.name").contains("Windows")) {

            path = path.replace("\\", "//");

        }
        
        File photoPath = new File(path);
        
        frame = resizeFoto(frame, 0, 0, 354, 472);
        
        salvarFoto(frame, photoPath);
        
        try {
            player.stop();
        } catch (DSJException e) {
            JOptionPane.showMessageDialog(null, e);
        }

       dispose();
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonTryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTryAgainActionPerformed
        jButtonTryAgain.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonCapture.setEnabled(true);
        frame = null;
        jButtonCapture.grabFocus();
        try{
            player.play();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonTryAgainActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
       try {
            player.stop();
        } catch (DSJException e) { 
            JOptionPane.showMessageDialog(null, e);
        }
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jButtonTryAgain.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonCapture.setEnabled(true);
        try {
            player.play();
        } catch (DSJException e) {
            player.stop();
        }
        jButtonCapture.grabFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        try{
            player.stop();
        }catch(DSJException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonCapture.grabFocus();
    }//GEN-LAST:event_formWindowOpened
    
    public static void iniciarWebCam(){
      
        
        try {
            
            File f;
            
            switch (System.getProperty("os.arch")) {
                case "amd64":
                    
                    String path64 = "lib\\dsj_x64.dll";
                    
                    if (!System.getProperty("os.name").contains("Windows")) {

                        path64 = path64.replace("\\", "//");

                    }
                    f = new File(path64);
                    
                    break;

                case "x86":
                    
                    String path32 = "lib\\dsj_x86.dll";
                    
                   if (!System.getProperty("os.name").contains("Windows")) {

                        path32 = path32.replace("\\", "//");

                    }
                    
                    f = new File(path32);
                    break;

                default:
                    
                    f = new File("lib\\dsj_x64.dll");

            }
            
            DSFilterInfo[][] dsi = null;
            
            try {
                if(f.exists())
                    
                    DSEnvironment.setDLLPath(f.getAbsoluteFile().toString());
                
                 dsi = DSCapture.queryDevices();
                 
            } catch (UnsatisfiedLinkError u) {
                
                JOptionPane.showMessageDialog(null, "O Arquivo \"dsj.dll\" Não Foi Encontrado Em\n"+f.getAbsolutePath().replace("\\dsj.dll", ""),
                                                    "Atenção", JOptionPane.ERROR_MESSAGE);
                
            }
            if(dsi[0][0].getName().equalsIgnoreCase("PC Camera"))
                
                dsi[0][0].setPreferredFormat(2);
            
            player = new DSCapture(DSFiltergraph.DD7, dsi[0][0], false, DSFilterInfo.doNotRender(), null);

            player.setSize(640, 480);

            player.stop();
            
        } catch (DSJException e) {
            
            JOptionPane.showMessageDialog(null, "Não Foi Possível Iniciar a WebCam. Possíveis Causas:"
                                                + "\n- O Aplicativo Já Esta Sendo Executado (Gerenciador de Tarefas -> Processos -> javaw.exe)"
                                                + "\n- A WebCam Está Desconectada"
                                                + "\n- O Windows Não Reconheceu a WebCam",
                                                "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     /**
     * Retorna o frame capturado
     * @return BufferedImage
     */
    public BufferedImage getFoto() {
        return frame;
    }
    
        /**
     * Redimensiona a foto
     * @param foto
     * @param x
     * @param y
     * @param w
     * @param h
     * @return Image
     */
    public static BufferedImage resizeFoto(BufferedImage foto, int x, int y, int w, int h){
        return foto.getSubimage(x, y, w, h);
    }

    /**
     * Salva a foto e retorna o caminho
     * @param foto
     * @param tipo
     * @return String
     */
    public static void salvarFoto(BufferedImage foto, File path){
        try {
            if(!path.exists())
                path.mkdirs();
            ImageIO.write(foto, "PNG", path);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCam dialog = new JDialogCam(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCapture;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonTryAgain;
    private javax.swing.JPanel jPanelCor;
    private javax.swing.JPanel jPanelPlayer;
    // End of variables declaration//GEN-END:variables

}
