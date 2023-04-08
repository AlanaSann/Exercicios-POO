package youtube;

public class Visualizacao {	// relação de agregação
	private Inscrito espectador;
	private Video filme;
	
	
	public Visualizacao(Inscrito espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.viuMaisUm();
		this.espectador.ganharExp();
		this.filme.setVisualizacao(this.filme.getVisualizacao() + 1);
		
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avalitar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int total = 0;
		if(porc <= 20) {
			total = 3;
		}else if(porc <= 50){
			total = 5;
		}else if(porc <= 90) {
			total = 8;
		}else {
			total = 10;
		}
		this.filme.setAvaliacao(total);
	}

	public Inscrito getEspectador() {
		return espectador;
	}

	public void setEspectador(Inscrito espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
}
