package es.studium.Operaciones1;

import java.util.Scanner;

public class Operaciones1 {
	public static void main(String[] args) {
		int num1,num2;
		//int suma, resta, producto;
		//double cociente;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el primer número:");
		num1=teclado.nextInt();
		
		System.out.println("Escribe el segun número:");
		num2=teclado.nextInt();
		
		System.out.println("La suma de los dos números es:"+(num1+num2)+","+" "+
				 "La recta de los dos numeros es:" +(num1-num2)+","+" "+ "El producto de los dos números es:"+(num1*num2)+
				","+" "+ "El cociente de los dos números es:"+(num1/num2)+".");
		
		teclado.close();
		if(num2!=0) {
			System.out.println("El cociente vale"+ (num1/num2));
			
		}
		else {
			System.out.println("El numero no puede ser 0");
		}
		//
	}

}
