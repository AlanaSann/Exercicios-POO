package exercicio;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String tipo ) {
		this.setStatus(true);
		this.setTipo(tipo);
		if(tipo.equals("cc")) {
			this.setSaldo(50.00);
			}else if(tipo.equals("cp")){
				this.setSaldo(150.00);
				}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if(this.getSaldo() == 0) {
			this.status = false;
		}else {
			System.out.println("Não é possivel fechar a conta");
		}
	}
	
	public void depositar(double valor) {
		if(this.isStatus()) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Depósito realizado");
		}else {
		System.out.println("Impossivel depositar nessa conta");
		}
	}
	
	public void sacar(double valor) {
		if(this.isStatus()) {
		if(this.getSaldo() < valor) {
			System.out.println("Saldo inssuficiente");
		}else {
			this.setSaldo(this.getSaldo() - valor);
			//this.saldo = this.saldo - valor;
			}
		}
	}
	public void pagarMensal() {
		if(getTipo().equals("cc") && (this.getSaldo() >= 12)) {
			this.sacar(12.00);
			}else if (getTipo().equals("cp")&& (this.getSaldo() >= 20.00)){
				this.sacar(20.00);
				}else {
					System.out.println("Impossivel pagar");
				}
	}
	public void estadoAtual() {
		System.out.println("-------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	
	
}
