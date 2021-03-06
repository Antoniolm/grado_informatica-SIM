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
/*
 * Código consultado para realizar obtenido de diferentes sitios web.
 * Referencia ha dichos codigos : 
 *   - https://stackoverflow.com/questions/31829359/java-swing-moving-java-awt-shape
 *   - http://www.java2s.com/Code/Java/2D-Graphics-GUI/GettingtheShapefromtheOutlineofText.htm
 */
package sm.ALM.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 * It will manage a curve figure in our system
 * @author Antonio David López Machado antoniolm@correo.ugr.es
 */
public class Curve2DFigure extends Figure{    
    boolean created; //true if the curve figure was make completely
    
    /**
     * Constructor
     * @param anAtt the attribute of our shape 
     */
    public Curve2DFigure(Attribute anAtt){
        super();
        created=true;
        attribute=anAtt;
        currentShape= new QuadCurve2D.Float();
        type=GeometryType.CURVE;
    }
    
    /**
     * It will draw our shape
     * @param g2d the graphic where the shape will be draw
     * @param drawImage true if is draw in an image
     */
    @Override
    public void draw(Graphics2D g2d,boolean drawImage) {
        
        if(editMode && !drawImage){
            g2d.setColor(Color.GRAY);
            g2d.setStroke(new BasicStroke(2.0F, BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_MITER, 1.0F,new float[]{ 5.0F, 5.0F }, 0.0F));
            g2d.draw(currentShape.getBounds2D());
            g2d.setStroke(new BasicStroke());
        }
        
        Rectangle bound=currentShape.getBounds();
        if(attribute.getFilled())
            attribute.generateFilled((int)(( Rectangle) bound).getX(),(int) (( Rectangle) bound).getY(),
            (int)(( Rectangle) bound).getHeight(),(int)(( Rectangle) bound).getWidth());
        
        attribute.apply(g2d);
        
        if(!attribute.getFilled())
                g2d.draw(currentShape);
        else {
                g2d.fill(currentShape);
        }
    }
    
    /**
     * It will update the position of our second position of our shape
     * @param initPos
     * @param point 
     */
    @Override
    public void updatePosition(Point2D initPos, Point2D point) {
        ((QuadCurve2D.Float) currentShape).setCurve(initPos, new Point2D.Float(0,0), point);
    }
    
    /**
     * It will update the curve of our shape
     * @param point the position of our mouse
     */
    public void updateCurve(Point2D point){
        ((QuadCurve2D.Float) currentShape).setCurve(((QuadCurve2D.Float) currentShape).getP1() , point, ((QuadCurve2D.Float) currentShape).getP2());
    }
    
    /**
     * It will return if the shape was make completely 
     * @return 
     */
    public boolean isCreated(){
        return created;
    }
    
    /**
     * It will set a new vluae for our create variable
     * @param value 
     */
    public void setCreated(boolean value){
        created=value;
    }

    /**
     * It will set a new position for our shape
     * @param newPos 
     */
    @Override
    public void setPosition(Point2D newPos) {
        Point2D point1 = ((QuadCurve2D.Float)currentShape).getP1();
        Point2D point2 = ((QuadCurve2D.Float)currentShape).getP2();
        Point2D point3 = ((QuadCurve2D.Float)currentShape).getCtrlPt();
        
        Point2D diff= new Point2D.Double((newPos.getX() - point1.getX()),(newPos.getY() - point1.getY()));
        point2.setLocation(point2.getX() + diff.getX(), point2.getY() + diff.getY());
        point3.setLocation(point3.getX() + diff.getX(), point3.getY() + diff.getY());
        
        newPos.setLocation(newPos.getX()-offSet.getX(),newPos.getY()-offSet.getY());
        point2.setLocation(point2.getX()-offSet.getX(),point2.getY()-offSet.getY());
        point3.setLocation(point3.getX()-offSet.getX(),point3.getY()-offSet.getY());
        
        ((QuadCurve2D.Float)currentShape).setCurve(newPos, point3, point2);
    }

    /**
     * It will return if the shape was selected or not (in edit mode)
     * @param pos the position of our mouse
     * @return 
     */
    @Override
    public boolean wasSelected(Point2D pos) {
        boolean result =false;
        if (currentShape.getBounds2D().contains(pos)) {
            Point2D.Double point1 = new Point2D.Double(((QuadCurve2D.Float)currentShape).getX1(), ((QuadCurve2D.Float)currentShape).getY1());
            offSet.setLocation(pos.getX() - point1.getX(), pos.getY() - point1.getY());
            result=true;
        }
        return result;
    }
    
}
