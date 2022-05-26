package QuartoDesafio;

import java.util.Scanner;

public class Maior {
	public static void main (String [] args) {

		Scanner entrada = new Scanner (System.in);
		int a, b, s;
		int maior = 0;

		System.out.println("Digite 3 números inteiros: ");

		for(int i = 0; i < 1; i++){
			a = entrada.nextInt();
			b = entrada.nextInt();
			s = entrada.nextInt();

			maior = s > (a>b ? a:b) ? s:((a>b) ? a:b); 
			System.out.println(maior + " eh o maior");
		}
	}

}

