package SegundoDesafio;

import java.util.Scanner;

public class TurnoDeTrabalho {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em que turno você trabalha? \nM - matutino \nV - Vespertino \nN - noturno ");
		String periodo = entrada.nextLine();
		
		if (periodo.equals("M") || periodo.equals("m")) {
			System.out.println("Bom dia!");
		} else if (periodo.equals("V") || periodo.equals("v")) {
			System.out.println("Boa tarde!");
		} else if (periodo.equals("N") || periodo.equals("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido!");
		}
		
	}
}
