/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jupitertec.view.financial;

import static java.lang.String.format;
import static java.lang.String.format;
import static java.lang.String.format;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class JDialogNewModality extends javax.swing.JDialog {

    private void sumValue() {

        try {

            NumberFormat format = NumberFormat.getNumberInstance();
            NumberFormat format2 = NumberFormat.getCurrencyInstance();
            if (!jFormattedTextFieldValue.getText().isEmpty()) {
                
                Number parse = (Number) format.parse(jFormattedTextFieldValue.getText());

                Double parseDoub = parse.doubleValue();

                switch (jComboBoxPayment.getSelectedItem().toString()) {
                    case "Mensal":
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    case "Bimestral":
                        parseDoub *= 2;
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    case "Trimestral":
                        parseDoub *= 3;
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    case "Semestral":
                        parseDoub *= 6;
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    case "Anual":
                        parseDoub *= 12;
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    case "Livre":
                        Integer num = (Integer) jSpinnerX.getValue();
                        parseDoub *= num;
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                        break;
                    default:
                        jLabelTotalValue.setText("Total: R$ " + format2.format(parseDoub));
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(JDialogNewModality.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * Creates new form JDialogNewModality
     */
    public JDialogNewModality(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jLabelX.setVisible(false);
        jSpinnerX.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPaneNewModality = new javax.swing.JLayeredPane();
        jLabelModality = new javax.swing.JLabel();
        jTextFieldNewModality = new javax.swing.JTextField();
        jLabelPayment = new javax.swing.JLabel();
        jComboBoxPayment = new javax.swing.JComboBox();
        jSpinnerX = new javax.swing.JSpinner();
        jLabelX = new javax.swing.JLabel();
        jLabelValue = new javax.swing.JLabel();
        jFormattedTextFieldValue = new javax.swing.JFormattedTextField();
        jLabelTotalValue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modalidade");
        setResizable(false);

        jLayeredPaneNewModality.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nova/Alterar modalidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jLayeredPaneNewModality.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelModality.setText("Modalidade:");
        jLayeredPaneNewModality.add(jLabelModality, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, -1, -1));
        jLayeredPaneNewModality.add(jTextFieldNewModality, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 344, -1));

        jLabelPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPayment.setText("Pagamento:");
        jLayeredPaneNewModality.add(jLabelPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 66, -1, -1));

        jComboBoxPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxPayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mensal", "Bimestral", "Trimestral", "Semestral", "Anual", "Livre" }));
        jComboBoxPayment.setToolTipText("Selecione uma forma de pagamento");
        jComboBoxPayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPaymentItemStateChanged(evt);
            }
        });
        jLayeredPaneNewModality.add(jComboBoxPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, -1, -1));

        jSpinnerX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerXStateChanged(evt);
            }
        });
        jLayeredPaneNewModality.add(jSpinnerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 88, 38, -1));

        jLabelX.setText("Nº vezes:");
        jLayeredPaneNewModality.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 67, -1, -1));

        jLabelValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelValue.setText("Valor:");
        jLayeredPaneNewModality.add(jLabelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 114, -1, -1));

        jFormattedTextFieldValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(  new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jFormattedTextFieldValue.setToolTipText("Digite o valor da forma de pagamento");
        jFormattedTextFieldValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldValueMouseClicked(evt);
            }
        });
        jFormattedTextFieldValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldValueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldValueFocusLost(evt);
            }
        });
        jFormattedTextFieldValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldValueKeyTyped(evt);
            }
        });
        jLayeredPaneNewModality.add(jFormattedTextFieldValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 135, 66, -1));

        jLabelTotalValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotalValue.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTotalValue.setText("Total: R$ ");
        jLayeredPaneNewModality.add(jLabelTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 161, -1, -1));

        jButton1.setText("Salvar");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPaneNewModality, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPaneNewModality, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPaymentItemStateChanged
        if (jComboBoxPayment.getSelectedItem().equals("Livre")) {
            jLabelX.setVisible(true);
            jSpinnerX.setVisible(true);
        } else {
            jLabelX.setVisible(false);
            jSpinnerX.setVisible(false);
        }
        
        sumValue();
    }//GEN-LAST:event_jComboBoxPaymentItemStateChanged

    private void jFormattedTextFieldValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValueKeyTyped
       sumValue();
                
    }//GEN-LAST:event_jFormattedTextFieldValueKeyTyped

    private void jFormattedTextFieldValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValueFocusLost
       sumValue();
    }//GEN-LAST:event_jFormattedTextFieldValueFocusLost

    private void jFormattedTextFieldValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValueFocusGained
        sumValue();
    }//GEN-LAST:event_jFormattedTextFieldValueFocusGained

    private void jSpinnerXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerXStateChanged
       sumValue();
    }//GEN-LAST:event_jSpinnerXStateChanged

    private void jFormattedTextFieldValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValueMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogNewModality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogNewModality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogNewModality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogNewModality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogNewModality dialog = new JDialogNewModality(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxPayment;
    private javax.swing.JFormattedTextField jFormattedTextFieldValue;
    private javax.swing.JLabel jLabelModality;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelTotalValue;
    private javax.swing.JLabel jLabelValue;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLayeredPane jLayeredPaneNewModality;
    private javax.swing.JSpinner jSpinnerX;
    private javax.swing.JTextField jTextFieldNewModality;
    // End of variables declaration//GEN-END:variables
}
