import java.time.LocalDate;

public class Gerente extends Funcionario {
    SecretariaAdministrativa secretaria;
    public Gerente(String nome, String rg, LocalDate dtnascimento, String cpf, double salario, SecretariaAdministrativa secretaria) {
        super(nome, rg, dtnascimento, cpf, salario);
        this.secretaria =
                new SecretariaAdministrativa(
                        secretaria.nome,
                        secretaria.rg,
                        secretaria.dtNascimento,
                        secretaria.cpf,
                        secretaria.salario
                        );
    }

    @Override
	public String toString() {
		return "\nGerente "
				+ "\nCPF = " + cpf 
				+ "\nSalario = " + salario 
				+ "\nNome = " + nome 
				+ "\nRG = " + rg
				+ "\nData de Nascimento = " + dtNascimento 
				+ "\nBonificação = " + getBonificacao() 
				+ secretaria.toString();
	}

	@Override
	public double getBonificacao() {
		return this.salario *3;
	}
}