/*
 * 
 */
package paquete;

import org.junit.Test;
/**
 * The Class ClaseDummy.
 */
public class ClaseDummy {
	// Para solucionar los errores de que no exista el folder de src
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
		System.out.println("Calling method to print...");
		method1();
	}
	
	/**
	 * Method 1.
	 */
	public static void method1(){
		System.out.println("Called method");
	}

	/**
	 * Prueba division exitosa.
	 *
	 * @return the int
	 */
	@Test
	public float pruebaDivisionExitosa(){
		return 50 / 10;
	}

	/**
	 * Prueba division fallida.
	 *
	 * @return the int
	 */
	@Test
	public float pruebaDivisionFallida(){
		return 2 / 0;
	}
}
