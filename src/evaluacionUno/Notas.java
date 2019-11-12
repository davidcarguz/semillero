package evaluacionUno;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner objEntrada = new Scanner(System.in);
		double notaA;
		double notaB;
		double notaC;
		do {
			System.out.println("Ingrese primer nota: ");
			notaA=objEntrada.nextDouble();
		}while(notaA<0 || notaA>5);
		do {
			System.out.println("Ingrese segunda nota: ");
			notaB=objEntrada.nextDouble();
		}while(notaB<0 || notaB>5);
		do {
			System.out.println("Ingrese tercer nota: ");
			notaC=objEntrada.nextDouble();
		}while(notaC<0 || notaC>5);
		System.out.println("Su nota final es: "+calcular(notaA,notaB,notaC));
		objEntrada.close();
	}
	public static double calcular(double notaA, double notaB, double notaC) {
		return (notaA*.3)+(notaB*.33)+(notaC*.37);
	}
}
