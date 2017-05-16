/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import sm.sound.SMRecorder;
import sm.sound.SMSoundPlayerRecorder;

/**
 *
 * @author LENOVO
 */
public class InternalWindowRecord extends javax.swing.JInternalFrame {

    SMRecorder recorder;
    /**
     * Creates new form InternalWindowRecord
     */
    public InternalWindowRecord(File file) {
        initComponents();
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        recorder=new SMSoundPlayerRecorder(file);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        recordButton = new javax.swing.JToggleButton();
        stopButton = new javax.swing.JToggleButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        buttonGroup1.add(recordButton);
        recordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/RecordPressed_48x48.png"))); // NOI18N
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(recordButton);

        buttonGroup1.add(stopButton);
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/StopDisabled_48x48.png"))); // NOI18N
        stopButton.setSelected(true);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stopButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(recorder!= null) recorder.stop();
    }//GEN-LAST:event_formInternalFrameClosing

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        if(recorder!= null) recorder.record();
    }//GEN-LAST:event_recordButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        if(recorder!= null) recorder.stop();
    }//GEN-LAST:event_stopButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton recordButton;
    private javax.swing.JToggleButton stopButton;
    // End of variables declaration//GEN-END:variables
}
