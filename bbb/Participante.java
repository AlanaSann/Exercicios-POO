package bbb;

public class Participante {
	private String nome;
	private int codigo;
	boolean vencedor;
	private float votos;
	private int paredao;
	
	public Participante(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.votos = 0;
		this.paredao = 0;
	}
	
	public int getParedao() {
		return paredao;
	}

	public void setParedao(int paredao) {
		this.paredao = this.paredao + paredao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Participante [nome=" + nome + ", codigo=" + codigo + ", votos=" + votos + " vezes no paredao: " + paredao +"]";
	}
	public boolean isVencedor() {
		return vencedor;
	}
	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}
	public float getVotos() {
		return votos;
	}
	public void setVotos(float votos) {
		this.votos = votos;
	}
	
	
}
