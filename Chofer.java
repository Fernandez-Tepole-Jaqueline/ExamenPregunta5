/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package main.java.ito.poo.clases;
import main.java.ito.poo.clases.Empleado;
import java.util.HashSet;

 

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Chofer.
 * 
 * @author hp
 */
public class Chofer extends Empleado {
	/**
	 * Description of the property rutas.
	 */
	private HashSet<String> rutas = new HashSet<String>();

	/**
	 * Description of the property noAutonus.
	 */
	private int noAutonus = 0;

	// Start of user code (user defined attributes for Chofer)

	// End of user code

	/**
	 * The constructor.
	 */
	public Chofer(String nombre, String apellido, String email, long celular, String nss, int noEmpleado, float sueldo, String puesto,int noAutonus) {
		super (nombre, apellido, email, celular, nss, noEmpleado, sueldo, puesto);
		this.noAutonus = noAutonus;
	}

	/**
	 * Description of the method agregarRuta.
	 * @param ruta 
	 */
	public void agregarRuta(String ruta) {
		// Start of user code for method agregarRuta
		this.rutas.add(ruta);
		// End of user code
	}
	

	
	/**
	 * Description of the method eliminarRuta.
	 * @param ruta 
	 */
	public Boolean eliminarRuta(String ruta) {
		// Start of user code for method eliminarRuta
		Boolean eliminarRuta =false;
		if(this.rutas.contains(ruta)) {
			this.rutas.remove(ruta);
			eliminarRuta=true;
			return eliminarRuta;
		}
		// End of user code
		return eliminarRuta;
	}
		

	// Start of user code (user defined methods for Chofer)

	// End of user code
	/**
	 * Returns rutas.
	 * @return rutas 
	 */
	public HashSet<String> getRutas() {
		return this.rutas;
	}

	/**
	 * Returns noAutonus.
	 * @return noAutonus 
	 */
	public int getNoAutonus() {
		return this.noAutonus;
	}

	/**
	 * Sets a value to attribute noAutonus. 
	 * @param newNoAutonus 
	 */
	public void setNoAutonus(int newNoAutonus) {
		this.noAutonus = newNoAutonus;
	}
	@Override
	public String toString() {
		return super.toString()+"[rutas=" + rutas + ", noAutobus=" + noAutonus + "]";
	}
	
	}

