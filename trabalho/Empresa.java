package trabalho;

public class Empresa {
	public static void main(String[] args) throws Exception {
		Pessoa antonio = new Chefe("Antonio",null);
		Pessoa manoel = new Empregado("Manoel",antonio);
		Pessoa davi = new Chefe("Davi",antonio);
		Pessoa roberto = new Empregado("Roberto",davi);
		Pessoa jose = new Chefe("Jose",davi);
		Pessoa maria = new Empregado("Maria",jose);
		Pessoa Marcos = new Empregado("Marcos",jose);
		
		antonio.adicionarEmpregado(manoel);
		antonio.adicionarEmpregado(davi);
		davi.adicionarEmpregado(roberto);
		davi.adicionarEmpregado(jose);
		jose.adicionarEmpregado(maria);
		jose.adicionarEmpregado(Marcos);
		
		
		
		//antonio.getListaEmpregadosAssociados();
		//maria.listarSuperiores();
		//jose.listarSuperiores();
		manoel.listarMeusEmpregados();
		//antonio.listarMeusEmpregados();
		
		
		
		
	
	
	
	
	
	
	}
}
