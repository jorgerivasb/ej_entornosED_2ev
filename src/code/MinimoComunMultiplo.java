package code;

/**
 * 
 * @author Jorge Rivas
 * @version 1.0
 *
 */
public class MinimoComunMultiplo {

	public MinimoComunMultiplo() {}

	/**
	 * 
	 * @param args es un array
	 * @return este método devuelve el número máximo de números candidatos a minimo común múltiplo
	 * @see abs
	 */
	  public int candidatosMcM(int[] args) {
	    if (args.length < 2) {
	      throw new IllegalArgumentException(
	        "Hacen falta dos o más números"
	      );
	    }

	    if (algunoEsCero(args)) {
	      throw new IllegalArgumentException(
	        "Los números no pueden ser cero"
	      );
	    }

	    args = abs(args);

	    int max = max(args);
	    int d = max;

	    while (true) {
	      if (esMinimoComunMultiplo(d, args)) {
	        return d;
	      }

	      d += max;
	    }
	  }

	  /**
	   * 
	   * @param ints es un array de números 
	   * @return este método devuelve un boolean que nos indica si algún caso de el array ints en igual a 0
	   */
	  private boolean algunoEsCero(int[] ints) {
	    for (int d : ints) {
	      if (d == 0) {
	        return true;
	      }
	    }

	    return false;
	  }

	  /**
	   * 
	   * @param ints es un array de enteros
	   * @return nos devuelve un array con los posibles MCM 
	   */
	  private static int[] abs(int[] ints) {
	    int[] abs = new int[ints.length];

	    for (int i = 0; i < ints.length; i += 1) {
	      abs[i] = Math.abs(ints[i]);
	    }

	    return abs;
	  }
	  
	  /**
	   * 
	   * @param ints es un array de enteros
	   * @return nos devuelve el número máximo
	   */
	  private int max(int[] ints) {
	    int max = ints[0];

	    for (int i = 1; i < ints.length; i += 1) {
	      max = Math.max(max, ints[i]);
	    }

	    return max;
	  }
	  
	  /**
	   * 
	   * @param d es un entero del que queremos comprobar si es el MCM
	   * @param ints es un array de enteros
	   * @return nos devuelve un boolean que nos indica si d es el mínimo común múltiplo
	   */
	  private boolean esMinimoComunMultiplo(int d, int[] ints) {
	    for (int i = 0; i < ints.length; i += 1) {
	      if (d % ints[i] != 0) {
	        return false;
	      }
	    }

	    return true;
	  }
	
}
