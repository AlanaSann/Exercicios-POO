package youtube;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private float visualizacao;
	private float curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.visualizacao = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.visualizacao);
		this.avaliacao = avaliacao = nova;
	}
	public float getVisualizacao() {
		return visualizacao;
	}
	public void setVisualizacao(float visualizacao) {
		this.visualizacao = visualizacao;
	}
	public float getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(float curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", visualizacao=" + visualizacao + ", curtidas="
				+ curtidas + ", reproduzindo=" + reproduzindo + "]";
	}
	@Override
	public void play() {
		if(this.isReproduzindo() == false) {
		this.setReproduzindo(true);
		this.setVisualizacao(getVisualizacao() + 1);
		}else {
			System.out.println("Video ja está sendo reproduzido");
		}
	}
	@Override
	public void pause() {
		if(this.isReproduzindo() == true) {
			this.setReproduzindo(false);
		}else {
			System.out.println("Video ja está pausado");
		}
		
	}
	@Override
	public void like() {
		this.setAvaliacao(getAvaliacao()+1);
	}
	
	
}
