/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package swing;

import data.FileMatchController;
import di.uniba.map.b.adventure.Utils;
import di.uniba.map.b.adventure.games.GiocoNaufragioIsola;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import multimediali.Immagini;

/**
 * @author Giannantonio
 */
public class JDialogCaricaPartite extends JDialog {


    public JDialogCaricaPartite(final JFrame parent, final boolean modal, final FrameStart frame) {
        super(parent, modal);
        this.frameStart = frame;
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tastoConferma = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblErrore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(final java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        tastoConferma.setText("CONFERMA");
        tastoConferma.addActionListener(this::tastoConfermaActionPerformed);

        jComboBox1.setPreferredSize(new java.awt.Dimension(10, 24));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(final java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jLabel1.setText("Quale partita vuoi riprendere?");

        lblErrore.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(tastoConferma)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(76, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblErrore, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tastoConferma)
                                .addGap(18, 18, 18)
                                .addComponent(lblErrore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(null);

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void tastoConfermaActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_tastoConfermaActionPerformed
        String nomePartitaSelezionata = (String) jComboBox1.getSelectedItem();
        if (nomePartitaSelezionata == null) {
            lblErrore.setText("Nessuna partita selezionata");
            return;
        }
        FileMatchController f = new FileMatchController("salvataggioPartita.txt", "resources");
        try {
            GiocoNaufragioIsola partita = f.getMatch(nomePartitaSelezionata);
            String username = partita.getUsername();
            JFrameApp.setEngine(partita);
            JFrameApp frame = new JFrameApp(username, frameStart);
            frame.avvio();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        this.dispose();
    } //GEN-LAST:event_tastoConfermaActionPerformed

    private void formWindowOpened() { //GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon(Utils.PERCORSO_IMMAGINI_ICONE + "iconaGioco.png");
        Immagini.caricaImmagine(Utils.PERCORSO_IMMAGINI_MENU, "sfondo frame start", jPanel1);
        this.setIconImage(icon.getImage());
        FileMatchController f = new FileMatchController("salvataggioPartita.txt", "resources");
        try {
            List<GiocoNaufragioIsola> partite = f.getMatch();
            ListIterator<GiocoNaufragioIsola> lit = partite.listIterator();
            String[] comboBox = new String[200];
            int i = 0;
            while (lit.hasNext()) {
                String nomePartita = lit.next().getNomePartita();
                comboBox[i] = nomePartita;
                i++;
            }
            model[0] = new DefaultComboBoxModel(comboBox);
            jComboBox1.setModel(model[0]);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    } //GEN-LAST:event_formWindowOpened

    private void jComboBox1KeyPressed(final java.awt.event.KeyEvent evt) { //GEN-FIRST:event_jComboBox1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ActionEvent e = new ActionEvent(this, 1, "");
            tastoConfermaActionPerformed(e);
        }
    } //GEN-LAST:event_jComboBox1KeyPressed


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
            java.util.logging.Logger.getLogger(JDialogCaricaPartite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDialogCaricaPartite dialog = new JDialogCaricaPartite(new JFrame(), true, frameStart);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrore;
    private javax.swing.JButton tastoConferma;
    // End of variables declaration//GEN-END:variables
    private ComboBoxModel[] model = new ComboBoxModel[1];
    private FrameStart frameStart;
}
