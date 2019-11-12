package evaluacionUno;

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		Scanner objEntrada = new Scanner(System.in);
		System.out.println("Ingrese primer número: ");
		int numeroA=objEntrada.nextInt();
		System.out.println("Ingrese segundo número: ");
		int numeroB=objEntrada.nextInt();
		System.out.println("Ingrese signo: ");
		String signo=objEntrada.next();
		System.out.println(calcular(numeroA,numeroB,signo));
		objEntrada.close();
	}
	public static int calcular(int numeroA, int numeroB, String signo) {
		int resultado=0;
		if(signo.equalsIgnoreCase("/"))
			resultado=numeroA/numeroB;
		else if(signo.equalsIgnoreCase("*"))
			resultado=numeroA*numeroB;
		else if(signo.equalsIgnoreCase("+"))
			resultado=numeroA+numeroB;
		else if(signo.equalsIgnoreCase("-"))
			resultado=numeroA-numeroB;
		return resultado;
	}

}
