import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * Ejercicio  1. Desarrollar  un  programa  en  el  que  se  pida  al  usuario  un  vector  
 * de  números enteros e indique en pantalla cuantos de dichos elementos son números impares. 
 */
public class Ej1 {

	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	public static int cuantos_impares(int v[]) {
		int contador=0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i]%2!=0) {
				contador++;
			}
		}
		return contador;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuantos elementos quieres?");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		pedir_vector(vector);
		
		System.out.println("El vector es ");
		mostrar_vector(vector);
		
		int veces = cuantos_impares(vector);
		System.out.printf("Hay %d números impares", veces);
		

	}

}
