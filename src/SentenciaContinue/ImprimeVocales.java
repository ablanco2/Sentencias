package SentenciaContinue;
import java.util.Scanner;

public class ImprimeVocales {
/*
 * En el primer m�todo con la sentencia continue lo que hace es si ejecutamos esta instruccion de continue;
 * no se ejecutar�a el restro de instrucci�n, es decir no se imprime y provocar�a la siguiente iteraci�n en el bucle for 
 * volver�amos hasta el imprime
 */

	void imprimeVocales1 (String cadena){
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (!"AEIOUaeiou".contains(Character.toString(letra)))
				continue;
			System.out.print(letra);
		}
		System.out.println("");
	}
	
	void imprimeVocales2 (String cadena){
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if ("AEIOUaeiou".contains(Character.toString(letra)))
				System.out.print(letra);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		//Inicializaci�n y Entrada
		System.out.print("Introduzca una cadena de texto: ");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		ImprimeVocales programa = new ImprimeVocales();
		
		//Proceso y Salida
		System.out.println("Vocales por el M�todo 1: ");
		programa.imprimeVocales1 (texto);
		System.out.println("Vocales por el M�todo 2: ");
		programa.imprimeVocales2 (texto);
	}
}
