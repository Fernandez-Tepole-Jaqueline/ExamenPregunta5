/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package main.java.ito.poo.clases;

import main.java.ito.poo.clases.Persona;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Cliente.
 * 
 * @author hp
 */
public class Cliente extends Persona {
	/**
	 * Description of the property noCliente.
	 */
	private int noCliente = 0;

	/**
	 * Description of the property creditoDisponible.
	 */
	private float creditoDisponible = 0F;

	// Start of user code (user defined attributes for Cliente)

	// End of user code

	/**
	 * The constructor.
	 */
	public Cliente() {
		// Start of user code constructor for Cliente)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Cliente)

	// End of user code
	/**
	 * Returns noCliente.
	 * @return noCliente 
	 */
	public int getNoCliente() {
		return this.noCliente;
	}

	/**
	 * Sets a value to attribute noCliente. 
	 * @param newNoCliente 
	 */
	public void setNoCliente(int newNoCliente) {
		this.noCliente = newNoCliente;
	}

	/**
	 * Returns creditoDisponible.
	 * @return creditoDisponible 
	 */
	public float getCreditoDisponible() {
		return this.creditoDisponible;
	}

	/**
	 * Sets a value to attribute creditoDisponible. 
	 * @param newCreditoDisponible 
	 */
	public void setCreditoDisponible(float newCreditoDisponible) {
		this.creditoDisponible = newCreditoDisponible;
	}

}
