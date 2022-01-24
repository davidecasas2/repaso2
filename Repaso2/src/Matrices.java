/**
 * 
 */


import java.util.Scanner;

/**
 * @author David
 *
 */
public class Matrices {

	/**
	 * Método que pide una matriz por teclado
	 * @param matriz Matriz a ingresar por teclado
	 */
	public static void pedir_matriz(int matriz[][]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d): ", i,j);
				matriz[i][j]=entrada.nextInt();
			}
		}
	}
	
	/**
	 * Método que muestra un matriz por la pantalla
	 * @param matriz la matriz a mostrar.
	 */
	public static void mostrar_matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Método que incializa una matriz a un valor pasado como parámetro
	 * @param matriz la matriz a inicializar
	 * @param num el valor utilizado en la incialización
	 * @
	 */
	public static void incializar(int matriz[][], int num) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]=num;
			}
		}
	}
	
	/**
	 * Método de la clase que indica si todos los elemento de un matriz son cero o no 
	 * @param matriz la matriz a comprobar
	 * @return true si son todos cero y falso en caso contrario
	 */
	public static boolean sonTodosCero(int matriz [][]) {
		boolean soncero=true;
		
		for (int i = 0; i < matriz.length && soncero; i++) {
			for (int j = 0; j < matriz[0].length && soncero; j++) {
				if (matriz[i][j]!=0) {
					soncero=false;
				} 
			}
		}
		return soncero;
	}
	
	/**
	 * Método de la clase que cuenta cuantos númreos de la matriz son iguales a uno 
	 * dado como parámetro
	 * @param matriz la matriz a comprobar
	 * @param a el valor a buscar
	 * @return int con el número de ocurrencias
	 */
	public static int cuantos_son_a(int matriz[][], int a) {
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j]==a) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	/**
	 * Función que calcula si un matriz es tringular superior
	 * @param matriz la matriz a calcular
	 * @return true si triangular superior y false en caso contrario
	 */
	public static boolean esTRiangularSup(int matriz [][]) {
		boolean triangsup=true;
		
		for (int i = 1; i < matriz.length && triangsup; i++) {
			for (int j = 0; j <i && triangsup; j++) {
				if (matriz[i][j]!=0) {
					triangsup=false;
				} 
			}
		}
		return triangsup;
	}
	
	/**
	 * Función que calcula si un matriz es tringular inferior
	 * @param matriz la matriz a calcular
	 * @return true si triangular superior y false en caso contrario
	 */
	public static boolean esTRiangularInf(int matriz [][]) {
		boolean trianginf=true;
		
		for (int i = 0; i < matriz.length-1 && trianginf; i++) {
			for (int j = i+1; j <matriz.length && trianginf; j++) {
				if (matriz[i][j]!=0) {
					trianginf=false;
				} 
			}
		}
		return trianginf;
	}
	
	public static boolean esDiagonal(int m[][]) {
		return esTRiangularInf(m) && esTRiangularSup(m);
	}
	
	/**
	 * Método que devuelve el mayor elemetno de la matriz
	 * @param m la matriz a comprobar
	 * @return int co el número mayor de la matriz
	 */
	public static int max_valor(int m[][]) {
		int mayor = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] > mayor) {
					mayor = m[i][j];
				}
			}
		}
		return mayor;
	}
	
	/**
	 * Método que devuelve el menor elemetno de la matriz
	 * @param m la matriz a comprobar
	 * @return int co el número menor de la matriz
	 */
	public static int min_valor(int m[][]) {
		int menor = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < menor) {
					menor = m[i][j];
				}
			}
		}
		return menor;
	}
	
	public static int determinante(int m[][]) {
		return m[0][0]*m[1][1]*m[2][2] + m[1][0]*m[2][1]*m[0][2] + m[1][0]*m[0][1]*m[1][2]
			  -m[2][0]*m[1][1]*m[0][2] - m[0][0]*m[2][1]*m[1][2] - m[0][1]*m[1][0]*m[2][2];		
				
	}
	
	/**
	 * Método que devuelve la matriz traspuesta de la matriz pasada como parámetro.
	 * @param m la matriz a trasponer
	 * @return la matriz traspuesta
	 */
	public static int[][] trasponer (int m[][]) {
		int traspuesta [][] = new int[m[0].length][m.length];
		
		for (int i = 0; i < traspuesta.length; i++) {
			for (int j = 0; j < traspuesta[0].length; j++) {
				traspuesta[i][j] = m[j][i];
			}
		}
		return traspuesta;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int [][] productoMatrices( int a[][], int b[][]) {
		int c[][]=new int[a.length][b[0].length];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				c[i][j]=0;
				for (int k = 0; k < b.length; k++) {
					c[i][j]=c[i][j]+ a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	
	/**
	 * Método que devuelve un vector con las medias aritneticas de cada fila de la 
	 * matriz
	 * @param m la matriz a calcular
	 * @param v el vector con las medias
	 */
	public static void media_filas(int m[][], double v[]) {
		double suma = 0;
		for (int i = 0; i < m.length; i++) {
			suma=0;
			for (int j = 0; j < m[0].length; j++) {
				suma=suma+m[i][j];
			}
			v[i]=suma/m[0].length;
		}
	}
	
	/**
	 * Método que devuelve un vector con las medias aritneticas de cada columna de la 
	 * matriz
	 * @param m la matriz a calcular
	 * @param v el vector con las medias
	 */
	public static void media_columnas(int m[][], double v[]) {
		double suma = 0;
		
		for (int j = 0; j < m[0].length; j++) {
			suma=0;
			for (int i = 0; i < m.length; i++) {
				suma=suma+m[i][j];
			}
			v[j]=suma/m.length;
		}
	}
	
	public static boolean esDispersa(int m[][]) {
		boolean dispersa=true;
		
		for (int i = 0; i < m.length && dispersa; i++) {
			dispersa=false;
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j]==0) {
					dispersa=true;
				}
			}
		}
		boolean dispersa2 =true;
		for (int j = 0; j < m[0].length && dispersa2; j++) {
			dispersa2=false;
			for (int i = 0; i < m.length; i++) {
				if (m[i][j]==0) {
					dispersa2=true;
				}
			}
		}
		return dispersa && dispersa2;
		
	}
}
