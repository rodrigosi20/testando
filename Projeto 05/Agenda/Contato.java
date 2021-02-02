package Agenda;

import java.awt.Label;
import java.util.ArrayList;

public class Contato {
	
	public String nome;
	public ArrayList<Fone> telefones;
	
	public Contato(String nome) {
		this.nome = nome;
		this.telefones = new ArrayList<>();
	}
	
	public void adicionarTelefone(String label, String numero) {
		if (Fone.validador(numero)) {
			telefones.add(new Fone(label, numero));
		}else {
			System.out.println("Número inválido");
		}
		
	}
	
	public void removerTelefone(int indice) {
		if (telefones.size() <= 0) {
			System.out.println("Agenda Vazia");
		}else if (indice > telefones.size()) {
			System.out.println("Índice inválido");
		}else {
			telefones.remove(indice);
		}
	}
	
	public String toString() {
		String painel = "-" + this.nome;
		for (int i = 0; i < telefones.size(); i++) {
			painel += " [" + i + ":" + telefones.get(i).label + ":" + telefones.get(i).numero + "]";
		}
		
		return painel;
	}

	
	
	
	
	
}
