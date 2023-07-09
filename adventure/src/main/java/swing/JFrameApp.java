/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import multimediali.Suono;
import di.uniba.map.b.adventure.Engine;
import di.uniba.map.b.adventure.GameDescription;
import di.uniba.map.b.adventure.Utils;
import di.uniba.map.b.adventure.games.GiocoNaufragioIsola;
import di.uniba.map.b.adventure.parser.Parser;
import di.uniba.map.b.adventure.parser.ParserOutput;
import thread.ThreadTempo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author Giannantonio
 */
public class JFrameApp extends javax.swing.JFrame {


    public JFrameApp(String username, FrameStart frame) {
        this.username = username;
        this.frameStart = frame;
        initComponents();        
    }
    /*
    public JFrameApp(String username) {
        numJframeApp++;
        this.username = username;
        initComponents();        
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();
        buttSumbit = new javax.swing.JButton();
        lblComando = new javax.swing.JLabel();
        lblNumMosse = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        labelNumMosse = new javax.swing.JLabel();
        lblStanzaCorrente = new javax.swing.JLabel();
        panelStat = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldKeyPressed(evt);
            }
        });

        buttSumbit.setText("INVIA");
        buttSumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSumbitActionPerformed(evt);
            }
        });

        lblComando.setText("Comando");

        lblNumMosse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumMosse.setText("Numero mosse:");

        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTempo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTempo.setText("Tempo:");

        labelNumMosse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStanzaCorrente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblStanzaCorrente.setForeground(javax.swing.UIManager.getDefaults().getColor("PropSheet.selectedSetBackground"));
        lblStanzaCorrente.setToolTipText("");
        lblStanzaCorrente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblStanzaCorrente.setOpaque(true);

        jButton1.setText("VISUALIZZA STATISTICHE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStatLayout = new javax.swing.GroupLayout(panelStat);
        panelStat.setLayout(panelStatLayout);
        panelStatLayout.setHorizontalGroup(
            panelStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        panelStatLayout.setVerticalGroup(
            panelStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setToolTipText("");

        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPanel.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPanel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttSumbit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumMosse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNumMosse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStanzaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComando, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(panelStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNumMosse, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(lblTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNumMosse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelStat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStanzaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField)
                    .addComponent(buttSumbit))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void buttSumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttSumbitActionPerformed
        JScrollBar verticalScrollBar = scrollPanel.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
        String comando = textField.getText();
        textField.setText("");
        Document doc = textArea.getDocument();
        GameDescription partita = engine.getGame();
        Parser parser = engine.getParser();
        try{
            ParserOutput p = parser.parse(comando, partita.getComandi(), partita.getStanzaCorrente().getObjects(), partita.getInventario(),partita.getOggettiGioco());
            partita.setNumMosse(partita.getNumMosse()+1);
            labelNumMosse.setText(""+partita.getNumMosse());
            partita.nextMove(p, System.out, this,jPanel1,background);
        }catch(BadLocationException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttSumbitActionPerformed


    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1PropertyChange

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       //uccidi thread tempo
        thread.interrupt();
        //uccidi thread suono stanza
        Suono.stopRiproduzione();
        frameStart.setEnabled(true);     
        partitaCaricata = false;
        JDialogAbbandona d = new JDialogAbbandona(this,true, engine);
        d.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        frameStart.setEnabled(false);
        textArea.setEditable(false);
        scrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ImageIcon icon = new ImageIcon(Utils.PERCORSO_IMMAGINI_ICONE + "iconaGioco.png");
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        Color c = new Color(255, 255, 255, 150);
        textArea.setBackground(c);
        textArea.setOpaque(false);
        scrollPanel.setOpaque(false);
        scrollPanel.getViewport().setOpaque(false);
        scrollPanel.setBackground(new Color(255,255,255,150));
        jPanel1.setSize(this.getWidth(),this.getHeight());
        lblComando.setOpaque(false);
        lblComando.setBackground(new Color(255,255,255,150));
        lblNumMosse.setOpaque(false);
        lblNumMosse.setBackground(new Color(255,255,255,150));
        lblTempo.setOpaque(false);
        lblTempo.setBackground(new Color(255,255,255,150));
        labelNumMosse.setOpaque(false);
        labelNumMosse.setBackground(new Color(255,255,255,150));
        timeLabel.setOpaque(false);
        timeLabel.setBackground(new Color(255,255,255,150));
        lblStanzaCorrente.setOpaque(false);
        lblStanzaCorrente.setBackground(new Color(255,255,255,0));
        jButton1.setOpaque(false);
        jButton1.setBackground(new Color(255,255,255,150));
        panelStat.setOpaque(false);
        panelStat.setBackground(new Color(255,255,255,150));
        lblStanzaCorrente.setOpaque(true);
        textArea.setText("");
        if(!partitaCaricata){
            Engine e = new Engine(new GiocoNaufragioIsola(),false);
            engine = e;
        }
        String stanzaCorrente = engine.getGame().getStanzaCorrente().getNomeStanza();
        try{
            BufferedImage img = ImageIO.read(new File(Utils.PERCORSO_IMMAGINI_STANZE + stanzaCorrente+".png"));
            Image dimg = img.getScaledInstance(jPanel1.getWidth(), jPanel1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            jPanel1.setBackground(new Color(0,0,0,0));
            jPanel1.setOpaque(false);
            jPanel1.setBorder(BorderFactory.createEmptyBorder());
            jPanel1.setLayout(new BorderLayout());
            background = new JLabel(imageIcon);
            jPanel1.add(background);
            background.setLayout(new FlowLayout());
            jPanel1.revalidate();
            jPanel1.repaint();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        lblStanzaCorrente.setText(stanzaCorrente);
        engine.getGame().setUsername(username);
        labelNumMosse.setText(""+engine.getGame().getNumMosse());
        GameDescription partita = engine.getGame();
        Suono.riproduciTraccia(Utils.PERCORSO_SUONI_STANZE + partita.getStanzaCorrente().getNomeStanza(),true);
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = textArea.getDocument();
               
        try{
            doc.insertString(doc.getLength(), "*FUGA DALL'ISOLA -v 1.0 2022-2023 *\n", attributes);
            //doc.insertString(doc.getLength(), partita.getCurrentRoom().getNomeStanza()+"\n", attributes);
            doc.insertString(doc.getLength(), partita.getStanzaCorrente().getDescrizioneLungaStanza()+"\n", attributes);
            //se è una partita nuova avvia thread per tempo con tempo iniziale a 0 minuti e 0 secondi
            if(!partitaCaricata){
                //avvia Thread          
                this.thread = new Thread(new ThreadTempo(this,0,0));
                thread.start();
            }else{
                /* altrimenti se è una partita caricata fai ripartire il thread per il tempo
                   dal tempo salvato della partita
                */
                timeLabel.setText(""+partita.getNumMinuti()+":"+""+partita.getNumSecondi());
                this.thread = new Thread(new ThreadTempo(this, partita.getNumMinuti(), partita.getNumSecondi()));
                thread.start();
            }                        
        }catch(BadLocationException ex){
            System.err.println("errore");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JDialogStats d = new JDialogStats(this,true,engine.getGame().getUsername());
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ActionEvent e = new ActionEvent(this,1,"");
            buttSumbitActionPerformed(e);
        }
    }//GEN-LAST:event_textFieldKeyPressed

    public void writeOnLabelTime(String time){
        timeLabel.setText(time);
    }
    
    public void scrviSuEditor(String s){
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = textArea.getDocument();
        try{
            doc.insertString(doc.getLength(),s, attributes);
        }catch(BadLocationException ex){
            System.err.println("errore");
        }
    }
    
    public void scriviSuLabelStanza(String stanzaCorrente){
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = textArea.getDocument();
        lblStanzaCorrente.setText(stanzaCorrente);
    }
    
    public JTextArea getTextArea(){
        return textArea;
    }
    
    public Engine getEngine(){
        return engine;
    }
    
    public static void setEngine(GiocoNaufragioIsola partita){
        partitaCaricata=true;
        Engine e = new Engine(partita, true);
        engine = e;
        System.out.println(e.getCurrentRoomName());
    }

    public void finePartita(){
        buttSumbit.setVisible(false);
        textField.setVisible(false);
        lblComando.setVisible(false);
        thread.interrupt();
    }
    

    public void main() {
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
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameApp(username,frameStart).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttSumbit;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNumMosse;
    private javax.swing.JLabel lblComando;
    private javax.swing.JLabel lblNumMosse;
    private javax.swing.JLabel lblStanzaCorrente;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel panelStat;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textField;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
    private static Engine engine;
    private static boolean partitaCaricata=false;
    private Thread thread;
    private String username;
    private JLabel background;
    private FrameStart frameStart;
}