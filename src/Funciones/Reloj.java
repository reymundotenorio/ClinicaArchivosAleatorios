/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Main.Exa;
import Main.Exa;
import javax.swing.JLabel;

/**
 *
 * @author Reymundo Tenorio
 */
public class Reloj implements Runnable {

    Exa x = new Exa();

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    private javax.swing.JLabel lblHora;
    boolean flag = true;

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Thread getH1() {
        return h1;
    }

    @Override
    public void run() {
        flag = true;
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lblHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            // System.out.println("hora: "+lblHora.getText());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {

            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }

        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void Iniciar() {
        h1 = new Thread(this);
        h1.start();
    }

}
