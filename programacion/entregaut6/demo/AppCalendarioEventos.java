package programacion.entregaut6.demo;
import progranacion.entregaut6.modelo.CalendarioEventos;
import progranacion.entregaut6.interfaz.IUConsola;
/**
 * Author - Ibai Andreu
 * Punto de entrad a la aplicación
 * 
 * COMANDOS UTILIZADOS 
 * C:\_datos\proyectos\UT6\ENTRE-01-UT6-CalendarioEventos_Ibai_Andreu>java programacion.entregaut6.demo.AppCalendarioEventos
 * 
 */
public class AppCalendarioEventos {

	public static void main(String[] args) {
		CalendarioEventos calendario = new CalendarioEventos();
		IUConsola interfaz = new IUConsola(calendario);
		interfaz.iniciar();

	}

}
