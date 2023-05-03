package hereditario;

public class Natimorto extends Pessoa {

	public Natimorto(Pessoa antecessor, String nome) {
		super(antecessor, nome);
		this.setNome("Natimorto" + nome);
		if(antecessor != null) {
			antecessor.getDescendentes().add(this);
		}
	}

	public static Pessoa setNatimorto(Pessoa antecessor,String nome) { // metodo de acesso para o construtor filha.
		return new Natimorto(antecessor,nome);
		
	}
	
	@Override
	public Pessoa cadastrarFilhos(String nome, char sexo) throws Exception {
		throw new Exception("Natimorto não tem filho"); 
	}

}
