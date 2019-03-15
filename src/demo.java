package Demo;

import code.MinimoComunMultiplo;
import code.VerificaNumerosAmigos;

/**
 * 
 * @author Jorge Rivas
 * @version 1.0
 *
 */
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numerosAmigos();
		minimoComunMultiplo();
		
	}
	
	/**
	 * @see clase VerificaNumerosAmigos
	 */
	public static void numerosAmigos() {
		VerificaNumerosAmigos vf = new VerificaNumerosAmigos();
		vf.verificador();
	}
	
	/**
	 * @see clase MinimoComunMultiplo
	 */
	
	public static void minimoComunMultiplo() {
		MinimoComunMultiplo mcm = new MinimoComunMultiplo();
		int[] candidatos = {17, 23};
		int resultado = mcm.candidatosMcM(candidatos);
		System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
	}
}