package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;
import br.unincor.controle.Operacoes;
import br.unincor.exception.EvolucaoException;

public class Main {

	public static void main(String[] args) {
		
		Usuario gui = new Usuario();
		Operacoes op = new Operacoes();
		
		List<Pokemon> listapokemons = new ArrayList<Pokemon>();
		
		Long nPokemons = gui.recebeLong("Quantos pokemons devem ser criados?");
		
		for (int i = 0; i < nPokemons; i++) {
			Pokemon p = new Pokemon(gui.recebeTexto("Nome pokemon:"), 
					gui.recebeTexto("Tipo pokemon:"), 
					gui.recebeDouble("Peso pokemon:"),
					gui.recebeDouble("Altura pokemon:"));
			listapokemons.add(p);			
		}
		
		for (int i = 0; i < listapokemons.size(); i++) {
			try {
				op.evoluir(listapokemons.get(i));
			} catch (EvolucaoException e) {
				// TODO: handle exception
				gui.exibeMsg(e.getMessage());
			}			
		}
		
		
		gui.exibeMsg("====Pokemon com maior CP====\n\n" +
				"    <" + op.maiorCp(listapokemons) + ">    ");	
		
		gui.exibeMsg("====Pokemon com menor CP====\n\n" +
		"    <" + op.menorCp(listapokemons) + ">    ");
		
		
		
		
	}

}
