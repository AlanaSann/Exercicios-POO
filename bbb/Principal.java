package bbb;

public class Principal {
	public static void main(String[] args) {
		Participante p[] = new Participante[2];
		p[0] = new Participante("Julia",101);
		p[1] = new Participante ("Dhomini",102);
		
		System.out.println(p[0].toString());
		System.out.println(p[1].toString());
		
		
		Votacao votacao = new Votacao();
		votacao = new Votacao();
	
		
		votacao.addParticipante(p[0]);
		votacao.addParticipante(p[1]);
		votacao.votar("Julia");
		votacao.votar(102);
		votacao.votar("Dhomini");
		votacao.votar(101);
		p[1].setParedao(1);
		System.out.println(p[0].toString());
		System.out.println(p[1].toString());
		System.out.println("Julia " + p[0].getVotos() + votacao.percentual(p[0]));
		System.out.println("Dhomini "+p[1].getVotos() + votacao.percentual(p[1]));
		votacao.vencedor(p[1],p[0]);
		System.out.println("Julia é vencedora? " + p[0].isVencedor());
		System.out.println("Dhomini é vencedora? " + p[1].isVencedor());
		
	}
}
