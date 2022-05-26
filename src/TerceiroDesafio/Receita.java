package TerceiroDesafio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Receita {
	public static void main (String[]args) {

		int receita = 1 ;
		
		List<String> ingrediente = new ArrayList<>();
		ingrediente.add("ovos");
		ingrediente.add("chocolate em pó");
		ingrediente.add("manteiga");
		ingrediente.add("farinha");
		ingrediente.add("açucar");
		ingrediente.add("fermento");
		ingrediente.add("leite");


		switch (receita) {
		case 1: 
			System.out.println("Bolo" + ingrediente);
		}
		
		HashMap<Integer, String> qtdEIngredientes = new HashMap<Integer, String>();
		qtdEIngredientes.put(3, "ovos");
		qtdEIngredientes.put(1, "chocolate em po");
		qtdEIngredientes.put(4, "manteiga");
		qtdEIngredientes.put(2, "farinha");		
		qtdEIngredientes.put(2, "açucar");
		qtdEIngredientes.put(1, "açucar");
		qtdEIngredientes.put(1, "leite");
		
		System.out.println("A quantidade de ingredientes necessárias para a receita são: "+ qtdEIngredientes);


	}
}
