/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        girişEkranıPanel.setFocusable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        girişEkranıPanel = new javax.swing.JPanel();
        xoşGəlmisinizMesajıLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        şifrəText = new javax.swing.JPasswordField();
        girişButton = new javax.swing.JButton();
        sualLabel = new javax.swing.JLabel();
        qeydiyyatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girişEkranıPanel.setBackground(new java.awt.Color(204, 255, 204));

        xoşGəlmisinizMesajıLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        xoşGəlmisinizMesajıLabel.setForeground(new java.awt.Color(255, 51, 51));
        xoşGəlmisinizMesajıLabel.setText("Welcome to VTP");

        idText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idText.setForeground(new java.awt.Color(102, 102, 102));
        idText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTextFocusLost(evt);
            }
        });

        şifrəText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        şifrəText.setForeground(new java.awt.Color(102, 102, 102));
        şifrəText.setText("jPasswordField1");
        şifrəText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                şifrəTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                şifrəTextFocusLost(evt);
            }
        });
        şifrəText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                şifrəTextActionPerformed(evt);
            }
        });

        girişButton.setBackground(new java.awt.Color(255, 204, 204));
        girişButton.setText("Giriş");
        girişButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girişButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girişButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girişButtonMouseExited(evt);
            }
        });
        girişButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girişButtonActionPerformed(evt);
            }
        });

        sualLabel.setBackground(new java.awt.Color(0, 0, 0));
        sualLabel.setText("Hələdə qeydiyyatdan keçməmisiniz?");

        qeydiyyatButton.setBackground(new java.awt.Color(153, 255, 153));
        qeydiyyatButton.setText("Qeydiyyat");
        qeydiyyatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        qeydiyyatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                qeydiyyatButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                qeydiyyatButtonMouseExited(evt);
            }
        });
        qeydiyyatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qeydiyyatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout girişEkranıPanelLayout = new javax.swing.GroupLayout(girişEkranıPanel);
        girişEkranıPanel.setLayout(girişEkranıPanelLayout);
        girişEkranıPanelLayout.setHorizontalGroup(
            girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girişEkranıPanelLayout.createSequentialGroup()
                .addGroup(girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(girişEkranıPanelLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(şifrəText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(girişEkranıPanelLayout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(girişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girişEkranıPanelLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sualLabel)
                            .addGap(28, 28, 28)
                            .addComponent(qeydiyyatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girişEkranıPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xoşGəlmisinizMesajıLabel)
                .addGap(294, 294, 294))
        );

        girişEkranıPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idText, şifrəText});

        girişEkranıPanelLayout.setVerticalGroup(
            girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girişEkranıPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(xoşGəlmisinizMesajıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(şifrəText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(girişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(girişEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qeydiyyatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        girişEkranıPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idText, şifrəText});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girişEkranıPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(girişEkranıPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusGained
       
    }//GEN-LAST:event_idTextFocusGained

    private void idTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusLost
       
    }//GEN-LAST:event_idTextFocusLost

    private void şifrəTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifrəTextFocusGained
       
    }//GEN-LAST:event_şifrəTextFocusGained

    private void şifrəTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifrəTextFocusLost
       
    }//GEN-LAST:event_şifrəTextFocusLost

    private void şifrəTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_şifrəTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_şifrəTextActionPerformed

    private void girişButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girişButtonMouseEntered
        
    }//GEN-LAST:event_girişButtonMouseEntered

    private void girişButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girişButtonMouseExited
       
    }//GEN-LAST:event_girişButtonMouseExited

    private void qeydiyyatButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qeydiyyatButtonMouseEntered
        
    }//GEN-LAST:event_qeydiyyatButtonMouseEntered

    private void qeydiyyatButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qeydiyyatButtonMouseExited
        
    }//GEN-LAST:event_qeydiyyatButtonMouseExited

    private void qeydiyyatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qeydiyyatButtonActionPerformed
        this.setVisible(false);
        new Qeydiyyat().setVisible(true);
    }//GEN-LAST:event_qeydiyyatButtonActionPerformed

    private void girişButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girişButtonActionPerformed
        this.setVisible(false);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_girişButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girişButton;
    private javax.swing.JPanel girişEkranıPanel;
    private javax.swing.JTextField idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton qeydiyyatButton;
    private javax.swing.JLabel sualLabel;
    private javax.swing.JLabel xoşGəlmisinizMesajıLabel;
    private javax.swing.JPasswordField şifrəText;
    // End of variables declaration//GEN-END:variables
}
