package TerceiroDesafio;

import java.util.ArrayList;
import java.util.List;

public class Receita {
	public static void main (String[]args) {

		String receita;
		
		List<String> ingrediente = new ArrayList<>();
		ingrediente.add("ovos");
		ingrediente.add("chocolate em p�");
		ingrediente.add("manteiga");
		ingrediente.add("farinha");
		ingrediente.add("a�ucar");
		ingrediente.add("fermento");
		ingrediente.add("leite");

		System.out.println("Bolo" + ingrediente);

		
	}
}
