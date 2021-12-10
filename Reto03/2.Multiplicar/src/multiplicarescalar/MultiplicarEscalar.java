/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicarescalar;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MultiplicarEscalar {
    
   
     
        
     
    /*    Scanner leer = new Scanner(System.in);
       
        int a[],b[], c[];
        int numNotas;
        
        System.out.print("Numero de # que tiene el vector: ");
        numNotas = leer.nextInt();
        a = new int[numNotas];
        
        System.out.print("Digite primer arreglo: ");
        for (int i=0; i<a.length; i++){
           
            System.out.print("A[ "+ (i+1) + "]: ");
            a[i] = leer.nextInt();
        }
        
        System.out.print("Numero de 2# que tiene el vector: ");
        numNotas = leer.nextInt();
        b = new int[numNotas];
        
        System.out.print("Digite primer arreglo: ");
        for (int i=0; i < b.length; i++){
          
            System.out.print("B["+ (i+1) + "]: ");
            b[i] = leer.nextInt();
        }
        
        System.out.print("Numero de # que tiene el vector: ");
        numNotas = leer.nextInt();
        c = new int[numNotas];
        
        int j=0;
        for(int i=0; i < a.length && i < b.length; i++){
             c[j] = a[i];
             i++;
             c[j] = b[i];
             i++;
        }
        System.out.println("\n Multiplicacion de arreglos es: ");
        for(int i=0; i<a.length; i++){
            System.out.println(c[i] + "");
        }
    
    }
}


/*
Realice una función que implemente la multiplicación escalar de dos vectores de cualquier
tamaño.
*/

public static void main(String[] args){
	float vectorDos [];
	float vectorUno [];
	int i = 0;
	int n = 0;
	float productoEscalar = 0f;
	Scanner teclado = new Scanner(System.in);
	String cadena = "";
	
	System.out.print("Ingrese el número de elementos de los vectores: ");
	n = teclado.nextInt();
	
	vectorUno = new float [n];
	vectorDos = new float [n];
	
	System.out.println("Ingrese los datos del vector uno");
	for (i = 0; i < n; i++) {
		System.out.print("Ingrese el elemento [" + (i+1) + "] del vector uno: ");
		vectorUno[i] = teclado.nextFloat();
	}		
	
	System.out.println("Ingrese los datos del vector dos");
	for (i = 0 ; i < n; i++) {
		System.out.print("Ingrese el elemento [" + (i+1) + "] del vector dos: ");
		vectorDos[i] = teclado.nextFloat();
	}

	for (i = 0; i < n; i++) {
		cadena = cadena + vectorUno[i] + "*" + vectorDos[i] + " + ";
		productoEscalar += vectorUno[i] * vectorDos[i];
	}
	
	cadena = cadena.substring(0,cadena.length()- 3);
	System.out.println("El producto escalar de los dos vectores es: [" + cadena + "]");
	System.out.println("Y su valor es : " + productoEscalar);
}
}






















      


