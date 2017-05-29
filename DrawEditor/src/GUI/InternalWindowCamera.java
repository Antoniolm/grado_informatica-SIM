/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;

/**
 *
 * @author LENOVO
 */
public class InternalWindowCamera extends InternalWindow{
    /**
     * Creates new form InternalWindowCamera
     */
    private Webcam camera = null;
    
    private InternalWindowCamera() {
        initComponents();
        
        camera = Webcam.getDefault();
        
        Dimension resoluciones[] = camera.getViewSizes();
        Dimension maxRes = resoluciones[resoluciones.length-1];
        camera.setViewSize(maxRes);
        
        WebcamPanel areaVisual;
        
        if (camera != null) {
            areaVisual = new WebcamPanel(camera);
            areaVisual.setFitArea(false);
            
            if (areaVisual!= null) {
                internalWind.getContentPane().add(areaVisual, BorderLayout.CENTER);
                internalWind.pack();
            }
        }

    }

    
    public static InternalWindowCamera getInstance(){
        InternalWindowCamera v = new InternalWindowCamera();
        return (v.camera!=null?v:null);
    }
     
    public BufferedImage getImage(){
         return camera.getImage();
    }
    
    public void close() {
        if (camera != null) {
            try {
                camera.close();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }
    
    @Override
    public void initComponents() {
        internalWind=new JInternalFrame();
        internalWind.setClosable(true);
        internalWind.setIconifiable(true);
        internalWind.setMaximizable(true);
        internalWind.setResizable(true);
        internalWind.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                close();
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

        internalWind.pack();
    }
    
}
