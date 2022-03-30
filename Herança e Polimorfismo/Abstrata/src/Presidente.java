import java.time.LocalDate;

public class Presidente extends Funcionario {
    SecretariaExecutiva secretaria;
    public Presidente(String nome, String rg, LocalDate dtnascimento, String cpf, double salario, SecretariaExecutiva secretaria) {
        super(nome, rg, dtnascimento, cpf, salario);
        this.secretaria =
                new SecretariaExecutiva(
                        secretaria.nome,
                        secretaria.rg,
                        secretaria.dtNascimento,
                        secretaria.cpf,
                        secretaria.salario
                        );
    }

	@Override
	public String toString() {
		return "\nPresidente "
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
		return this.salario *5;
	}
}