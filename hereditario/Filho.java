package hereditario;

public class Filho extends Pessoa{

	private Filho(Pessoa antecessor, String nome) {
		super(antecessor, nome);
		this.setNome("Sr" + nome);
		if(antecessor != null) {
			antecessor.getDescendentes().add(this);
		}
	}
	
	public static Pessoa setFilho(Pessoa antecessor,String nome) { // metodo de acesso para o construtor filho.
		return new Filho(antecessor,nome);
	}

	@Override
	public Pessoa cadastrarFilhos(String nome,char sexo) {
		
		if(this.getDescendentes().size() == 1) {
			Pessoa filho = new Natimorto(this,nome);
			return filho;
		}
		if(sexo == 'f') {
			Pessoa filha= Filha.setFilha(this,nome);
			return filha;
		}
		if(sexo =='m') {
			Pessoa filho = setFilho(this,nome);
			return filho;
		}
	
		return null;
	}
	
	

}
