package ito.poo.clases;
import main.java.ito.poo.clases.Chofer;
import ito.poo.clases.*;

public class MyApp {

	public static void run() {
		Chofer c=new Chofer("Luis","Delgado","Ld12do@gmail.com",2781234567L,"71255508849",123,4500F,"Chofer",20);
		c.agregarRuta("Zongolica");
		c.agregarRuta("Orizaba");
		c.agregarRuta("RafaelDelgado");
		c.agregarRuta("Cordoba");
		c.agregarRuta("Coatzacoalcos");
		System.out.println(c.toString());
		c.eliminarRuta("Cordoba");
		System.out.println(c.toString());
	}
	
	public static void main(String [] args) {
		run();
	}

}
