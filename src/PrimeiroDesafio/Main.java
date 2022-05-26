package PrimeiroDesafio;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Pessoa pessoa = new Pessoa();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o seu ano de nascimento: ");
		pessoa.calcularIdade(entrada.nextInt());
		
		System.out.println("Insira a cor dos olhos do Pai: ");
		String corDosOlhos1 = entrada.next();
		
		System.out.println("Insira a cor dos olhos da Mäe: ");
		String corDosOlhos2 = entrada.next();
		
		pessoa.probabilidade(corDosOlhos1, corDosOlhos2);
	}
	
}
