package evaluacionUno;

import java.util.Scanner;

public class NumerosRomanos {

	public static void main(String[] args) {
		Scanner objEntrada = new Scanner(System.in);
		for(int contador=1; contador<=50; contador++)
		//System.out.println("Numero: "+contador+" - "+convertir(contador));
		System.out.println(convertir(objEntrada.nextInt()));
		objEntrada.close();
	}

	public static String convertir(int numero) {
		int decenas = 0;
		int unidades = 0;
		decenas = numero / 10;
		unidades = numero % 10;
		String decenasTexto = "";

		if (decenas <= 3)
			for (int contador = 0; contador < decenas; contador++)
				decenasTexto += "X";
		else if (decenas == 4)
			decenasTexto = "XL";
		else if (decenas == 5)
			decenasTexto = "XL";
		String unidadesTexto = "";
		if (unidades <= 3)
			for (int contador = 0; contador < unidades; contador++)
				unidadesTexto += "I";
		else if (unidades == 4)
			unidadesTexto = "IV";
		else if (unidades == 5)
			unidadesTexto = "V";
		else if (unidades <9) {
			unidadesTexto = "V";
			for (int contador = 5; contador < unidades; contador++)
				unidadesTexto+="I";
		}
		else if (unidades <=9)
			unidadesTexto += "IX";
		
		return decenasTexto + "" + unidadesTexto;
	}
}