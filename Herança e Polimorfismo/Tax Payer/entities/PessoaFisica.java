package entities;

public class PessoaFisica extends Conta{
	
	private Double gastoSaude;

	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double calculoImposto() {
		double imposto;
		if (getRendaAnual() < 20000) {
			imposto = getRendaAnual() * 0.15;
		} else {
			imposto = getRendaAnual() * 0.25;
		}
		
		if(getGastoSaude() > 0){
			imposto -= getGastoSaude() * 0.5;
		}
		return imposto;
	}
}
