package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2 {

	public static void main(String[] args) {
		int num1, num2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el primer número");
		num1 = teclado.nextInt();

		System.out.println("Dame el segundo número");
		num2 = teclado.nextInt();

		System.out.println(funcionSuma(num1, num2));
		System.out.println(funcionRecta(num1, num2));
		System.out.println(funcionProducto(num1, num2));
		System.out.println(funcionCociente(num1, num2));
		teclado.close();
		if(num2!=0)
		{
			System.out.println("El valor de b no puede ser 0 para poder hacer la division");
		}
		else {
			System.out.println("Letsgoo");
		}
	}

	private static int funcionSuma(int num1, int num2) {
		return (num1 + num2);
	}

	private static int funcionRecta(int num1, int num2) {
		return (num1 - num2);
	}

	private static int funcionProducto(int num1, int num2) {
		return (num1 * num2);
	}

	private static int funcionCociente(int num1, int num2) {
		return (num1 / num2);
	}

}
