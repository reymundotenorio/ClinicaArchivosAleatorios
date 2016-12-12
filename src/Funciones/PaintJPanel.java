/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Reymundo Tenorio
 */
public class PaintJPanel extends JPanel {
    
    ImageIcon imagen;
    String nombre;
  
    public PaintJPanel(String nombre){
        this.nombre=nombre;
    }
    
    @Override
   public void paint(Graphics g){
   
       Dimension tamanio = getSize();
       imagen = new ImageIcon(getClass().getResource(nombre));
       g.drawImage(imagen.getImage(), 0, 0, tamanio.width,tamanio.height,null);
   setOpaque(false);
   super.paint(g);
   } 
}
