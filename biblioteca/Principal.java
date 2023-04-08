package biblioteca;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("Maria",20,'F');
		p[1] = new Pessoa("Pedro",25,'M');
		
		l[0] = new Livro("Bela adormecida","Stephen King",500,p[0]);
		l[1] = new Livro("Aprendendo Java", "José da Silva", 200,p[0]);
		l[2] = new Livro("POO para Iniciantes", "Pedro Paulo", 800, p[1]);
	
		l[0].abrir();
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].fechar();
		l[0].voltarPag();
		l[0].detalhes();
		p[0].fazerAniver();
		System.out.println(p[0].getIdade());
		
	}
	
	
}
