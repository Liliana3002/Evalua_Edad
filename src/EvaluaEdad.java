/*Programa que pide introducir la edad y evalua la edad indicando si son mayores o menores de edad,
 * el programa pedirá la edad por consola*/

import java.util.*;//Importar paquete java útil para pedir los datos por consola
public class EvaluaEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//Objeto de tipo scanner ingresado por consola

		
		System.out.println("Introduce por favor tú edad:");//Pedir datos al usuario, solo muestra un texto
	
		int edad=entrada.nextInt();//Variable declarada para que se introduzca un número entero en la variable edad
		
		if(edad>=18){//Condicional if para indicar que la edad sea mayor o igual que 18
				System.out.println("Eres mayor de edad.");//Evalua la condición if y muestra un texto teniendo en cuenta la condición
				}
		else { System.out.println("Eres menor de edad.");//Else indica de lo contrario responde esto
		
		}
	}
}
