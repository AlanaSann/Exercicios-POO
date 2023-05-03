package hereditario;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Pessoa antecessor;
	private List<Pessoa> descendentes;
	
	public Pessoa(Pessoa antecessor,String nome) {
		this.nome = nome;
		this.antecessor = antecessor;
		this.descendentes = new ArrayList<Pessoa>();
	}

	public List<Pessoa> getDescendentes() {
		return descendentes;
	}

	public Pessoa getAntecessor() {
		return antecessor;
	}

	public void setAntecessor(Pessoa antecessor) {
		this.antecessor = antecessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract Pessoa cadastrarFilhos(String nome,char sexo) throws Exception;
	
	public void listarAntecessores(){
		if(this.getAntecessor() != null) {
			System.out.println(this.getAntecessor().getNome());
			this.getAntecessor().listarAntecessores();
		}
	}
	
	public Pessoa buscarPessoa(String nome) {
		if(nome.equalsIgnoreCase(this.getNome())) {
			return this;
		}
		Pessoa filho = null;
		for(int i = 0; i < this.getDescendentes().size();i++) {
			filho = this.getDescendentes().get(i).buscarPessoa(nome); 
			if(filho != null) {
				return filho;
			}
		}	
		return null;
	}


}
