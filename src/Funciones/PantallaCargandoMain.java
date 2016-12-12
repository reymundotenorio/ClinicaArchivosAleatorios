/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import Funciones.PantallaCargando;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

  PantallaCargando screen;

  public PantallaCargandoMain() {
    inicioPantalla();
	screen.velocidadDeCarga();
  }

  private void inicioPantalla() {
    ImageIcon myImage = new ImageIcon("src//examen//informatica.jpeg");
    screen = new PantallaCargando(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(100);
    screen.setVisible(true);
  }

  public static void main(String[] args)
  {
    new PantallaCargandoMain();
  }
}