/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearmatriz;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CrearMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	double matriz [][];
	int i = 0;
	int j = 0;
	int m = 0;
	int n = 0;
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Ingrese el número de filas (N) de la matriz: ");
	n = teclado.nextInt();
	System.out.print("Ingrese el número de columnas (M) de la matriz: ");
	m = teclado.nextInt();
	
	matriz = new double[n][m];
	
	for (i = 0; i < n; i++){
		for (j = 0; j < m; j++){
			System.out.print("Ingrese el elemento de la columna [" + (i+1) + "] y fila [" + (j+1) + "] : " );
			matriz[i][j] = teclado.nextDouble();
		}
	}
	
	for (j = 0; j < m; j++){
		for (i = 0; i < n; i++){
			System.out.print(matriz[i][j]+ "\t" );
		}
		System.out.print("\n");
	}
}
        // TODO code application logic here
    }
    

