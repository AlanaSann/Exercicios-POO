package ufc;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador desafiante, Lutador desafiado) {
		if(desafiante != desafiado &&
				desafiante.getCategoria().equals(desafiado.getCategoria())){
		this.setAprovada(true);	
		this.setDesafiado(desafiado);
		this.setDesafiante(desafiante);
		System.out.println("Luta marcada com sucesso!");
		}else {
			this.setAprovada(false);
			desafiante = null;
			desafiado = null;
		System.out.println("Luta não pode acontecer");
		}
	}
	
	public void lutar() {
		
		
		if(this.isAprovada()) {
			
			System.out.println("### DESAFIANTE ###");
			desafiante.status();
			System.out.println("### DESAFIADO ###");
			desafiado.status();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0:
				System.out.println("VITORIA DO " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 1: 
				System.out.println("VITORIA DO " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			case 2: 
				System.out.println("EMPATE ");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			}
		}else {
			System.out.println("Luta não pode acontecer");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
