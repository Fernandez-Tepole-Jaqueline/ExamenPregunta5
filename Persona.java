/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package main.java.ito.poo.clases;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Persona.
 * 
 * @author hp
 */
public class Persona {
	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property apellido.
	 */
	private String apellido = "";

	/**
	 * Description of the property email.
	 */
	private String email = "";

	/**
	 * Description of the property celular.
	 */
	private long celular = 0L;

	// Start of user code (user defined attributes for Persona)

	// End of user code

	/**
	 * The constructor.
	 */
	public Persona() {
		// Start of user code constructor for Persona)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Persona)

	public Persona(String nombre2, String apellido2, String email2, long celular2) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}

	
	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns apellido.
	 * @return apellido 
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * Sets a value to attribute apellido. 
	 * @param newApellido 
	 */
	public void setApellido(String newApellido) {
		this.apellido = newApellido;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * Returns celular.
	 * @return celular 
	 */
	public long getCelular() {
		return this.celular;
	}

	/**
	 * Sets a value to attribute celular. 
	 * @param newCelular 
	 */
	public void setCelular(long newCelular) {
		this.celular = newCelular;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular
				+ "]";
	}

}
