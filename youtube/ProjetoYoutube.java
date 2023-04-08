package youtube;

public class ProjetoYoutube {
	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Tudo sobre POO");
		v[2] = new Video("Exercicios sobre POO");
		
		Inscrito i[] = new Inscrito[2];
		
		i[0] = new Inscrito("Julia",22,'F',"J123");
		i[1] = new Inscrito("Carlos",29,'M',"Carlos099");
		
		Visualizacao vis = new Visualizacao(i[0],v[0]);//Julia assiste Aula 1 de POO
		vis.avaliar();
		System.out.println(vis.toString());
		
		Visualizacao vis2 = new Visualizacao(i[0],v[1]);//Julia assite Tudo sobre POO
		vis2.avaliar(87.0f);
		System.out.println(vis2.toString());
		
				
		System.out.println("VIDEOS\n ----------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("\nINSCRITOS\n ------------------------");
		System.out.println(i[0].toString());
		System.out.println(i[1].toString());
		
		
		
	}
}
