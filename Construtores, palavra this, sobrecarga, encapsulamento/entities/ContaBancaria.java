package entities;

public class ContaBancaria {
	private int numConta;
	private String name;
	private double saldo;
	
	public ContaBancaria(int numConta, String name, double depInicial) {
		this.numConta = numConta;
		this.name = name;
		deposito(depInicial);
	}
	
	public ContaBancaria(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque + 5.00;
	}
	
	@Override
	public String toString() {
		return "Account " 
				+ numConta 
				+ ", Holder: " 
				+ name 
				+ String.format(", Balance: $%.2f", saldo);
	}

}
	
