package hereditario;

import java.util.Random;

public class Filha extends Pessoa {

	public Filha(Pessoa antecessor, String nome) {
		super(antecessor, nome);
		this.setNome("Sra" + nome);
		if(antecessor != null) {
			antecessor.getDescendentes().add(this);
		}
	}
	
	public static Pessoa setFilha(Pessoa antecessor,String nome) { // metodo de acesso para o construtor filha.
		return new Filha(antecessor,nome);
	}

	@Override
	public Pessoa cadastrarFilhos(String nome, char sexo) {
		if(sexo == 'f') {
			Pessoa filha= setFilha(this,nome);
			return filha;
		}
		if(sexo =='m') {
			Random probabilidade = new Random();
			if(probabilidade.nextInt(2) == 1) {
				Pessoa filho = Filho.setFilho(this,nome);
				return filho;
			}
			Pessoa morta = new Natimorto(this,nome);
			return morta;
		}
		return null;
	}

}
