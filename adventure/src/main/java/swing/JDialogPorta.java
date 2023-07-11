/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package swing;

import multimediali.Suono;
import di.uniba.map.b.adventure.Utils;
import di.uniba.map.b.adventure.games.GiocoNaufragioIsola;
import di.uniba.map.b.adventure.messaggi.MessaggioEdificioFuori;
import di.uniba.map.b.adventure.type.Stanza;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Giannantonio
 */
public class JDialogPorta extends javax.swing.JDialog {
    private final GiocoNaufragioIsola GNI;


    public JDialogPorta(final java.awt.Frame parent, final boolean modal, final GiocoNaufragioIsola gni) {
        super(parent, modal);
        initComponents();
        this.GNI = gni;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        txtCodice = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnConferma = new javax.swing.JButton();
        btnCancella = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelErrore = new javax.swing.JPanel();
        lblErrore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(final java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        txtCodice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(final java.awt.event.KeyEvent evt) {
                txtCodiceKeyPressed(evt);
            }

            public void keyReleased(final java.awt.event.KeyEvent evt) {
                txtCodiceKeyReleased();
            }
        });
        jButton1.setText("1");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jButton2.setText("2");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jButton3.setText("3");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jButton4.setText("4");
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jButton5.setText("5");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jButton6.setText("6");
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jButton7.setText("8");
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jButton8.setText("7");
        jButton8.addActionListener(this::jButton8ActionPerformed);
        jButton9.setText("9");
        jButton9.addActionListener(this::jButton9ActionPerformed);



        btnConferma.setBackground(new java.awt.Color(153, 255, 153));
        btnConferma.setText("CONFERMA");
        btnConferma.addActionListener(this::btnConfermaActionPerformed);

        btnCancella.setBackground(new java.awt.Color(255, 102, 102));
        btnCancella.setText("CANCELLA");
        btnCancella.addActionListener(this::btnCancellaActionPerformed);

        panelErrore.setBackground(new java.awt.Color(255, 102, 102));
        panelErrore.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblErrore.setBackground(new java.awt.Color(255, 255, 255));
        lblErrore.setToolTipText("");

        javax.swing.GroupLayout panelErroreLayout = new javax.swing.GroupLayout(panelErrore);
        panelErrore.setLayout(panelErroreLayout);
        panelErroreLayout.setHorizontalGroup(
                panelErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelErroreLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblErrore, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelErroreLayout.setVerticalGroup(
                panelErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelErroreLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblErrore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(btnConferma)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCancella))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(panelErrore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txtCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5)
                                        .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton7)
                                        .addComponent(jButton9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnConferma)
                                        .addComponent(btnCancella))
                                .addGap(56, 56, 56)
                                .addComponent(panelErrore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton8ActionPerformed
        txtCodice.setText(txtCodice.getText() + "7");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);

    } //GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton9ActionPerformed
        txtCodice.setText(txtCodice.getText() + "9");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton9ActionPerformed

    private void btnConfermaActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btnConfermaActionPerformed
        String codice = txtCodice.getText();
        if (codice.equalsIgnoreCase("2538")) {
            lblErrore.setText("CODICE CORRETTO");
            GNI.setStanzaCorrente(GNI.getStanzaCorrente().getNord());
            Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + GNI.getStanzaCorrente().getNomeStanza(), true);
            Stanza edificioDentro = GNI.getStanzaCorrente();
            edificioDentro.setRaggiungibile(true);
            edificioDentro.setVisitata(true);
            edificioDentro.setVisibile(true);
            GNI.getStanza("edificio esterno").setMessaggioNord(MessaggioEdificioFuori.getNord());
            this.dispose();
        } else {
            panelErrore.setVisible(true);
            lblErrore.setText("CODICE ERRATO");
        }
    } //GEN-LAST:event_btnConfermaActionPerformed

    private void btnCancellaActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btnCancellaActionPerformed
        txtCodice.setText("");
    } //GEN-LAST:event_btnCancellaActionPerformed

    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
        txtCodice.setText(txtCodice.getText() + "1");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton2ActionPerformed
        txtCodice.setText(txtCodice.getText() + "2");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton3ActionPerformed
        txtCodice.setText(txtCodice.getText() + "3");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton4ActionPerformed
        txtCodice.setText(txtCodice.getText() + "4");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton5ActionPerformed
        txtCodice.setText(txtCodice.getText() + "5");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton6ActionPerformed
        txtCodice.setText(txtCodice.getText() + "6");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton7ActionPerformed
        txtCodice.setText(txtCodice.getText() + "8");
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + "bip", false);
    } //GEN-LAST:event_jButton7ActionPerformed

    private void formWindowOpened() { //GEN-FIRST:event_formWindowOpened
        try {
            panelErrore.setVisible(false);
            String percorso;
            percorso = Utils.PERCORSO_IMMAGINI_STANZE + "porta.png";
            BufferedImage img = ImageIO.read(new File(percorso));
            Image dimg = img.getScaledInstance(jPanel1.getWidth(), jPanel1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            jPanel1.setBackground(new Color(0, 0, 0, 0));
            jPanel1.setOpaque(false);
            jPanel1.setBorder(BorderFactory.createEmptyBorder());
            jPanel1.setLayout(new BorderLayout());
            JLabel background;
            background = new JLabel(imageIcon);
            jPanel1.add(background);
            background.setLayout(new FlowLayout());
            jPanel1.revalidate();
            jPanel1.repaint();
            txtCodice.setEditable(false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } //GEN-LAST:event_formWindowOpened

    private void txtCodiceKeyReleased() { //GEN-FIRST:event_txtCodiceKeyReleased

    } //GEN-LAST:event_txtCodiceKeyReleased

    private void txtCodiceKeyPressed(final java.awt.event.KeyEvent evt) { //GEN-FIRST:event_txtCodiceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ActionEvent e = new ActionEvent(this, 1, "");
            btnConfermaActionPerformed(e);
        }
    } //GEN-LAST:event_txtCodiceKeyPressed


    public void avvia() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDialogPorta dialog = new JDialogPorta(new JFrame(), true, GNI);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(final java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnConferma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrore;
    private javax.swing.JPanel panelErrore;
    private javax.swing.JTextField txtCodice;
    // End of variables declaration//GEN-END:variables
}
