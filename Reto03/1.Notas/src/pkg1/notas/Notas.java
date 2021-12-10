/*
1. Realice un pequeño programa que reciba del usuario un conjunto de notas,es decir, de números con coma
flotante (es decir, con decimales, tipo double o float) entre 0 y 5 separados por comas y los guarde en un vector. 
Luego, con base en dichas notas debe calcular:
a. La mayor nota.
b. La menor nota.
c. El promedio de las notas.
d. La desviación estándar del conjunto de notas.
Nota: Se recomienda usar el método split de la clase String.
 */
package pkg1.notas;

import java.util.Scanner;
import java.math.BigDecimal;

public class Notas {

    public static void main(String[] args) {
      
    /*Scanner leer = new Scanner(System.in);
        int numNotas;
        double[] notas;
        double suma=0, promedio, max, min;
        
        
        
        System.out.print("Numero de notas que desea ingresar: ");
        numNotas = leer.nextInt();
        notas = new double[numNotas];

        System.out.println("Ingrese un total de: " + numNotas + " notas");
        for(int i=0; i<notas.length; i++){
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i] = leer.nextDouble();
        }

        //Hacemos los calculos deseados..
        
        System.out.println("Las Notas a evaluar: ");
        for (double nota : notas) {
            System.out.print(nota + "   ");
        }

        //suma de las notas
        
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("\nSuma total de Notas: " + suma);

        //promedio de todas las notas
        
        promedio = suma / numNotas;
        if ( promedio <=5 && promedio > 3.5){
            System.out.println("Tuviste un gran promedio este semestre y su promedio fue: " + promedio);
        } 
        else if(promedio <=3.5 && promedio >= 3){
            System.out.println("Tuviste un promedio regular este semestre y su promedio fue: " + promedio);
        }else {
            System.out.println("Perdiste la materia y tu promedio fue: " + promedio);
    }
                  
        //nota mas alta
        max = notas[0];
        for (int i=0; i<notas.length; i++) {
            if(notas[i] > max){
                max = notas[i];
            }
        }
        System.out.println("Nota mas alta: " + max);

        //nota mas baja
        min = notas[0];
        for (int i=0; i<notas.length; i++) {
            if(notas[i] < min){
                min = notas[i];
            }
        }
        System.out.println("Nota mas baja: " + min);

    }
}*/
    
	double desviacion = 0.0;
	float mayorNota = -1.0f;
	float menorNota = 6.0f;
	float notas [];
	float promedio = 0.0f;
	float suma = 0.0f;
	int i = 0;
	int n = 0;
        int j = 0;
        String strNotas [] = new String[100];
	Scanner teclado = new Scanner(System.in);
	String cadena = "";
	
	System.out.print("Ingrese el conjunto de notas a analizar"
                + "\nSepare una nota de otra con la nota\n"
                + "El valor decimal sepárelo con el punto: ");
	cadena = teclado.nextLine();
	strNotas = cadena.split(",");
	n = strNotas.length;
        notas = new float[n];
        n = strNotas.length;
	for (i = 0; i < n; i++) {
		if (Float.valueOf(strNotas[i]) >= 0.0 && Float.valueOf(strNotas[i]) <= 5.0) {
			notas[j] = Float.valueOf(strNotas[i]);
			if(notas[j] > mayorNota) {
				mayorNota = notas[j];
			}
			if(notas[j] < menorNota) {
				menorNota = notas[j];
			}
			suma += notas[j++];
		} else {
			System.out.println ("La nota en la posición " + i + " no está en el rango de 0.0 a 5.0");
		}
	}
        promedio = suma / j;
        suma = 0.0f;
        for (i = 0; i < j; i++) {
            System.out.println(notas[i]);    
            suma += Math.pow(promedio - notas[i], 2);
	}
	desviacion = Math.sqrt(suma / (j - 1));
	System.out.println("La mayor nota es: " + mayorNota);
	System.out.println("La menor nota es: "+ menorNota);
	System.out.println("El promedio de las notas es: " + promedio);
	System.out.println("La desviación estándar del conjunto de notas es: " + desviacion);
}}
    
    
        
    
   