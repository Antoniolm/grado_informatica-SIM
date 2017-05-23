/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.io.File;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;

/**
 *
 * @author LENOVO
 */
public class InternalWindowJMFPlayer extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalWindowJMFPlayer
     */
    
    private Player player = null;

    
    private InternalWindowJMFPlayer(File f) {
        initComponents();
        
        String sfichero = "file:" + f.getAbsolutePath();
        MediaLocator ml = new MediaLocator(sfichero);
        try {
            player = Manager.createRealizedPlayer(ml);
            Component vc = player.getVisualComponent();
            if(vc!=null)add(vc, java.awt.BorderLayout.CENTER);
                Component cpc = player.getControlPanelComponent();
            if(cpc!=null)add(cpc, java.awt.BorderLayout.SOUTH);
                this.pack();
        }catch(Exception e) {
            System.err.println("InternalWindowJMFPlayer: "+e);
            player = null;
        }
    }
    
    public static InternalWindowJMFPlayer getInstance(File f){
        InternalWindowJMFPlayer v = new InternalWindowJMFPlayer(f);
        if(v.player!=null) return v;
        else return null;
    }
    
    public void play() {
        if (player != null) {
            try {
                player.start();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }

    public void close() {
        if (player != null) {
            try {
                player.close();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        close();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
