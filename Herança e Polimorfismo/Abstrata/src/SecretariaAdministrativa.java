import java.time.LocalDate;

public class SecretariaAdministrativa extends Secretaria{

	public SecretariaAdministrativa(String nome, String rg, LocalDate dtnascimento, String cpf, double salario) {
		super(nome, rg, dtnascimento, cpf, salario);

	}

	@Override
	public String toString() {
		return "\nSecretaria Administrativa \nCPF = " + cpf + "\nSalario = " + salario + "\nNome = " + nome + "\nRG = " + rg
				+ "\nData de Nascimento = " + dtNascimento + "\nBonificação = " + getBonificacao();
	}

	@Override
	public double getBonificacao() {
		return this.salario *1.5;
	}

}
