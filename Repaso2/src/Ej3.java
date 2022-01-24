import java.util.Scanner;



/**
 * 
 */

/**
 * @author David
 * Ejercicio 3.  Desarrollar  un  programa  en  el  que  se  pida  al  usuario  
 * una  matriz  de  dimensiones N ×M, y compruebe si lamatriz es simétrica. 
 * (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).  
 */
public class Ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el tamaño");
		int tam = entrada.nextInt();
		int matriz[][]=new int[tam][tam];
		
		System.out.println("introduce la matriz");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("La matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		if (Matrices.esSimetrica(matriz)) {
			System.out.println("La matriz es simetrica");
		} else {
			System.out.println("La matriz NO es simetrica");
		}
	}

}
