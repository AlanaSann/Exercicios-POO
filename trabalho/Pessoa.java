package trabalho;

import java.util.ArrayList;

public abstract class Pessoa {
	private String nome;
	private Pessoa chefe;
	ArrayList<Pessoa> empregados;
	
	
	public Pessoa(String nome, Pessoa chefe) {
		this.nome = nome;
		this.chefe = chefe;
		this.empregados = new ArrayList<Pessoa>();
	}

	
	public ArrayList<Pessoa> getEmpregados() {
		return empregados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa getChefe() {
		return chefe;
	}

	public void setChefe(Pessoa chefe) {
		this.chefe = chefe;
	}

	public abstract void getListaEmpregadosAssociados() throws Exception;
	
	public abstract void adicionarEmpregado(Pessoa empregado) throws Exception;
	
	public void listarSuperiores() throws Exception {
		if(this.chefe != null) {
		System.out.println(this.getChefe().getNome());
		this.getChefe().listarSuperiores();
		}
	}
	public void listarMeusEmpregados(){
		if(this.empregados != null) {
			for (Pessoa pessoa : empregados) {
				System.out.println(pessoa.getNome());
			}
			}
		}
		
	}
	
	
	
