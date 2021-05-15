/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package main.java.ito.poo.clases;

import main.java.ito.poo.clases.Persona;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Empleado.
 * 
 * @author hp
 */
public class Empleado extends Persona {
	/**
	 * Description of the property nss.
	 */
	private String nss = "";

	/**
	 * Description of the property noEmpleado.
	 */
	private int noEmpleado = 0;

	/**
	 * Description of the property sueldo.
	 */
	private float sueldo = 0F;

	/**
	 * Description of the property puesto.
	 */
	private String puesto = "";

	// Start of user code (user defined attributes for Empleado)

	// End of user code

	/**
	 * The constructor.
	 */
	public Empleado(String nombre, String apellido, String email, long celular,String nss, int noEmpleado, float sueldo, String puesto) {
		// Start of user code constructor for Empleado)
		super(nombre,apellido,email,celular);
		this.nss = nss;
		this.noEmpleado = noEmpleado;
		this.sueldo = sueldo;
		this.puesto = puesto;
		// End of user code
	}

	

	/**
	 * Description of the method cambioPuesto.
	 * @param puesto 
	 * @param sueldo 
	 */
	public void cambioPuesto(String puesto, float sueldo) {
		// Start of user code for method cambioPuesto
		// End of user code
	}

	// Start of user code (user defined methods for Empleado)

	// End of user code
	/**
	 * Returns nss.
	 * @return 
	 */
	public String getNss() {
		return this.nss;
	}

	/**
	 * Sets a value to attribute nss. 
	 * @param newNss 
	 */
	public void setNss(String newNss) {
		this.nss = newNss;
	}

	/**
	 * Returns noEmpleado.
	 * @return noEmpleado 
	 */
	public int getNoEmpleado() {
		return this.noEmpleado;
	}

	/**
	 * Sets a value to attribute noEmpleado. 
	 * @param newNoEmpleado 
	 */
	public void setNoEmpleado(int newNoEmpleado) {
		this.noEmpleado = newNoEmpleado;
	}

	/**
	 * Returns sueldo.
	 * @return sueldo 
	 */
	public float getSueldo() {
		return this.sueldo;
	}

	/**
	 * Sets a value to attribute sueldo. 
	 * @param newSueldo 
	 */
	public void setSueldo(float newSueldo) {
		this.sueldo = newSueldo;
	}

	/**
	 * Returns puesto.
	 * @return puesto 
	 */
	public String getPuesto() {
		return this.puesto;
	}

	/**
	 * Sets a value to attribute puesto. 
	 * @param newPuesto 
	 */
	public void setPuesto(String newPuesto) {
		this.puesto = newPuesto;
	}
	@Override
	public String toString() {
		return "Empleado "+super.toString()+"[nss=" + nss + ", noEmpleado=" + noEmpleado + ", sueldo=" + sueldo + ", puesto=" + puesto
				+ "]";
	}
}
