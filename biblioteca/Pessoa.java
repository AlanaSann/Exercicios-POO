package biblioteca;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char isSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
