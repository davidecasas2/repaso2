import java.util.Scanner;



/**
 * 
 */

/**
 * @author David
 * Ejercicio 2.  Desarrollar  un  programa  en  el  que  se  pida  al  usuario  una  matriz 
 *  de  dimensiones N    ×M, y compruebe si la matriz es dispersa. (Todos las filas y todas 
 *  las columnas contienen al menos un elemento nulo). 
 */
public class Ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el numero de filas");
		int filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas = entrada.nextInt();
		
		int matriz[][]=new int[filas][columnas];
		
		System.out.println("introduce la matriz");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("La matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		if (Matrices.esDispersa(matriz)) {
			System.out.println("La matriz es dispersa");
		} else {
			System.out.println("La matriz NO es dispersa");
		}
	}

}
