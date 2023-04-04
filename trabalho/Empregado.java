package trabalho;

public class Empregado extends Pessoa {

	public Empregado(String nome, Pessoa chefe) {
		super(nome, chefe);
	}

	@Override
	public void getListaEmpregadosAssociados() throws Exception {
		throw new Exception("Empregado não tem subordinados");
	}

	@Override
	public void adicionarEmpregado(Pessoa empregado) throws Exception {
		throw new Exception("Empregado não tem subordinados");
		
	}
	

}
