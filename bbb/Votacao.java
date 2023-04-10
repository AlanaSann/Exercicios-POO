package bbb;

import java.util.ArrayList;

public class Votacao {
	private int totalDeVotos;
	ArrayList<Participante> participantes = new ArrayList<>();
	
	public void addParticipante(Participante participante) {
		participantes.add(participante);
		participante.setParedao(participante.getParedao() + 1);
	}
	public int getTotalDeVotos() {
		return totalDeVotos;
	}

	public void votar(String nome) {
		for (Participante participante : participantes) {
			if(nome.equalsIgnoreCase(participante.getNome())){
				participante.setVotos(participante.getVotos() + 1); 
				this.totalDeVotos++;
			}
		}
	}

	public void votar(int codigo) {
		for (Participante participante : participantes) {
			if(codigo == participante.getCodigo()){
				participante.setVotos(participante.getVotos() + 1); 
				this.totalDeVotos++;
			}
		}
	}
	
	public double percentual(Participante participante) {
		double porc;
		porc = participante.getVotos()*100/this.getTotalDeVotos();
		return porc;
	}

	public void vencedor(Participante p1,Participante p2) {
		if(p1.getVotos() > p2.getVotos()) {
			p1.vencedor = true;
		}else {
			p2.vencedor = false;
		}
		if(p1.getVotos() == p2.getVotos() && p1.getParedao() > p2.getParedao()){
			p1.vencedor = true;
		}else {
			p2.vencedor = false;
		}
	}
}
