package hereditario;

public class Familia {

	public static void main(String[] args) throws Exception{
		Pessoa joao = Filho.setFilho(null, "João");
		Pessoa ana = joao.cadastrarFilhos("Ana", 'f');
		Pessoa Maria = joao.cadastrarFilhos("Maria", 'f');
		
		Pessoa carlos = ana.cadastrarFilhos("Carlos", 'm');
		Pessoa Lucio = ana.cadastrarFilhos("Lucio", 'm');
		
		Pessoa andre = carlos.cadastrarFilhos("Andre", 'm');
		Pessoa paulo = carlos.cadastrarFilhos("Paulo", 'm');
		Pessoa roberta = carlos.cadastrarFilhos("Roberta", 'f');
	
	
		System.out.println(carlos.getNome());
		//System.out.println(Lucio.getNome());
		//System.out.println(ana.getNome());
		//System.out.println(Maria.getNome());
		System.out.println(andre.getNome());
		System.out.println(paulo.getNome());
		System.out.println(roberta.getNome());
		
	
	
	}

}
