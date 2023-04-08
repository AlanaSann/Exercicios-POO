package biblioteca;

import java.util.Random;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public void detalhes() {
		System.out.println("**************************************");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de paginas: " + this.getTotPaginas());
		System.out.println("Pagina atual: " + this.getPagAtual());
		System.out.println("Está aberto? " + this.isAberto());
		System.out.println("Leitor do livro: " + this.getLeitor().getNome());
	}
	

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		if(this.isAberto() == true) {
			System.out.println("Livro ja está aberto");
		}else {
		this.setAberto(true);
		}
	}


	@Override
	public void fechar() {
		if(this.isAberto() == true) {
			this.setAberto(false);
		}else {
			System.out.println("Livro já está fechado");
		}
	}


	@Override
	public void folhear() {
		Random aleatorio = new Random();
		if(this.isAberto() == true) {
			int pagina = aleatorio.nextInt(this.getTotPaginas());
			this.setPagAtual(pagina);
		}else {
			System.out.println("Impossivel folhear com livro fechado");
		}
		
	}


	@Override
	public void avancarPag() {
		if(this.isAberto() == true && this.getPagAtual() < this.getTotPaginas() ) {
			this.setPagAtual(this.getPagAtual() + 1);
		}else {
			System.out.println("Impossivel avancar página");
		}
	}


	@Override
	public void voltarPag() {
		if(this.isAberto() == true && this.getPagAtual() >= 1) {
			this.setPagAtual(getPagAtual() - 1);
		}else {
			System.out.println("Impossivel voltar página");
		}
	}
	
	
}
