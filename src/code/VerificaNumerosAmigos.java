package code;

import javax.swing.JOptionPane;

	/**
	 * 
	 * @author Jorge Rivas
	 * @version 1.0
	 * 
	 *
	 */
	public class VerificaNumerosAmigos {

		/*
		 * Dos números son amigos cuando la suma de los divisores de uno da como resultado el otro y viceversa.
		 * Por ejemplo: 220 y 284 son amigos.
		 * */
		
		/**
		 * @author Jorge
		 * @version 1.0
		 */
	    public void verificador() {
	        String entrada;

	        entrada = JOptionPane.showInputDialog("Introducir 1er número");
	        int x = Integer.parseInt(entrada);

	        entrada = JOptionPane.showInputDialog("Introducir 2º número");
	        int y = Integer.parseInt(entrada);
	        
	        if (this.comprobarSiAmigos(x,y)) {
	            JOptionPane.showMessageDialog(null, x + " es amigo de " + y);
	        } else {
	            JOptionPane.showMessageDialog(null, x + " no es amigo de " + y);
	        }        
	    }
	    
	    /**
	     * 
	     * @param x es un número del que queremos comprobar si es amigo de otro número y
	     * @param y es un número del que queremos comprobar si es amigo de otro número x
	     * @return este método devuelve un boolean que nos indica si los números pasados son amigos o no
	     */
	   public boolean comprobarSiAmigos(int x, int y) {
	    	int i, z = 0;
	    	
	    	for (i = 1; i < x; i++) {
	            if (x % i == 0) {
	                z = z + i;
	            }
	        }

	        if (z == y) {
	            z = 0;
	            for (i = 1; i < y; i++) {
	                if (y % i == 0) {
	                    z = z + i;
	                }
	            }

	            if (z == x) {
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
}
