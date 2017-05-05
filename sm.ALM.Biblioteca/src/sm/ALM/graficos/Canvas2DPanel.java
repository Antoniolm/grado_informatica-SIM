// *********************************************************************
// **
// ** Copyright (C) 2017 Antonio David López Machado
// **
// ** This program is free software: you can redistribute it and/or modify
// ** it under the terms of the GNU General Public License as published by
// ** the Free Software Foundation, either version 3 of the License, or
// ** (at your option) any later version.
// **
// ** This program is distributed in the hope that it will be useful,
// ** but WITHOUT ANY WARRANTY; without even the implied warranty of
// ** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// ** GNU General Public License for more details.
// **
// ** You should have received a copy of the GNU General Public License
// ** along with this program.  If not, see <http://www.gnu.org/licenses/>.
// **
// *********************************************************************

package sm.ALM.graficos;

import static sm.ALM.graficos.Canvas2DPanel.*;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;
import static sm.ALM.graficos.GeometryType.*;


public class Canvas2DPanel extends javax.swing.JPanel {
    GeometryType geometry;
    public Point initPos;
    public Point offSet;
    static float widthSize=300;
    static float heightSize=300;
    Shape currentShape;
    ShapeList vShape;
    Shape clipShape;
    boolean editMode;
    Attribute attribute;
    
    public Canvas2DPanel() {
        initComponents();
        initPos=new Point(0,0);
        offSet=new Point(0,0);
        vShape = new ShapeList();
        editMode=false;
        attribute=new Attribute();
        geometry=POINT;
        setBackground(Color.white);
        
        //Added our mouseListener 
        addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e){
                    if(editMode) currentShape=getSelectedShape(e.getPoint());
                    else{
                        initPos=e.getPoint();       
                        currentShape=createShape();
                        vShape.add(currentShape);
                    }
                repaint();                  
                }
                @Override
                public void mouseReleased(MouseEvent e){
                    if(editMode)
                        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    else
                        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                    repaint();
                }
        });
        
        //Added our mouseMotionListener 
        addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e){
                    if(editMode){
                        setLocationShape(e.getPoint());
                        setCursor(new Cursor(Cursor.MOVE_CURSOR));
                    }
                    else{
                        updateShape(e.getPoint());
                    }
                repaint();                  
                }
                
        }); 
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        attribute.apply(g2d);
        g2d.clip(clipShape);
        
        if(!attribute.getFilled())
            for(Shape s:vShape)
                g2d.draw(s);
        else
            for(Shape s:vShape){
                if(s instanceof Line2D)
                    g2d.draw(s);
                else g2d.fill(s);
            }
        
        
    }
    
    public GeometryType getGeometry(){
        return geometry;
    }
    
    public void setGeometry(GeometryType aType){
        geometry=aType;
    }
    
    public void setColor(Paint value){
        attribute.setFilled(value);
        repaint();
    }
        
    public void setFilled(boolean boolValue){
        attribute.filled=boolValue;
        repaint();
    }
    
    public boolean getFilled(){            
        return attribute.getFilled();
    }
    
    public void setThick(Stroke stroke,Integer value){
        attribute.setStroke(stroke,value);
        repaint();
    }
    
    public Integer getThick(){
        return attribute.getThickness();
    }
    public void setTransparency(Composite value){
        attribute.setComp(value);
        repaint();
    }
    
    public boolean getTransparency(){
        boolean result=false;
        
        if(attribute.getComp()!=null)
            result=true;
            
        return result;
    }
    
    public void setRender(RenderingHints value){
        attribute.setRender(value);
        repaint();
    }
    
    public boolean getRender(){
        boolean result=false;
        if(attribute.getRender()!=null)
            result=true;
        
        return result;
    }
    
    public void setEdit(boolean value){
        editMode=value;
    }
    
    public boolean getEdit(){
        return editMode;
    }
    
    public void setClip(Shape newClip){
        clipShape=newClip;
    }
    public Shape getClip(){
        return clipShape;
    }
    
    public void setSizeImage(float width,float height){
        heightSize=height;
        widthSize=width;
    }
    
    public float getHeightImage(float width,float height){
        return heightSize;
    }
    public float getWidthImage(){
        return widthSize;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
