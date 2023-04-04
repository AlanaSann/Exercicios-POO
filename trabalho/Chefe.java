package trabalho;

public class Chefe extends Pessoa{

	public Chefe(String nome, Pessoa chefe) {
		super(nome, chefe);
	}

	@Override
	public void getListaEmpregadosAssociados() throws Exception {
		if(this.empregados != null)
		for (Pessoa pessoa : empregados) {
			System.out.println(pessoa.getNome());
			pessoa.getEmpregados();
		}
	}

	@Override
	public void adicionarEmpregado(Pessoa empregado) throws Exception {
		this.empregados.add(empregado);
		
	}

}
