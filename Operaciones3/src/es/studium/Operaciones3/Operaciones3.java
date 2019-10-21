package es.studium.Operaciones3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Declaraci�n de variables
		int num1, num2, num3;
		/*BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo) almacenando 
		en el b�fer caracteres que leen a la perfecci�n caracteres, matrices o l�neas.*/
		
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Indicar el primer n�mero:");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar el segundo n�mero:");

		num2 = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar el tercer n�mero:");
		num3 = Integer.parseInt(lectura.readLine());
		System.out.println("La suma de los tres n�meros es:" + suma(num1, num2, num3));
		System.out.println("El producto de los tres n�meros es:" + producto(num1, num2, num3));
		System.out.println("La media de los tres n�meros es:" + media(num1, num2, num3));
	}
	//Funci�n suma
	public static int suma(int a, int b, int c) {
		int suma;
		suma = a + b + c;
		return (suma);
	}
	//Funci�n producto
	public static int producto(int a, int b, int c) {
		int producto;
		producto = a * b * c;
		return (producto);
	}
	//Funci�n media
	public static float media(int a, int b, int c) {
		float media;
		media = (float) (a + b + c) / 3;
		return (media);
	}
}
