/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Reymundo Tenorio
 */
public class ComparandoFechas {
  

 public void Comparando (){
  System.out.println("Datos iniciales:");
  // Fecha / Hora
  String stFecha1 = "22/01/2011 14:36";  
  String stFecha2 = "22/01/2011 14:35";
  String stFecha3 = "22/02/2011 14:36";
   
  System.out.println("Fecha/Hora-1:"+stFecha1);
  System.out.println("Fecha/Hora-2:"+stFecha2);
  System.out.println("Fecha/Hora-3:"+stFecha3);
 
  System.out.println();
  System.out.println();
 
  // Utilizando Date y SimpleDateFormat
   
  System.out.println();
  System.out.println("Utilizando Date:");
  System.out.println();
   
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
  
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha1 = sdf.parse(stFecha1 , new ParsePosition(0));
  
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha2 = sdf.parse(stFecha2 , new ParsePosition(0));
 
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha3 = sdf.parse(stFecha3 , new ParsePosition(0));
 
   
  // Comparaciones
   
  if ( fecha1.before(fecha2) ) System.out.println(" Fecha1 es anterior a fecha2.");
  else System.out.println(" Fecha1 NO es anterior a fecha2.");
  
  if ( fecha1.before(fecha3) ) System.out.println(" Fecha1 es anterior a fecha3.");
  else System.out.println(" Fecha1 NO es anterior a fecha3.");
   
  if ( fecha2.before(fecha3) ) System.out.println(" Fecha2 es anterior a fecha3.");
  else System.out.println(" Fecha2 NO es anterior a fecha3.");
   
   
   
  // Utilizando Calendar.
   
  System.out.println();
  System.out.println("Utilizando GregorianCalendar:");  
  System.out.println();
   
  // Con las mismas fechas, creamos los Calendar's
   
  Calendar cal1 = new GregorianCalendar();
  cal1.setTime(fecha1);
   
  Calendar cal2 = new GregorianCalendar();
  cal2.setTime(fecha2);
   
  Calendar cal3 = new GregorianCalendar();
  cal3.setTime(fecha3);
   
 
  // Comparaciones
   
  if ( cal1.before(cal2) ) System.out.println(" Cal1 es anterior a cal2.");
  else System.out.println(" Cal1 NO es anterior a cal2.");
  
  if ( cal1.before(cal3) ) System.out.println(" Cal1 es anterior a Cal3.");
  else System.out.println(" Cal1 NO es anterior a cal3.");
   
  if ( cal2.before(cal3) ) System.out.println(" Cal2 es anterior a Cal3.");
  else System.out.println(" Cal2 NO es anterior a cal3.");  
   
   
  // Tanto para Date como para Calendar/GregorianCalendar
  // podemos hacer una comparación "numérica", obteniendo
  // la representación de la fecha/hora en milisegundos.
  // Por convenio, esta cuenta se inicia en el 01/01/1970 a las 0:00:00 GMT
   
  System.out.println();
  System.out.println("En milisegundos:");  
  System.out.println();  
  System.out.println(" Milisegundos de fecha1:"+fecha1.getTime());
  System.out.println(" Milisegundos de fecha2:"+fecha2.getTime());
  System.out.println(" Milisegundos de fecha3:"+fecha3.getTime());
  System.out.println(" Milisegundos de cal1:  "+cal1.getTimeInMillis());
  System.out.println(" Milisegundos de cal2:  "+cal2.getTimeInMillis());
  System.out.println(" Milisegundos de cal3:  "+cal3.getTimeInMillis());
   
 
}
 
 
 
 public int calcularEdad(String fecha) {
String datetext = fecha;
try {
Calendar birth = new GregorianCalendar();
Calendar today = new GregorianCalendar();
int age=0;
int factor=0;
Date birthDate=new SimpleDateFormat("dd-MM-yyyy").parse(datetext);
Date currentDate=new Date(); //current date
birth.setTime(birthDate);
today.setTime(currentDate);
 //System.out.println("fechaaa "+today.get(Calendar.MONTH)); 
    //System.out.println("fehcaaa mia "+birth.get(Calendar.MONTH));
if (today.get(Calendar.MONTH) <= birth.get(Calendar.MONTH)) {
if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)) {
if (today.get(Calendar.DATE) > birth.get(Calendar.DATE)) {
factor = -1; //Aun no celebra su cumpleaÃ±os
}
} else {
factor = -1; //Aun no celebra su cumpleaÃ±os
}
}
age=(today.get(Calendar.YEAR)-birth.get(Calendar.YEAR))+factor;
return age;
} catch (ParseException e) {
   
return -1;
}


}
 
  public static Integer CalcularEdad1(String fecha){
	    Date fechaNac=null;
	        try {
	            /*Se puede cambiar la mascara por el formato de la fecha que se
	            //quiera recibir, por ejemplo año mes día "yyyy-MM-dd"
	            en este caso es día mes año*/
	            fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
	        } catch (Exception ex) {
	            System.out.println("Error:"+ex);
	        }
	        Calendar fechaNacimiento = Calendar.getInstance();
	        //Se crea un objeto con la fecha actual
	        Calendar fechaActual = Calendar.getInstance();	
                //Se asigna la fecha recibida a la fecha de nacimiento.
	        fechaNacimiento.setTime(fechaNac);
	        //Se restan la fecha actual y la fecha de nacimiento
	        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
	        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
	        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
	        //Se ajusta el año dependiendo el mes y el día
	        if(mes<0 || (mes==0 && dia<0)){
	            año--;
	        }
	        //Regresa la edad en base a la fecha de nacimiento
	        return año;
	    }

}