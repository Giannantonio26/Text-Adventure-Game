/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import di.uniba.map.b.adventure.Engine;
import di.uniba.map.b.adventure.GameDescription;
import di.uniba.map.b.adventure.games.GiocoNaufragioIsola;
import di.uniba.map.b.adventure.parser.Parser;
import di.uniba.map.b.adventure.parser.ParserOutput;
import di.uniba.map.b.adventure.type.TipoComando;
import di.uniba.map.b.adventure.type.ThreadTime;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author Giannantonio
 */
public class JFrameApp extends javax.swing.JFrame {


    public JFrameApp(String username) {
        this.username = username;
        initComponents();        
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JEditorPane();
        textField = new javax.swing.JTextField();
        buttSumbit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelNumMosse = new javax.swing.JLabel();
        lblStanzaCorrente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

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

        editor.setEditable(false);
        jScrollPane1.setViewportView(editor);

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

        jLabel1.setText("Comando");

        jLabel2.setText("Numero mosse:");

        jLabel3.setText("Tempo:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttSumbit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNumMosse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStanzaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumMosse, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblStanzaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        // TODO add your handling code here:
        String command = textField.getText();
        textField.setText("");
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = editor.getDocument();
        GameDescription game = engine.getGame();
        Parser parser = engine.getParser();
        try{
            ParserOutput p = parser.parse(command, game.getCommands(), game.getCurrentRoom().getObjects(), game.getInventory());
            int numMosse = game.getNumMoves();
            game.setNumMoves(game.getNumMoves()+1);
            labelNumMosse.setText(""+game.getNumMoves());
            if (p == null || p.getCommand() == null) {        
                    doc.insertString(doc.getLength(), "\nNon capisco quello che mi vuoi dire.\n", attributes);
            } else if (p.getCommand() != null && p.getCommand().getTipoComando() == TipoComando.FINE) {
                doc.insertString(doc.getLength(), "Addio.\n", attributes);
                //setta il textField non editabile

            }else{
                game.nextMove(p, System.out, this);
                System.out.println();
            }
        }catch(BadLocationException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttSumbitActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1PropertyChange

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        //uccidi thread
        thread.interrupt();
        System.out.println("Thread interrotto");
        JDialogAbbandona d = new JDialogAbbandona(this,true, engine);
        d.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblStanzaCorrente.setOpaque(true);
        editor.setText("");
        Engine e = new Engine(new GiocoNaufragioIsola());
        this.engine = e;
        String stanzaCorrente = engine.getGame().getCurrentRoom().getNomeStanza();
        lblStanzaCorrente.setText(stanzaCorrente);
        e.getGame().setUsername(username);
        
        GameDescription game = engine.getGame();
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = editor.getDocument();
               
        try{
            doc.insertString(doc.getLength(), "* Adventure v. 0.3 - 2021-2022 *\n", attributes);
            //doc.insertString(doc.getLength(), game.getCurrentRoom().getNomeStanza()+"\n", attributes);
            doc.insertString(doc.getLength(), game.getCurrentRoom().getDescrizioneLungaStanza()+"\n", attributes);
            //avvia Thread          
            this.thread = new Thread(new ThreadTime(this));
            thread.start();                        
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
        Document doc = editor.getDocument();
        try{
            doc.insertString(doc.getLength(),s, attributes);              
        }catch(BadLocationException ex){
            System.err.println("errore");
        }
    }
    
    public void scriviSuLabelStanza(String stanzaCorrente){
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Document doc = editor.getDocument();
        lblStanzaCorrente.setText(stanzaCorrente);
    }
    
    public JEditorPane getEditor(){
        return editor;
    }
    
    public Engine getEngine(){
        return engine;
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
                new JFrameApp(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttSumbit;
    private javax.swing.JEditorPane editor;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNumMosse;
    private javax.swing.JLabel lblStanzaCorrente;
    private javax.swing.JTextField textField;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
    private Engine engine;
    private Thread thread;
    private String username;
}

