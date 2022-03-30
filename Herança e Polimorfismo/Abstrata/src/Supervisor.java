import java.time.LocalDate;
public class Supervisor extends Gerente{

	public Supervisor(String nome, String rg, LocalDate dtnascimento, String cpf, double salario,
			SecretariaAdministrativa secretaria) {
		super(nome, rg, dtnascimento, cpf, salario, secretaria);
	}
	 @Override
		public String toString() {
			return "\nSupervisor "
					+ "\nCPF = " + cpf 
					+ "\nSalario = " + salario 
					+ "\nNome = " + nome 
					+ "\nRG = " + rg
					+ "\nData de Nascimento = " + dtNascimento 
					+ "\nBonificação = " + getBonificacao() 
					+ secretaria.toString();
	 }		
}
