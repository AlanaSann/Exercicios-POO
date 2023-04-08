package youtube;

public class Inscrito extends Pessoa{
	private String login;
	private int totAssistido;
	
	public Inscrito(String nome, int idade, char sexo,String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	public void viuMaisUm() {
		this.setTotAssistido(getTotAssistido() + 1);
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Inscrito " + super.toString() + "login=" + login + ", totAssistido=" + totAssistido;
	}
	
	
}
