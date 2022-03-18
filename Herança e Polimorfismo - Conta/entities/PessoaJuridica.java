package entities;

public class PessoaJuridica extends Conta {
	
	private int numFunc;

	public PessoaJuridica(String name, Double rendaAnual, int numFunc) {
		super(name, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public Double calculoImposto() {
		double imposto;
		if (getNumFunc() > 10) {
			imposto = getRendaAnual() * 0.14;
		} else {
			imposto = getRendaAnual() * 0.16;
		}
		return imposto;
	}
}
