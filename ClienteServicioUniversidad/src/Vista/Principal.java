package Vista;

import java.rmi.RemoteException;

import servicioscurso.ServicioCrearCursoProxy;
import servicios.ServicioMatriculaProxy;
/**
 * 
 * @author Alfredo
 *
 */
public class Principal {

	/**
	 * método main, donde se instancian los objetos para que el cliente acceda
	 * a los métodos del servicio
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * En el método main se importan los paquetes en donde están alojados los servicios web
		 * y se instancian objetos para poder acceder a los métodos de estos.
		 * 
		 */
		ServicioCrearCursoProxy a = new ServicioCrearCursoProxy();
		ServicioMatriculaProxy b = new ServicioMatriculaProxy();
		try {
			//String msj1 =  a.crearCurso("ElectivoI");//se crea un nuevo curso
			//String msj2 = a.asignarProfesor(2, "Anatomia", "123456731");//se le asigna un curso  un profesor
			b.mostrarMorososMatricula();// se muestra el listado con los alumnos morosos en el pago de la mensualidad
			//System.out.println(msj1);
			//System.out.println(msj2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
