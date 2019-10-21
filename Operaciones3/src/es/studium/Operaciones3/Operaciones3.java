package es.studium.Operaciones3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Declaración de variables
		int num1, num2, num3;
		/*BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo) almacenando 
		en el búfer caracteres que leen a la perfección caracteres, matrices o líneas.*/
		
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Indicar el primer número:");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar el segundo número:");

		num2 = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar el tercer número:");
		num3 = Integer.parseInt(lectura.readLine());
		System.out.println("La suma de los tres números es:" + suma(num1, num2, num3));
		System.out.println("El producto de los tres números es:" + producto(num1, num2, num3));
		System.out.println("La media de los tres números es:" + media(num1, num2, num3));
	}
	//Función suma
	public static int suma(int a, int b, int c) {
		int suma;
		suma = a + b + c;
		return (suma);
	}
	//Función producto
	public static int producto(int a, int b, int c) {
		int producto;
		producto = a * b * c;
		return (producto);
	}
	//Función media
	public static float media(int a, int b, int c) {
		float media;
		media = (float) (a + b + c) / 3;
		return (media);
	}
}
