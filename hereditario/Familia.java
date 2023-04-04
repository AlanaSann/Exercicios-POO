package hereditario;

public class Familia {

	public static void main(String[] args) {
		Pessoa joao = Filho.setFilho(null, "João");
		Pessoa ana = joao.cadastrarFilhos("Ana", 'f');
		Pessoa Maria = joao.cadastrarFilhos("Maria", 'f');
		Pessoa carlos = ana.cadastrarFilhos("Carlos", 'f');
		Pessoa Lucio = ana.cadastrarFilhos("Lucio", 'm');
		Pessoa andre = carlos.cadastrarFilhos("Andre", 'm');
		Pessoa paulo = carlos.cadastrarFilhos("Paulo", 'm');
		Pessoa roberta = carlos.cadastrarFilhos("Roberta", 'f');
		 
		roberta.listarAntecessores();
	
		System.out.println(Lucio.getNome());
	
	
	}

}
